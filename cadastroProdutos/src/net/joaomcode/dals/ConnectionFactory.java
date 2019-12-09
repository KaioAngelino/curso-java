/**
 * 
 */
package net.joaomcode.dals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * Class ConnectionFactory
 * 
 * @version 1.0
 * 
 *          Date 04/Dez/19
 * 
 * @author joaomcode
 * 
 *         Copyright notice Classe que realiza a conexão com o banco de dados
 *         MySQL
 *
 */
public class ConnectionFactory {

	public static Connection _CONEXAO = null;

	/**
	 * 
	 * */
	public static void conectar() {
		String usuario = "root";
		String senha = "123";
		String banco = "";
		String caminho = "jdbc:mysql://localhost" + banco;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			try {
				_CONEXAO = DriverManager.getConnection(caminho, usuario, senha);
			} catch (SQLException e) {
				System.out.println("Conexão Falhou!!!");
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Conexão com o Driver falhou!");
			e.printStackTrace();
		}

	}

	public static void desconectar() {
		try {
			_CONEXAO.close();
			System.out.println("Desconectando");
		} catch (SQLException e) {
			System.out.println("Conexão não fechada!");
			e.printStackTrace();
		}
	}
}
