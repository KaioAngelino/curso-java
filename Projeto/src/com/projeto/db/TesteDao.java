/**
 * 
 */
package com.projeto.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.Month;

import com.projeto.model.dao.BilheteDao;
import com.projeto.model.ov.Bilhete;

/**
 * @author joaomcode
 *
 */
public class TesteDao {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.getConexao();

		LocalDateTime data = LocalDateTime.of(2020, Month.JULY, 15, 7, 10, 30);

		Bilhete b1 = new Bilhete("1234", data, "Ceará", "Holanda", 1, 1);

//		BilheteDao.addBilhete(b1, con);

		for (Bilhete bilhete : BilheteDao.listarBilhete(con)) {

		}

	}

}
