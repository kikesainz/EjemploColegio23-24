package com.kike.colegio.controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.negocio.impl.AlumnosService;
import com.kike.colegio.utils.DBUtils;





@WebServlet("/alumnos/obtenertodosalumnos")
public class ControladorPruebaConexionBBDD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(ControladorPruebaConexionBBDD.class) ; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorPruebaConexionBBDD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

	
			try {
				request.setAttribute("listaAlumnos", new AlumnosService().obtenerTodosAlummnos());
			} catch (ClassNotFoundException | SQLException | NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos.jsp");
			d.forward(request, response);		
		
	
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
