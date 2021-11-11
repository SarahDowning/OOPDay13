package com.sarah;

public abstract class Instrument extends Strings {
	
	// child class
	
	@Override
	public void sound() {
		System.out.println("Super pluck plucking noise");
	}
	
	public abstract void newMusic();
	
}
