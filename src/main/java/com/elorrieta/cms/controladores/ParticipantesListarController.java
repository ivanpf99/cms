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
@WebServlet("/participantes-listar")
public class ParticipantesListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 1000 usuarios de prueba for
	for
	int i = 0;(i<1000;i++)
	{
	  
	  Participante mock = new Participante();
	  mock.setNombre("MockNombre" + i);
	  mock.setEmail("mock" + i + "@otro.com");
	  mock.setApellidos("Apellidos" + i);
	  mock.setAvatar("https://randomuser.me/api/portraits/women/" + ((i % 5) + 1) +".jpg");
	  try { ParticipanteDAO.insert(mock); }
	 
	  catch (Exception e) { 
		  catch (block e.printStackTrace());  
	  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// logica de negocio, conseguir coleccion de Participantes

		ArrayList<Participante> lista = ParticipanteDAO.getAll();

		// enviar atributos para pintar
		request.setAttribute("participantes", lista);

		// ir a la vista
		request.getRequestDispatcher("participantes.jsp?page=participantes").forward(request, response);

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