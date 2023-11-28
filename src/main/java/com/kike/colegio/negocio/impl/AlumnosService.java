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

	@Override
	public List<AlumnoDTO> buscarAlumnos(String id, String nombre, String apellido, String activo, String famNumerosa)
			throws ClassNotFoundException, SQLException, NamingException {
		// TODO Auto-generated method stub
		return new AlumnosDAOImplJdbc().buscarAlumnos(id, nombre, apellido,  activo, famNumerosa);
	}

}
