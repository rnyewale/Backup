package com.java.generics;

public class GenericsInJava<T> {

	T anyType;

	public GenericsInJava(T t) {
		this.anyType = t;
	}

	public void setT(T anyType) {
		this.anyType = anyType;
	}
	
	public T getT() {
		return anyType;
	}
}
