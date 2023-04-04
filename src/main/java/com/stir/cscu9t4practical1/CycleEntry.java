package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String t, String pace) {
        super(n, d, m, y, h, min, s, dist);
        terrain = t;
        tempo = pace;
    }

    public String getTempo() {
        return tempo;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getEntry() {
        String out = getName() + " cycled " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " with a terrain of "
                + terrain + " and tempo of " + tempo + "\n";
        return out;
    }
}
