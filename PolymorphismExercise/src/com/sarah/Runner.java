package com.sarah;

public class Runner {

	public static void main(String[] args) {

		// Piano sub-class
		
		System.out.println("-----Piano Stuff!-----");
		
		Piano piano = new Piano();
		piano.sound();
		piano.practice();
		piano.badSound();
		
		System.out.println("");

		// Guitar sub-class
		
		System.out.println("-----Guitar Stuff!-----");
		
		Guitar guitar = new Guitar();
		guitar.noise();
		guitar.music();
		
		System.out.println("");
		
		// Instrument Class
		
		System.out.println("-----Instrument Stuff!-----");

		Instrument instrument = new Piano();
		instrument.music();
		
		System.out.println("");
		
		// Object creation
		
		System.out.println("-----Object Stuff!-----");

		Object object = new Piano();
		((Piano) object).sound();
		((Piano) object).music();
		
		Object object2 = new Guitar();
		((Guitar) object2).practice();
		
		System.out.println("");

	}

}
