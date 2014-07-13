package com.coupang.lecture.data;

import com.coupang.yourname.solarsystem.R;

import java.util.ArrayList;
import java.util.List;

public class PlanetHolder {

	private static PlanetHolder instance = new PlanetHolder();

	private List<Planet> planets;

	private PlanetHolder() {
		planets = new ArrayList<Planet>();

		planets.add(new Planet("수성", 0.4f, R.drawable.mercury));
		planets.add(new Planet("금성", 0.7f, R.drawable.venus));
		planets.add(new Planet("지구", 1.0f, R.drawable.earth));
		planets.add(new Planet("화성", 1.5f, R.drawable.mars));
		planets.add(new Planet("목성", 5.2f, R.drawable.jupiter));
		planets.add(new Planet("토성", 9.5f, R.drawable.saturn));
		planets.add(new Planet("천왕성", 19.2f, R.drawable.uranus));
		planets.add(new Planet("해왕성", 30f, R.drawable.neptune));
		//planets.add(new Planet("명왕성", 40f, R.drawable.pluto));

	}

	public static PlanetHolder getInstance() {
		return instance;
	}

	public List<Planet> listAll() {
		return planets;
	}

	public int size() {
		return planets.size();
	}

	public Planet get(int index) {
		return planets.get(index);
	}

}
