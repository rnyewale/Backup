package com.java.generics;

import java.util.ArrayList;

public class GenericsUseInJava {

	public void nonGenericType() {
		ArrayList list = new ArrayList();
		list.add("It allows String..!");
		list.add(123);
		list.add(true);

		for (Object object : list) {
			String str = (String) object;
			System.out.println(str);

		}
	}

	public void genericType() {
		ArrayList<String> list = new ArrayList<>();
		list.add("It allows only String values.");
		list.add("THIS IS THE REAL POWER OF GENERICS. \nIF FOUND OTHER TYPE DATA IT WILL THROW AN COMPILETIME ERROR ITSELF...! ;)");
		
		for(String value : list) {
			String str = value;
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		GenericsUseInJava genericsUseInJava = new GenericsUseInJava();
		genericsUseInJava.genericType();
		//genericsUseInJava.nonGenericType();
	}

}
