package com.sarah;

public class Runner {

	public static void main(String[] args) {
		
		Strings violin = new Strings();
		violin.notes();
		violin.sound();
		violin.tuning();
		
		System.out.println("");
		
		Strings cello = new Strings();
		cello.notes();
		cello.sound();
		cello.carrying();
		
		System.out.println("");
		
		Orchestra orchestra = new Orchestra();
		orchestra.sound();
		orchestra.newMusic();
		
	}

}
