package com.generic.methods.bounded.types;

import com.java.generics.student.Student;

public class DriverClass {

	public static void main(String[] args) {
		
		Integer[] integerType = new Integer[new Integer(5)];
		String[] stringType = new String[]{"one","two","three","four","five"};
		
		for(int i=0 ; i<integerType.length;i++) {
			integerType[i] = new Integer(1+i);
		   // System.out.print(integerType[i]+" ");
		}
		
		//bounded with Integer
		BoundedTypeInMethod.printNumber(integerType);
		
		//bounded with Double
		BoundedTypeInMethod.printNumber(new Double[] {24.11, 19.90,19.94,19.87});
		// this will throw an compile time error because method is Bounded with Number class type only and we are trying with String.
		//BoundedTypeInMethod.printNumber(stringType);
		
	}
}
