package com.elorrieta.cms.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elorrieta.cms.modelo.Raza;
import com.elorrieta.cms.modelo.dao.PerroDAO;
import com.elorrieta.cms.modelo.dao.RazaDAO;

/**
 * Servlet implementation class ParticipantesController
 */
@WebServlet("/perro")
public class PerrosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recoger parametros, no tenemos

		// logica de negocio, conseguir coleccion de Perros

		// enviar atributos para pintar
		request.setAttribute("razas", RazaDAO.getAll());
		request.setAttribute("perros", PerroDAO.getAll());

		// ir a la vista
		request.getRequestDispatcher("perros.jsp?page=perros").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recoger parametros

		int idraza = Integer.parseInt(request.getParameter("idraza"));

		// Crear Perro y Raza, para la insert no necesito el nombre de la raza
		Raza r = new Raza();
		r.setId(idraza);

		doGet(request, response);
	}
}