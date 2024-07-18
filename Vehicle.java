package com.javacore.java;

abstract class Vehicle {
	abstract void startEngine();
	abstract void stopEngine();
}

	class Car extends Vehicle
	{

		@Override
		void startEngine() {
			System.out.println("Car Engine Starts..");
			
		}

		@Override
		void stopEngine() {
			System.out.println("Car Engine Stops..");
			
		}
		
		
	}
	class Motorcycle extends Vehicle{
		
	@Override
	void startEngine() {
		System.out.println("Motorcycle Engine Starts..");
		
	}


	@Override
	void stopEngine() {
		System.out.println("Motorcycle Engine Stops..");

		
	}

	public static void main(String[] args) {
		
		Car c = new Car();
		Motorcycle mc = new Motorcycle();
		
		c.startEngine();
		c.stopEngine();
		mc.startEngine();
		mc.stopEngine();
		
		
		}

	}

	

