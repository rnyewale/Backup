package com.generic.methods;

public class NonGenericClass {

	public static <T> void genericMethod(T userDefineType) {
		T anyType = userDefineType;
		
		System.out.println("This time : "+anyType);
	}
}
