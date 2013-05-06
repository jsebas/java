package com.udla.edu.ec.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.udla.edu.ec.estudiante.Estudiante;

public class MainOrderCollections {
	public static void main(String[] args) {
		// Ejemplo de strings
		// List<String> strings = new ArrayList<String>();
		// strings.add("Alvarez");
		// strings.add("Velasquez");
		// strings.add("Gonzalez");
		// System.out.println(strings.toString());
		// Collections.sort(strings);
		// System.out.println(strings.toString());

		// List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		// estudiantes.add(new Estudiante(1, "Diego", "Gavilanes",
		// "1714844888")); // Óbjeto
		// // anónimo
		// estudiantes
		// .add(new Estudiante(2, "Santiago", "Gonzalez", "1714844888")); //
		// Óbjeto
		// estudiantes.add(new Estudiante(3, "Angel", "Aviles", "1714844888"));
		// // Óbjeto

		// anónimo

		// System.out.println(estudiantes.toString());
		// // anónimo
		// Collections.sort(estudiantes);
		// System.out.println(estudiantes.toString());

		// Ordernamiento ascendente
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante(1, "Diego", "Gavilanes", "1714844888")); // Óbjeto
		// anónimo
		estudiantes
				.add(new Estudiante(2, "Santiago", "Gonzalez", "1714844888")); //
		estudiantes.add(new Estudiante(3, "Angel", "Aviles", "1714844888"));
		estudiantes.add(new Estudiante(4, "Angel", "Abiles", "1714844888"));
		Estudiante.ORDEN_ASCENDENTE = true;
		Collections.sort(estudiantes);
		System.out.println(estudiantes.toString());
		Estudiante.ORDEN_ASCENDENTE = false;
		Collections.sort(estudiantes);
		System.out.println(estudiantes.toString());

	}
}
