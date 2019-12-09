package joaomcode.aula031;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	// Criação da variável estática conexão
	public static Conexao conexao;
	
	// Instanciando a conexão
	public static Conexao getInstance() {
		if (conexao == null) {
			conexao = new Conexao();
		}
		return conexao;
	}
	
	// Criar método getConnection que retorna uma Connection
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// Nome do driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Endereço e parâmetros de conexão com o banco
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_lojaJava", "root", "123");
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getInstance().getConnection());
			System.out.println("deu certo pivete");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
