package com.stir.cscu9t4practical1;

/**
 * This code implements the CycleEntry class, extended from Entry class
 * includes constructor, getTempo(), getTerrain(), and getEntry() methods
 *
 * @author 3122142
 * @date April 5, 2023
 */
public class CycleEntry extends Entry {
    private String terrain; // description of terrain
    private String tempo; // tempo of ride

    /**
     * constructor for CycleEntry
     *
     * @param n    String name
     * @param d    int day
     * @param m    int month
     * @param y    int year
     * @param h    int hour
     * @param min  int minutes
     * @param s    int seconds
     * @param dist float distance
     * @param t    String terrain
     * @param pace String pace
     */
    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String t, String pace) {
        super(n, d, m, y, h, min, s, dist);
        terrain = t;
        tempo = pace;
    }

    /**
     * returns the tempo
     *
     * @return String tempo
     */
    public String getTempo() {
        return tempo;
    }

    /**
     * returns terrain
     *
     * @return int terrain
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * returns string representation of entry
     *
     * @return string out - string representation of entry
     */
    public String getEntry() {
        String out = getName() + " cycled " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " on "
                + terrain + " at " + tempo + " tempo\n";
        return out;

    }
}
