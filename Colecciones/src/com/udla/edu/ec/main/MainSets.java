package com.udla.edu.ec.main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.udla.edu.ec.estudiante.Estudiante;

public class MainSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Set<String> set = new TreeSet<String>();
		// set.add("Jorge");
		// set.add("Santiago");
		// set.add("Gavilanes");
		// set.add("Santiago");
		// set.add("Gavilanes");
		// System.out.print(set.toString());
	
		Estudiante.ORDEN_ASCENDENTE = true;
		Set<Estudiante> estudiantes = new TreeSet<Estudiante>();
		estudiantes.add(new Estudiante(1, "Diego", "Gavilanes", "1714844888")); // Óbjeto
		estudiantes.add(new Estudiante(1, "Diego", "Gavilanes", "1714844888")); // Óbjeto
		estudiantes.add(new Estudiante(2, "Diego", "Gavilanes", "1714844888")); // Óbjeto
		// anónimo
		estudiantes
				.add(new Estudiante(2, "Santiago", "Gonzalez", "1714844888")); //
		estudiantes
		.add(new Estudiante(2, "Santiago", "Gonzalez", "1714844888")); //
		estudiantes.add(new Estudiante(3, "Angel", "Aviles", "1714844888"));
		estudiantes.add(new Estudiante(4, "Angel", "Abiles", "1714844888"));
		System.out.print(estudiantes.toString());

	}

}
