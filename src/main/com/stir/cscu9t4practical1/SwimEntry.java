package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
    private int laps; // number of laps
    private String sprintsVSDistance; // short sprint swim vs long
    private String poolVSOutdoors; // pool or outdoors
    private int recoveryTime;

    // constructor for SwimEntry
    // takes input of name, date, time, location, recovery time, laps, and type of swim
    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String pool, int recovery, int l, String sprints) {
        super(n, d, m, y, h, min, s, dist);
        laps = l;
        sprintsVSDistance = sprints;
        poolVSOutdoors = pool;
        recoveryTime = recovery;
    }

    // returns number of laps
    public int getLaps() {
        return laps;
    }

    // returns type of swim workout
    public String isSprintsVSDistance() {
        return sprintsVSDistance;
    }

    // returns location of swim
    public String getWhere() {
        return poolVSOutdoors;
    }

    // returns recovery time
    public int getRecoveryTime() {
        return recoveryTime;
    }


    // returns entry in string format
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
