package com.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsurio = new JMenu("Usuário");
		menuBar.add(mnUsurio);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame telaCadastro = new TelaCadastro();
				
				telaCadastro.setVisible(true);
				
//				dispose();
			}
		});
		mntmCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnUsurio.add(mntmCadastrar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mntmAlterar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnUsurio.add(mntmAlterar);
		
		JMenuItem mntmDeletar = new JMenuItem("Deletar");
		mntmDeletar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, InputEvent.CTRL_MASK));
		mnUsurio.add(mntmDeletar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnUsurio.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOie = new JLabel("Oie");
		lblOie.setBounds(159, 129, 66, 15);
		contentPane.add(lblOie);

		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame telaLogin = new Login();

				telaLogin.setVisible(true);

				dispose();
			}
		});
		btnDeslogar.setBounds(133, 176, 114, 25);
		contentPane.add(btnDeslogar);
	}
}
