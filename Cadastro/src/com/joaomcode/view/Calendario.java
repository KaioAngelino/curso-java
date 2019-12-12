package com.joaomcode.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.joaomcode.DAL.Conexao;
import com.toedter.calendar.JDateChooser;

public class Calendario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendario frame = new Calendario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calendario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(150, 29, 130, 19);
		contentPane.add(dateChooser);

		JButton btnAperteAqui = new JButton("Aperte Aqui!");
		btnAperteAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LocalDateTime data = dateChooser.getCalendar().getTime().toInstant().atZone(ZoneId.systemDefault())
						.toLocalDateTime();
				DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm:ss");
				DateTimeFormatter d3 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

				try {
					Connection con = Conexao.getConexao();
					String inserir = "INSERT INTO tempo(data,hora,acesso) values(?,?,?)";
					PreparedStatement stm = con.prepareStatement(inserir);
					stm.setString(1, data.format(d1));
					stm.setString(2, data.format(d2));
					stm.setString(3, data.format(d3));

					stm.execute();
					stm.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnAperteAqui.setBounds(166, 104, 135, 25);
		contentPane.add(btnAperteAqui);
	}
}
