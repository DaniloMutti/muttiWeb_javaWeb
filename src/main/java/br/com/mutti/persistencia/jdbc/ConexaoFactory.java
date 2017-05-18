package br.com.mutti.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/muttiWeb","postgres","mutti81070081");
		} catch (SQLException e) {
			//relancando a exception
			throw new RuntimeException(e);
		}
	}

}
