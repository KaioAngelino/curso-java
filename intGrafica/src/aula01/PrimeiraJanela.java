package aula01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PrimeiraJanela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraJanela frame = new PrimeiraJanela();
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
	public PrimeiraJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(22, 23, 66, 15);
		contentPane.add(lblNome);

		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(177, 23, 88, 15);
		contentPane.add(lblSobrenome);

		txtNome = new JTextField();
		txtNome.setBounds(22, 50, 124, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(177, 50, 124, 19);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);

		// Instanciamento de um arraylist
		ArrayList<String> nomeCompleto = new ArrayList<String>();

		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() { // addActionListener captador de eventos
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("Hello World");
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();

				JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
				// Adiciona ao arraylist nomeCompleto
				nomeCompleto.add(nome + " " + sobrenome);

				// Limpar os nomes e sobrenomes Digitados
				txtNome.setText("");
				txtSobrenome.setText("");

				// Seta o foco no textField txtNome
				txtNome.requestFocus();
			}
		});
		btnExecutar.setBounds(22, 102, 124, 25);
		contentPane.add(btnExecutar);

		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (String s : nomeCompleto) {
					System.out.println(s);
				}

				String nomes = "";
				for (String nome : nomeCompleto) {
					nomes += nome + "\n";
				}
				JOptionPane.showMessageDialog(null, nomes);
			}
		});
		btnVisualizar.setBounds(177, 102, 124, 25);
		contentPane.add(btnVisualizar);
	}
}
