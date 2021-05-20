package com.elorrieta.cms.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.elorrieta.cms.modelo.Participante;

/**
 * Clase encargada relacionar el POJO con la Tabla DAO Data Access Object
 * 
 * @author Admin
 *
 */
public class ParticipanteDAO {

	/**
	 * Consulta la tabla 'participante' para recuperar todos y devolverlos en una
	 * coleccion
	 * 
	 * @return Lista con todos los participantes de la bbdd
	 * @throws Exception
	 */
	public static ArrayList<Participante> getAll() {

		ArrayList<Participante> coleccion = new ArrayList<Participante>();
		String sql = "SELECT id, nombre, apellidos, email, avatar FROM participante ORDER BY id ASC; ";

		try (

				Connection con = ConnectionHelper.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery(); // lanza la consulta SQL y obtiene Resultados RS

		) {

			while (rs.next()) { // itero sobre los resultados de la consulta SQL

				// creamos un nuevo Objeto y lo seteamos con los valores del RS
				Participante p = new Participante();

				// cogemos los valres de las columnas
				int colId = rs.getInt("id");
				String colNombre = rs.getString("nombre");
				String colApellidos = rs.getString("apellidos");

				p.setId(colId);
				p.setNombre(colNombre);
				p.setApellidos(colApellidos);
				p.setEmail(rs.getString("email"));
				p.setAvatar(rs.getString("avatar"));

				// añadir objeto al ArrayList
				coleccion.add(p);

			}
			// fin del bucle, ya no quedan mas lineas para leer

		} catch (Exception e) {
			e.printStackTrace();
		}

		return coleccion;
	}

}