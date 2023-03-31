//Swim Entry Class
package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SwimEntry extends Entry {
	private String name;
	private Calendar dateAndTime;
	private float distance;
	private String Where;

	public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist) {
		super(n, d, m, y, h, min, s, dist);
		
	}

	public String getName() {
		return name;
	}

	public Calendar getDateAndTime() {
		return dateAndTime;
	}

	public float getDistance() {
		return distance;
	}

	public String getWhere() {
		return Where;
	} //getters	

}
