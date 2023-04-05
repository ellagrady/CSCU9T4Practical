package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
    private String terrain; // description of terrain
    private String tempo; // tempo of ride

    // constructor for CycleEntry
    // takes input of name, date, time, distance, terrain, and tempo
    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String t, String pace) {
        super(n, d, m, y, h, min, s, dist);
        terrain = t;
        tempo = pace;
    }

    // returns the tempo
    public String getTempo() {
        return tempo;
    }

    // returns terrain
    public String getTerrain() {
        return terrain;
    }

    // returns string representation of entry
    public String getEntry() {
        String out = getName() + " cycled " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " on "
                + terrain + " at " + tempo + " tempo\n";
        return out;

    }
}
