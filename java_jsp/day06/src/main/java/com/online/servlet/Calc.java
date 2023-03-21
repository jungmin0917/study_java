package com.online.servlet;

public class Calc {
	int a;
	int b;
	
	public Calc() {};

	public Calc(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public double div(int a, int b) {
		return (double)(a) / b;
	}
}
