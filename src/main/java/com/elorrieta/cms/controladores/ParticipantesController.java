package com.elorrieta.cms.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elorrieta.cms.modelo.Participante;
import com.elorrieta.cms.modelo.dao.ParticipanteDAO;

/**
 * Servlet implementation class ParticipantesController
 */
@WebServlet("/participantes")
public class ParticipantesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recoger parametros, no tenemos
		String paramId = request.getParameter("id");
		String paramEliminar = request.getParameter("op");

		if (paramId == null) { // listar

			// logica de negocio, conseguir coleccion de Participantes

			ArrayList<Participante> lista = ParticipanteDAO.getAll();

			// enviar atributos para pintar
			request.setAttribute("participantes", lista);

			// ir a la vista
			request.getRequestDispatcher("participantes.jsp?page=participantes").forward(request, response);

		} else { // ir al formulario y mostrar datos

			int id = Integer.parseInt(paramId);

			if (paramEliminar != null) {

				try {
					ParticipanteDAO.delete(id);
					request.setAttribute("mensajeTipo", "warning");
					request.setAttribute("mensaje", "Eliminado Participante");
				} catch (Exception e) {
					request.setAttribute("mensajeTipo", "danger");
					request.setAttribute("mensaje", "No se puede Eliminar");
					e.printStackTrace();
				}
				ArrayList<Participante> lista = ParticipanteDAO.getAll();
				request.setAttribute("participantes", lista);
				request.getRequestDispatcher("participantes.jsp?page=participantes").forward(request, response);

			} else {

				Participante p = new Participante();

				if (id > 0) { // ya existe, por lo cual lo recupero de la bbdd

					p = ParticipanteDAO.getById(id);
				}

				request.setAttribute("participante", p);
				request.getRequestDispatcher("formulario.jsp").forward(request, response);

			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String email = request.getParameter("email");
		String avatar = request.getParameter("avatar");

		Participante p = new Participante();
		p.setId(id);
		p.setNombre(nombre);
		p.setApellidos(apellidos);
		p.setEmail(email);
		p.setAvatar(avatar);

		try {
			if (id == 0) {
				ParticipanteDAO.insert(p);
			} else {
				ParticipanteDAO.update(p);
			}

			request.setAttribute("mensaje", "Datos Guardados");

		} catch (Exception e) {
			request.setAttribute("mensaje", "El email esta repetido");

		} finally {
			request.setAttribute("participante", p);
			request.getRequestDispatcher("formulario.jsp").forward(request, response);
		}

	}

}