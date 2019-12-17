/**
 * 
 */
package com.projeto.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author joaomcode
 *
 */
public class Conexao {

	public static Conexao conexao;

	public static Conexao getInstance() {
		if (conexao == null) {
			conexao = new Conexao();
		}
		return conexao;
	}

	public static Connection getConexao() throws SQLException {
		String banco = "db_agencia";
		String url = "jdbc:mysql://localhost/" + banco;
		String user = "root";
		String pass = "utd123456";
		return DriverManager.getConnection(url, user, pass);
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(getInstance().getConexao());
	}

}
