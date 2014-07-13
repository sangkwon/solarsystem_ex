package com.coupang.yourname.solarsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.coupang.lecture.data.Planet;
import com.coupang.lecture.data.PlanetHolder;

import java.util.List;

public class SolarListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);

		List<Planet> planets = PlanetHolder.getInstance().listAll();

		ListView listView = (ListView) findViewById(R.id.list);
		listView.setAdapter(new PlanetAdapter(this, planets));

		listView.setOnItemClickListener(new PlanetClickListener());
	}

	class PlanetClickListener implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			Log.d("SolarListActivity", "onItemClick() " + position);

			Intent intent = new Intent(SolarListActivity.this, DetailActivity.class);
			intent.putExtra("index", position);
			startActivity(intent);
		}
	}

}
