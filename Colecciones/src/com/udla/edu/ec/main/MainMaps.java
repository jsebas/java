package com.udla.edu.ec.main;

import java.util.Map;
import java.util.TreeMap;

public class MainMaps {

	public static void main(String[] args) {

		Map<Integer, String> mapExample = new TreeMap<Integer, String>();
		mapExample.put(1, "Santiago Gavilanes");
		mapExample.put(2, "Jorge Escobar");
		mapExample.put(2, "Jorge Revelo");
		mapExample.put(3, "Ivonne Granda");
		System.out.println(mapExample.toString());
		System.out.println("el valor de la clave 2 es: "
				+ mapExample.get(new Integer(2)));

		/*
		 * int a1 = 0; Integer a = a1;
		 */

	}

}
