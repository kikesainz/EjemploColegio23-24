package com.kike.colegio.dtos;


public class AlumnoDTO  {

	private Integer id;
	private String nombre;
	private String apellido;
	private String municipio;
	
	public AlumnoDTO(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public AlumnoDTO(Integer id, String nombre, String apellido, String municipio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.municipio = municipio;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
