package com.sarah;

public class Strings implements Violin, Cello {

	public void notes() {
		System.out.println("I play notes!");
	}

	public void sound() {
		System.out.println("pluck plucking noise");
	}

//	public void tuning() {
//		System.out.println("Tuning the strings");
//	}

	public void carrying() {
		System.out.println("Cellos are big!");
	}
	
	@Override
	public void tuning() {
		System.out.println("TestingTheABSTRACTTTT");
	}
	
}
