package com.udla.edu.ec.estudiante;

import com.udla.edu.ec.base.Persona;

public class Estudiante extends Persona implements Comparable<Estudiante> {

	public static boolean ORDEN_ASCENDENTE = false;
	private int code;

	public Estudiante() {
		System.out
				.println("***** Se crea un estudiante con constructor Estudiante()*****");
	}

	public Estudiante(String nombre, String apellido, String cedula) {
		System.out
				.println("***** Se crea un estudiante con constructor Estudiante(String nombre, String apellido, String cedula)*****");
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public Estudiante(int code, String nombre, String apellido, String cedula) {
		System.out
				.println("***** Se crea un estudiante con constructor Estudiante(String nombre, String apellido, String cedula)*****");
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code * 2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Estudiante o) {
		if (ORDEN_ASCENDENTE)
			return (this.nombre + this.apellido).compareTo(o.getNombre()
					+ o.getApellido());
		else
			return ((this.nombre + this.apellido).compareTo(o.getNombre()
					+ o.getApellido()) * -1);
		// return this.nombre.compareTo(o.getNombre());
		/*
		 * if (o.code > this.code) return -1; else if (o.code < this.code)
		 * return 1; else return 0;
		 */
	}

	@Override
	public String toString() {
		return this.code + " " + this.nombre + " " + this.apellido;
	}

	@Override
	public int hashCode() {
		return this.nombre.hashCode();// * this.code;

	}

}
