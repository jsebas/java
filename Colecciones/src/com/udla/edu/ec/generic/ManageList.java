package com.udla.edu.ec.generic;

import java.util.ArrayList;
import java.util.List;

public class ManageList<K> {

	private List<K> list;

	public ManageList() {
		this.list = new ArrayList<K>();
	}

	public void addOject(K object) {
		this.list.add(object);
	}

	public K getObject(int index) {
		return this.list.get(index);
	}

	public int getSize() {
		return this.list.size();
	}

}
