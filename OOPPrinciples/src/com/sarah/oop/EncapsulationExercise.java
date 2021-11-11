package com.sarah.oop;

public class EncapsulationExercise {

	private String name;
	private int age;
	private double height;
	private float shoeSize;
	private long passportNo;
	
	// CONSTRUCTORS
	
	public EncapsulationExercise(String name, int age, double height, float shoeSize, long passportNo) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
		this.passportNo = passportNo;
	}

	
	public EncapsulationExercise() {
		
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", height=" + height + ", shoeSize=" + shoeSize
				+ ", passportNo=" + passportNo + "]";
	}
	
	// GETTERS AND SETTERS


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public float getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(float shoeSize) {
		this.shoeSize = shoeSize;
	}

	public long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}
	
}



