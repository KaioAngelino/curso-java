///**
// * 
// */
//package com.joaomcode.view;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import com.joaomcode.DAL.Conexao;
//
///**
// * @author joaomcode
// *
// */
//public class TesteData {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//
//		LocalDateTime data = LocalDateTime.now();
//
//		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm:ss");
//		DateTimeFormatter d3 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
//
//		try {
//			Connection con = Conexao.getConexao();
//			String inserir = "INSERT INTO tempo(data,hora,acesso) values(?,?,?)";
//			PreparedStatement stm = con.prepareStatement(inserir);
//			stm.setString(1, data.format(d1));
//			stm.setString(2, data.format(d2));
//			stm.setString(3, data.format(d3));
//			
//			stm.execute();
//			stm.close();
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}
