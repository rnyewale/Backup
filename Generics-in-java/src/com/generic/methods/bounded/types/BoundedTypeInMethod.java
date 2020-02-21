package com.generic.methods.bounded.types;

public class BoundedTypeInMethod {

	public static  <T extends Number> void printNumber(T[] t) {
		for(T element : t)
			System.out.println(element);
	}
}
