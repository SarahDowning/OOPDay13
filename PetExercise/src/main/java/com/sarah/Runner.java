package com.sarah;

public class Runner {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();

		cat.makeNoise();
		dog.makeNoise();

		cat.doThing();
		dog.doThing();

	}
}
