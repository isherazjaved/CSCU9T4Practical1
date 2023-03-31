//Cycle Entry Class
package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry{
	private String terrain;
	private String tempo;
public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist) {
		super(n, d, m, y, h, min, s, dist);
	}
public String getTerrain() {
	return terrain;
}
public String getTempo() {
	return tempo;
}
public String getEntry() {
	String result = getName() + "Cycled"+ getDistance() + "km in" + getHour() + ":" + getMin() + ":" + getSec() + "on" + getDay() + "/" + getMonth() +"/"+ getYear() + "on" + getTerrain()+ "at" + getTempo() + "tempo" + "\n";
return result;	
}

}
