package com.kike.colegio.dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.kike.colegio.dtos.AlumnoDTO;

public interface AlumnosDAO {
	
	public List<AlumnoDTO> obtenerTodosAlumnos() throws ClassNotFoundException, SQLException, NamingException;
	
	public List<AlumnoDTO> buscarAlumnos(String id, String nombre, String apellido, String activo, String famNumerosa)throws ClassNotFoundException, SQLException, NamingException;

}
