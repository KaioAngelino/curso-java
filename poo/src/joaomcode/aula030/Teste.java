package joaomcode.aula030;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = Conexao.getConnection();
		
		String sql = "insert into produto(nome, quantidade, valor) values (?,?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setString(1, "Melancia");
		stmt.setInt(2, 11);
		stmt.setDouble(3, 8.75);
		
		stmt.execute();
		stmt.close();
		
		con.close();

	}

}
