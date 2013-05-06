package com.udla.edu.ec.base;

public class Persona {
	
	

	protected String nombre = "";
	protected String apellido = "";
	protected String cedula = "";

	public Persona() {
		// System.out
		// .println("***** Se crea la persona con constructor Persona()*****");
		// this.apellido = "";
		// this.nombre = "";
		

	}

	public Persona(String nombre, String apellido) {
		System.out
				.println("***** Persona(String nombre,String apellido) *****");
		this.apellido = apellido;
		this.nombre = nombre;

	}
	
	/*public Persona(String nombre, String apellido, String cedula) {
		System.out
				.println("***** Se crea un estudiante con constructor Persona(String nombre, String apellido, String cedula)*****");
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;

	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
