package com.udla.edu.ec.main;

import java.util.ArrayList;
import java.util.List;

import com.udla.edu.ec.base.Persona;
import com.udla.edu.ec.estudiante.Estudiante;
import com.udla.edu.ec.generic.GenericExample;
import com.udla.edu.ec.generic.ManageList;

public class MainCollection {

	public static void main(String[] args) {
		Persona p1 = new Persona();

		// Declarando una lista no segura.
		List list = new ArrayList();
		list.add(p1);
		Persona p3 = (Persona) list.get(0);
		// System.out.println("El tamanio de la lista es: " + list.size());
		/*
		 * String str = (String)list.get(0); System.out.println("el valor del
		 * str es" + str);
		 */

//		List<Persona> list2 = new ArrayList<Persona>();
//		Persona p4 = new Persona();
//		list2.add(p4);
//		Persona p2 = list2.get(0);
//
//		GenericExample<List<Estudiante>, Persona> genericExample = new GenericExample<List<Estudiante>, Persona>(
//				new ArrayList<Estudiante>(), new Persona());
		ManageList<Persona> manageList = new ManageList<Persona>();
		manageList.addOject(new Persona());
		manageList.addOject(new Persona());
		System.out.println(manageList.getSize());

	}

}
