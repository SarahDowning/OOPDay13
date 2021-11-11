package com.sarah.oop;

public class Runner {

	public static void main(String[] args) {
		
		EncapsulationExercise encapsulation = new EncapsulationExercise();
		
		encapsulation.setName("Sarah");
		encapsulation.setAge(26);
		encapsulation.setHeight(163.5d);
		encapsulation.setShoeSize(5.5f);
		encapsulation.setPassportNo(123456l);
		
		System.out.println(encapsulation.getName());
		System.out.println(encapsulation.getAge());
		System.out.println(encapsulation.getHeight());
		System.out.println(encapsulation.getShoeSize());
		System.out.println(encapsulation.getPassportNo());
		
		System.out.println(encapsulation.toString());

	}

}
