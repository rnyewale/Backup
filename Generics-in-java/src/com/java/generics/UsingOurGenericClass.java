package com.java.generics;

public class UsingOurGenericClass {

	public static void main(String[] args) {
		GenericsInJava<String> stringType = new GenericsInJava<String>(new String());

		stringType.setT("now it is only associated with string type .. else throw as CE.");

		System.out.println(stringType.getT());
	}

}
