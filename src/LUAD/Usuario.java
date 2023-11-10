package LUAD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
	Connection cx;

	public Usuario() {

	}

	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyect", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}

	public boolean insertar(DataUsu c) {
		PreparedStatement ps = null;
		try {
			ps = conectar().prepareStatement("INSERT INTO usuario VALUES (null,?,?)");
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getContraseña());
			ps.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean login(DataUsu x) {
		try {
			PreparedStatement ps = conectar().prepareStatement("SELECT * FROM usuario WHERE nombre=? AND contraseña=?");
			ps.setString(1, x.getNombre());
			ps.setString(2, x.getContraseña());
			ResultSet rs = ps.executeQuery();
			System.out.println("SQL:" + ps.toString());
			if (rs.next()) {
				x.setIdUsuario(rs.getInt(1));
				x.setNombre(rs.getString(2));
				x.setContraseña(rs.getString(3));
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
