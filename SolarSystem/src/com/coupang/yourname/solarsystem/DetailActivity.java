package com.coupang.yourname.solarsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.coupang.lecture.data.Planet;
import com.coupang.lecture.data.PlanetHolder;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);

		Intent intent = getIntent();
		int index = intent.getIntExtra("index", 0);

		Planet planet = PlanetHolder.getInstance().get(index);

		TextView nameView = (TextView) findViewById(R.id.name);
		TextView distanceView = (TextView) findViewById(R.id.distance);
		ImageView imageView = (ImageView) findViewById(R.id.image);

		nameView.setText(planet.getName());
		distanceView.setText(planet.getDistance() + "AU");
		imageView.setImageResource(planet.getImage());
	}

}
