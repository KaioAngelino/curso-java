/**
 * 
 */
package com.projeto.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.projeto.model.ov.Bilhete;

/**
 * @author joaomcode
 *
 */
public class BilheteDao {

	public static void addBilhete(Bilhete bilhete, Connection con) {
		String sql = "INSERT INTO bilhete(numero,data_embarque,local_partida,"
				+ "destino,tipo_bilhete,situacao_bilhete) values(?,?,?,?,?,?)";

		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		try {
			PreparedStatement stm = con.prepareStatement(sql);

			stm.setString(1, bilhete.getNumero());
			stm.setString(2, data.format(d1));
			stm.setString(3, bilhete.getLocalPartida());

			stm.setString(4, bilhete.getDestino());
			stm.setInt(5, bilhete.getTipoBilhete());
			stm.setInt(6, bilhete.getSituacaoBilhete());

			stm.execute();
			stm.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Bilhete> listarBilhete(Connection con) {
		ArrayList<Bilhete> bilhetes = new ArrayList<Bilhete>();
		try {
			PreparedStatement stm = con.prepareStatement("SELECT * FROM bilhete");
			ResultSet rs = stm.executeQuery();
			LocalDateTime data = LocalDateTime.now();
			while (rs.next()) {
				data = rs.getDate(3).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

				/*
				 * bilhete.setId(rs.getLong(1)); bilhete.setNumero(rs.getString(2));
				 * bilhete.setDataEmbarque(data); bilhete.setLocalPartida(rs.getString(4));
				 * bilhete.setDestino(rs.getString(5)); bilhete.setTipoBilhete(rs.getInt(6));
				 * bilhete.setSituacaoBilhete(rs.getInt(7));
				 */

				// Outro método

				Bilhete bil = new Bilhete(rs.getLong(1), rs.getString(2),
						rs.getDate(3).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7));

				bilhetes.add(bil);

//				bilhetes.add(bilhete);

			}
			stm.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bilhetes;
	}

}
