package com.generic.methods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.java.generics.student.Student;

public final class DriverClass {

	public static void main(String[] args) throws ClassNotFoundException {
		NonGenericClass.genericMethod(new Integer(1994));
		NonGenericClass.genericMethod("I am String");
		NonGenericClass.genericMethod(new Double(24.94));
		NonGenericClass.genericMethod(new Student().getClass());
		
		int localValue =5;
		
		caculate(localValue);
		DriverClass driverClass = new  DriverClass();
		
		/*
		 * Class<?> c = Class.forName("com.generic.methods.NonGenericClass");
		 * 
		 * Method methos[] = c.getDeclaredMethods(); Field field[] =
		 * c.getDeclaredFields();
		 * 
		 * for(Method m : methos) System.out.println(m); for(Field f : field)
		 * System.out.println(f);
		 */
	}
	public static void caculate(int calcValue) {
		calcValue = calcValue * 100;
		System.out.println("#### "+calcValue);
		
		String s1 = new String("ram");
		String s2 = new String ("ram");
		String s3="ram";
		
		s1.concat("yewale");
		System.out.println(s1);
		
		System.out.print("s1==s2:");
		System.out.println("s1==s2: "+s1==s2);
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println(s1.hashCode()+" : "+s2.hashCode());
		
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
	}

}




