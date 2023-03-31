package com.stir.cscu9t4practical1;

import java.util.Calendar;
//Sprint Entry Class

public class SprintEntry extends Entry {
	private String name;
	private Calendar dateAndTime;
	private float distance;
	private int Repetitions;
	private int Recovery;

	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int repetitions, int recovery) {
		super(n, d, m, y, h, min, s, dist);
		name = n;
		Calendar inst = Calendar.getInstance();
		inst.set(y,m-1,d,h,min,s);
		dateAndTime = inst;
		distance = dist;
		
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

	public int getRepetitions() {
		return Repetitions;
	}

	public int getRecovery() {
		return Recovery;
	}
	public int getDay() {
		return dateAndTime.get(Calendar.DATE);
}
	public int getMonth() {
		int month = dateAndTime.get(Calendar.MONTH)+1;
		return month;
}
	public int getYear() {
		return  dateAndTime.get(Calendar.YEAR);
		
}
	public int getHour() {
		return  dateAndTime.get(Calendar.HOUR);
	}
		public int getMin() {
			return  dateAndTime.get(Calendar.MINUTE);
		}
			
	public int getSec() {
				return  dateAndTime.get(Calendar.SECOND);
				
	} //getters
	public String getEntry () {
		   String result = getName()+" ran " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
		   return result;
		  } //getCycleEntry
			
			
	

	
	
}
