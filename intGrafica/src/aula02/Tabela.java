package aula02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabela extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField txtNome;
	private JTextField txtQtde;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabela frame = new Tabela();
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
	public Tabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(201, 24, 369, 211);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Quantidade", "Pre\u00E7o" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

		txtNome = new JTextField();
		txtNome.setBounds(24, 52, 124, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtQtde = new JTextField();
		txtQtde.setBounds(24, 110, 124, 19);
		contentPane.add(txtQtde);
		txtQtde.setColumns(10);

		txtPreco = new JTextField();
		txtPreco.setBounds(24, 169, 124, 19);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(24, 25, 66, 15);
		contentPane.add(lblNome);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(24, 83, 107, 15);
		contentPane.add(lblQuantidade);

		JLabel lblPreo = new JLabel("Preço");
		lblPreo.setBounds(24, 141, 66, 15);
		contentPane.add(lblPreo);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { txtNome.getText(), Integer.parseInt(txtQtde.getText()),
						Double.parseDouble(txtPreco.getText()) });
				
				txtNome.setText("");
				txtQtde.setText("");
				txtPreco.setText("");
				txtNome.requestFocus();
			}
		});
		btnAdicionar.setBounds(24, 210, 124, 25);
		contentPane.add(btnAdicionar);
	}
}
