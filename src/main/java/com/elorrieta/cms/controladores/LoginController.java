package com.elorrieta.cms.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elorrieta.cms.modelo.Usuario;
import com.elorrieta.cms.modelo.dao.UsuarioDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mensaje = "";
		String vista = "";

		// recoger parametros
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("contraseina");

		// logica de negocio
		Usuario usuario = UsuarioDAO.login(nombre, pass);

		if (usuario != null) {
			mensaje = "Ongi Etorri";
			vista = "participantes"; // nombre del controlador, no quiero ir a la JSP

		} else {
			mensaje = "Credenciales incorrectas, prueba de nuevo";
			vista = "index.jsp?page=login";
		}

		// enviar atributos para vistar
		request.setAttribute("mensaje", mensaje);

		// Ir a una vista
		request.getRequestDispatcher(vista).forward(request, response);

	}

}