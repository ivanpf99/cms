package com.elorrieta.cms.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elorrieta.cms.modelo.Perro;
import com.elorrieta.cms.modelo.dao.PerrosDAO;

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

		ArrayList<Perro> perros = PerrosDAO.getAll();

		// enviar atributos para pintar
		request.setAttribute("perros", perros);

		// ir a la vista
		request.getRequestDispatcher("perros.jsp?page=perros").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}