package com.projeto.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.projeto.db.Conexao;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(90, 105, 66, 15);
		contentPane.add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setBounds(174, 103, 124, 19);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(174, 157, 124, 19);
		contentPane.add(txtPassword);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(90, 159, 66, 15);
		contentPane.add(lblSenha);

		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = Conexao.getConexao();
					PreparedStatement stm = con
							.prepareStatement("SELECT login FROM usuario WHERE login = ? AND senha = ?");

					stm.setString(1, txtLogin.getText());
					stm.setString(2, new String(txtPassword.getPassword()));

					ResultSet rs = stm.executeQuery();

					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Logado com sucesso");

						JFrame telaPrincipal = new TelaPrincipal();

						telaPrincipal.setVisible(true);

						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Senha ou usuário errado");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnAcessar.setBounds(146, 188, 114, 25);
		contentPane.add(btnAcessar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = Conexao.getConexao();

					String sql = "INSERT INTO usuario (login,senha) VALUES (?,?)";

					PreparedStatement stm = con.prepareStatement(sql);

					stm.setString(1, txtLogin.getText());
					stm.setString(2, new String(txtPassword.getPassword()));

					stm.execute();
					stm.close();

					con.close();
					System.out.println("Cadastro realizado com sucesso");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCadastrar.setBounds(146, 225, 114, 25);
		contentPane.add(btnCadastrar);
	}
}
