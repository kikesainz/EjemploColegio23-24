package com.kike.colegio.dao.jdbcimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kike.colegio.controladores.ControladorPruebaConexionBBDD;
import com.kike.colegio.dao.AlumnosDAO;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.utils.DBUtils;

public class AlumnosDAOImplJdbc implements AlumnosDAO{
	private static final Logger logger = LoggerFactory.getLogger(AlumnosDAOImplJdbc.class) ; 

	@Override
	public List<AlumnoDTO> obtenerTodosAlumnos() throws ClassNotFoundException, SQLException, NamingException {
		ResultSet alumnosResultSet = null;
		List<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();
		Connection connection = DBUtils.conectaBBDD();
		
		Statement st = connection.createStatement();
		alumnosResultSet = st.executeQuery("SELECT * FROM alumnos");
		
		while(alumnosResultSet.next()) {
			listaAlumnos.add(new AlumnoDTO(alumnosResultSet.getInt(1), alumnosResultSet.getString(2)));
			logger.info("añadido alumno " + alumnosResultSet.getInt(1)+ " " + alumnosResultSet.getString(2)  );
		}
		
		return listaAlumnos;
	}

}
