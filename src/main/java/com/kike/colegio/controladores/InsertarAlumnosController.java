package com.kike.colegio.controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.kike.colegio.dao.ICombosDAO;
import com.kike.colegio.dao.jdbcimpl.CombosDAOImpl;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.dtos.ComboDTO;

@WebServlet("/alumnos/insertaralumnos")
public class InsertarAlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarAlumnosController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperamos el combo municipios
		List<ComboDTO> listaMunicipios = new ArrayList<>();
		ICombosDAO combosMunicipios = new CombosDAOImpl();
		try {
			listaMunicipios = combosMunicipios.recuperaCombosMunicipio();
		} catch (ClassNotFoundException | SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("comboMunicipios", listaMunicipios);
		
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/insertarAlumnos.jsp");
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
