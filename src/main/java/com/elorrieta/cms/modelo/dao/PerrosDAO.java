package com.elorrieta.cms.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.elorrieta.cms.modelo.Perro;

/**
 * Clase encargada relacionar el POJO con la Tabla DAO Data Access Object
 * 
 * @author Admin
 *
 */
public class PerrosDAO {

	/**
	 * Consulta la tabla 'participante' para recuperar todos y devolverlos en una
	 * coleccion
	 * 
	 * @return Lista con todos los participantes de la bbdd
	 * @throws Exception
	 */
	public static ArrayList<Perro> getAll() {

		ArrayList<Perro> perros = new ArrayList<Perro>();
		String sql = " SELECT  + "p.id, + "p.nombre, + "p.historia, + "r.nombre as raza, "
				+ "vacunaciones.id_vacuna " + " FROM perro AS p INNER JOIN raza AS r ON p.id_raza = r.id "
				+ "LEFT JOIN vacunaciones on p.id = vacunaciones.id_perro "
				+ "LEFT JOIN vacuna as v on vacunaciones.id_vacuna = v.id; ";
	

		try (

				Connection con = ConnectionHelper.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery(); // lanza la consulta SQL y obtiene Resultados RS

		) {

			while (rs.next()) { // itero sobre los resultados de la consulta SQL

				// creamos un nuevo Objeto y lo seteamos con los valores del RS
				Perro pe = new Perro();

				// cogemos los valres de las columnas
				int colId = rs.getInt("id");
				String colNombre = rs.getString("nombre");
				String colRaza = rs.getString("id_raza");
				String colHistoria = rs.getString("historia");
				String colVacunas = rs.getString("vacunas");

				pe.setId(colId);
				pe.setNombre(colNombre);
				pe.setRaza(colRaza);
				pe.setHistoria(colHistoria);
				pe.setVacunas(colVacunas);

				// añadir objeto al ArrayList
				perros.add(pe);

			}
			// fin del bucle, ya no quedan mas lineas para leer

		} catch (Exception e) {
			e.printStackTrace();
		}

		return perros;
	}

}