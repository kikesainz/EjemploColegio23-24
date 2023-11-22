package com.kike.colegio.negocio.impl;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.kike.colegio.dao.jdbcimpl.AlumnosDAOImplJdbc;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.negocio.IAlumnosService;

public class AlumnosService implements IAlumnosService{

	@Override
	public List<AlumnoDTO> obtenerTodosAlummnos() throws ClassNotFoundException, SQLException, NamingException {
		return new AlumnosDAOImplJdbc().obtenerTodosAlumnos();
	}

}
