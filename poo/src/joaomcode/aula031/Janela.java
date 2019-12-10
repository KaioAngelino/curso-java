package joaomcode.aula031;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtQtde;
	private JTextField txtPreco;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void listar() {
		try {
			// Criar conexão
			Connection con = Conexao.getConnection();
			// Criando variável com query sql
			String sql = "select * from produto;";
			// Criar statement passando a variável
			PreparedStatement stmt = con.prepareStatement(sql);
			// Criar um result set
			ResultSet rs = stmt.executeQuery();
			// Criar modelo de tabela
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			// Limpar colunas
			model.setNumRows(0); // Limpar tabela
			
			// printar cada linha do resultset enquanto ouver uma próxima
			while (rs.next()) {
				// Pode-se ser usado o nome do campo no banco, ou um número que especifique sua
				// posição na tabela
				model.addRow(new Object[] { rs.getInt("codigo"), rs.getString("nome"), rs.getInt(3), rs.getDouble(4) });
			}
			
			// Fechar o resultse
			rs.close();
			// Fechar a conexão
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("id");
		lblId.setBounds(12, 12, 66, 15);
		contentPane.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(12, 39, 124, 19);
		contentPane.add(txtId);
		txtId.setColumns(10);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(12, 70, 66, 15);
		contentPane.add(lblProduto);

		txtNome = new JTextField();
		txtNome.setBounds(12, 89, 124, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(12, 120, 97, 15);
		contentPane.add(lblQuantidade);

		txtQtde = new JTextField();
		txtQtde.setBounds(12, 147, 124, 19);
		contentPane.add(txtQtde);
		txtQtde.setColumns(10);

		JLabel lblPreo = new JLabel("Preço");
		lblPreo.setBounds(12, 178, 66, 15);
		contentPane.add(lblPreo);

		txtPreco = new JTextField();
		txtPreco.setBounds(12, 205, 124, 19);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(162, 12, 491, 381);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "id", "Produto", "Quantidade", "Pre\u00E7o" }) {
					Class[] columnTypes = new Class[] { Integer.class, String.class, Integer.class, Double.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		scrollPane.setViewportView(table);

		// Listar ao iniciar o programa
		listar();

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// Iniciar conexão
					Connection con = Conexao.getConnection();
					// Criar variável do tipo string com o comando a ser acessado pelo banco
					String sql = "insert into produto(nome,quantidade,valor) values (?,?,?);";
					// Criando Statement de conexão com o banco
					PreparedStatement stmt = con.prepareStatement(sql);

					stmt.setString(1, txtNome.getText());
					stmt.setInt(2, Integer.parseInt(txtQtde.getText()));
					stmt.setDouble(3, Double.parseDouble(txtPreco.getText()));

					// Executar o comando
					stmt.execute();
					// Fechar o statement
					stmt.close();
					// Fechar a conexão
					con.close();
					System.out.println("Operação realizada com sucesso");

				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				listar();
			}
		});
		btnAdicionar.setBounds(12, 257, 114, 25);
		contentPane.add(btnAdicionar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// Criar conexão
					Connection con = Conexao.getConnection();
					// Criar string com o comando para o banco
					String sql = "update produto set nome=?, quantidade=?, valor=? where codigo=?;";
					// Criar statement com a string
					PreparedStatement stmt = con.prepareStatement(sql);

					stmt.setString(1, txtNome.getText());
					stmt.setInt(2, Integer.parseInt(txtQtde.getText()));
					stmt.setDouble(3, Double.parseDouble(txtPreco.getText()));
					stmt.setInt(4, Integer.parseInt(txtId.getText()));

					stmt.execute();
					stmt.close();
					con.close();
//					System.out.println("Atualizado com sucesso");

				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				listar();

			}
		});
		btnUpdate.setBounds(12, 331, 114, 25);
		contentPane.add(btnUpdate);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				listar();

			}
		});
		btnListar.setBounds(12, 294, 114, 25);
		contentPane.add(btnListar);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Connection con = Conexao.getConnection();
					String sql = "delete from produto where codigo=?;";
					PreparedStatement stmt = con.prepareStatement(sql);

					stmt.setInt(1, Integer.parseInt(txtId.getText()));

					stmt.execute();
					stmt.close();
					con.close();
					System.out.println("Produto deletado com sucesso");

				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				listar();
			}
		});
		btnDelete.setBounds(12, 368, 114, 25);
		contentPane.add(btnDelete);
	}
}
