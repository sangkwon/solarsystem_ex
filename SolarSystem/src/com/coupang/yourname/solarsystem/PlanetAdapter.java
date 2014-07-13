package com.coupang.yourname.solarsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.coupang.lecture.data.Planet;

import java.util.List;

public class PlanetAdapter extends BaseAdapter {

	private Context mContext;
	private List<Planet> planets;

	public PlanetAdapter(Context context, List<Planet> planets) {
		mContext = context;
		this.planets = planets;
	}

	@Override
	public int getCount() {
		if (planets == null) {
			return 0;
		}
		return planets.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = LayoutInflater.from(mContext);
		View view = inflater.inflate(R.layout.row_planet, parent, false);

		TextView name = (TextView) view.findViewById(R.id.name);
		TextView distance = (TextView) view.findViewById(R.id.distance);
		ImageView image = (ImageView) view.findViewById(R.id.image);

		Planet planet = planets.get(position);
		name.setText(planet.getName());
		distance.setText(planet.getDistance() + "AU");
		image.setImageResource(planet.getImage());

		return view;
	}

}
