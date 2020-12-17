package org.achainarong.exercisenine;

public class Car {
	private final int maxSpeed;
	private final int tankSize;
	
	private int currenSpeed;
	private String currentPlace;
	private int remainingFuel:
	private boolean isEngineRunning;


	public Car(int maxSpeed, int tankSize) {
		this.maxSpeed = maxSpeed;
		this.tankSize = tankSize;

		System.out.println("maxspeed: " + this.maxSpeed);
		System.out.println("tankSize: " + this.tankSize);
	}


}
