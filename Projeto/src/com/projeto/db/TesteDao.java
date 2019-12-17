package com.projeto.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.projeto.model.dao.BilheteDao;
import com.projeto.model.ov.Bilhete;

public class TesteDao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.getConexao();

		LocalDateTime data = LocalDateTime.now();

		Bilhete b1 = new Bilhete("1234", data, "Ceará", "Holanda", 1, 1);

		Bilhete b2 = new Bilhete(7, "98765", data, "Ceará", "Austrália", 2, 3);

		// BilheteDao.updateBilhete(b2, con);

		// BilheteDao.addBilhete(b1, con);
		/*
		 * for(Bilhete bilhete : BilheteDao.listarBilhete(con)){
		 * 
		 * System.out.print(bilhete.getId()+" ");
		 * System.out.print(bilhete.getNumero()+" ");
		 * System.out.print(bilhete.getDataEmbarque()+" ");
		 * System.out.print(bilhete.getLocalPartida()+" ");
		 * System.out.print(bilhete.getDestino()+" ");
		 * System.out.print(bilhete.getTipoBilhete()+" ");
		 * System.out.println(bilhete.getSituacaoBilhete());
		 * 
		 * }
		 */
		BilheteDao.deleteBilhete(7, con);
	}
}