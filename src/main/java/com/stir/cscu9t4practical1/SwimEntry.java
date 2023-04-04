package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
    private int laps; // number of laps
    private String sprintsVSDistance; // short sprint swim vs long
    private String poolVSOutdoors; // pool or outdoors
    float distance;
    private String distanceUnit;
    private int recoveryTime;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String pool, int recovery, int l, String sprints) {
        super(n, d, m, y, h, min, s, dist);
        laps = l;
        sprintsVSDistance = sprints;
        poolVSOutdoors = pool;
        recoveryTime = recovery;
    }

    public int getLaps() {
        return laps;
    }

    public String isSprintsVSDistance() {
        return sprintsVSDistance;
    }

    public String isPoolVSOutdoors() {
        return poolVSOutdoors;
    }

    public int getRecoveryTime() {
        return recoveryTime;
    }

    public String getDistanceUnits() {
        distance = getDistance();
        if (sprintsVSDistance.equals("sprints")) {
            distanceUnit = "m";
            distance *= 1000;
        } else {
            distanceUnit = "km";
        }
        return distanceUnit;
    }


    public String getEntry() {
        String out;
        if (sprintsVSDistance.equals("sprints")) {
            out = getName() + " swam " + getDistance() + " km sprints (with "
                    + recoveryTime + " minutes recovery between) across " + laps +
                    " laps in " + getHour() + ":" + getMin() + ":" + getSec() + " on "
                    + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        } else {
            out = getName() + " swam " + getDistance() + "km across " + laps + " laps in " + getHour()
                    + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/"
                    + getYear() + "\n";
        }
        return out;
    }
}
