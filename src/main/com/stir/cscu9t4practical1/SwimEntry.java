package com.stir.cscu9t4practical1;

/**
 * This code implements the SwimEntry class, extended from Entry class
 * includes constructor, getLaps(), isSprintsVSDistance(), getWhere, getRecoveryTime,
 * and getEntry() methods
 *
 * @author 3122142
 * @date April 5, 2023
 */
public class SwimEntry extends Entry {
    private int laps; // number of laps
    private String sprintsVSDistance; // short sprint swim vs long
    private String poolVSOutdoors; // pool or outdoors
    private int recoveryTime;

    /**
     * constructor for SwimEntry
     *
     * @param n        String name
     * @param d        int day
     * @param m        int month
     * @param y        int year
     * @param h        int hour
     * @param min      int minutes
     * @param s        int seconds
     * @param dist     float distance
     * @param pool     String "pool" vs "outdoors"
     * @param recovery int recoveryTime
     * @param l        int laps
     * @param sprints  String "sprints" vs "distance"
     */
    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String pool, int recovery, int l, String sprints) {
        super(n, d, m, y, h, min, s, dist);
        laps = l;
        sprintsVSDistance = sprints;
        poolVSOutdoors = pool;
        recoveryTime = recovery;
    }

    /**
     * returns number of laps
     *
     * @return int laps
     */
    public int getLaps() {
        return laps;
    }

    /**
     * returns type of swim workout
     *
     * @return string sprintsVSDistance - type of workout: "sprints" vs "distance"
     */
    public String isSprintsVSDistance() {
        return sprintsVSDistance;
    }

    /**
     * returns location of swim
     *
     * @return String poolVSOutdoors - swim location: "pool" vs "outdoors"
     */
    public String getWhere() {
        return poolVSOutdoors;
    }

    /**
     * returns recovery time
     *
     * @return int recoveryTime
     */
    public int getRecoveryTime() {
        return recoveryTime;
    }


    /**
     * returns entry in string format
     *
     * @return String out - string representation of entry
     */
    public String getEntry() {
        String out;
        if (sprintsVSDistance.equals("sprints")) { // sprints type workout
            out = getName() + " swam " + getDistance() + " km sprints (with "
                    + recoveryTime + " minutes recovery between) across " + laps +
                    " laps in " + getHour() + ":" + getMin() + ":" + getSec() + " on "
                    + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        } else { // distance swim
            if (poolVSOutdoors.equals("pool")) { // if in pool
                out = getName() + " swam " + getDistance() + " km distance " + laps + " laps in " + getHour()
                        + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/"
                        + getYear() + "\n";
            } else { // if in outdoors
                out = getName() + " swam " + getDistance() + " km distance outdoors in " + getHour()
                        + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/"
                        + getYear() + "\n";
            }
        }
        return out;
    }
}
