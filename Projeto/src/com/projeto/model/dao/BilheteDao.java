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

public class BilheteDao {

	public static void addBilhete(Bilhete bilhete, Connection con) {

		String sql = "insert into bilhete(numero,data_embarque,local_partida,destino,tipo_bilhete, situacao_bilhete) values(?,?,?,?,?,?)";

		LocalDateTime data = bilhete.getDataEmbarque();

		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, bilhete.getNumero());
			stmt.setString(2, data.format(d1));
			stmt.setString(3, bilhete.getLocalPartida());
			stmt.setString(4, bilhete.getDestino());
			stmt.setInt(5, bilhete.getTipoBilhete());
			stmt.setInt(6, bilhete.getSituacaoBilhete());

			stmt.execute();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Bilhete> listarBilhete(Connection con) {

		ArrayList<Bilhete> bilhetes = new ArrayList<>();

		try {
			PreparedStatement stmt = con.prepareStatement("select * from bilhete");

			ResultSet rs = stmt.executeQuery();

			LocalDateTime data = LocalDateTime.now();

			DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

			while (rs.next()) {

				data = data.parse(rs.getString(3), dt);
				// a consertar
				Bilhete bil = new Bilhete(rs.getLong(1), rs.getString(2), data, rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7));
				/*
				 * bilhete.setId(rs.getLong(1));
				 * bilhete.setNumero(rs.getString(2));
				 * bilhete.setDataEmbarque(rs.getDate(3).toInstant().atZone(
				 * ZoneId.systemDefault()).toLocalDateTime());
				 * bilhete.setLocalPartida(rs.getString(4));
				 * bilhete.setDestino(rs.getString(5));
				 * bilhete.setTipoBilhete(rs.getInt(6));
				 * bilhete.setSituacaoBilhete(rs.getInt(7));
				 */
				bilhetes.add(bil);

			}

			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bilhetes;

	}

	public static void updateBilhete(Bilhete bilhete, Connection con) {

		String sql = "update bilhete set numero=? , data_embarque=?, local_partida=?,"
				+ " destino=?, tipo_bilhete=?, situacao_bilhete=? where id=?";

		LocalDateTime data = LocalDateTime.now();

		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		try {

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, bilhete.getNumero());
			stmt.setString(2, bilhete.getDataEmbarque().format(dt));
			stmt.setString(3, bilhete.getLocalPartida());
			stmt.setString(4, bilhete.getDestino());
			stmt.setInt(5, bilhete.getTipoBilhete());
			stmt.setInt(6, bilhete.getSituacaoBilhete());
			stmt.setLong(7, bilhete.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Operação realizada com sucesso");

	}

	public static void deleteBilhete(long num, Connection con) {

		try {

			PreparedStatement stmt = con.prepareStatement("delete from bilhete where id=?");

			stmt.setLong(1, num);
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exclusão realizada com sucesso.");
	}

}
