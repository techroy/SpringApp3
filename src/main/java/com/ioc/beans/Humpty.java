package com.ioc.beans;

public class Humpty {

	Dumpty dumpty;
	
	A a;

	public void setDumpty(Dumpty dumpty) {
		this.dumpty = dumpty;
	}

	public void showDumpty() {
		dumpty.m1();
	}

	public Humpty(Dumpty dumpty) {

		System.out.println("1 arg");
		this.dumpty = dumpty;
	}

	public Humpty(Dumpty dumpty, A a) {
		
		
		System.out.println("2 arg");
		this.dumpty = dumpty;
		this.a = a;
	}

	
	
}
