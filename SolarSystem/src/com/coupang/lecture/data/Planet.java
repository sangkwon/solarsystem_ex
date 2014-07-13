package com.coupang.lecture.data;

public class Planet {

	private String name;
	private int image;
	private float distance;

	public Planet(String name, float distance, int image) {
		this.name = name;
		this.distance = distance;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public float getDistance() {
		return distance;
	}

	public int getImage() {
		return image;
	}

}
