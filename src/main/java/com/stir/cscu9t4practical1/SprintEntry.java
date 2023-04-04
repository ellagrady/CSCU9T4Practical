package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private int repititions; // number of times sprint/run is repeated
    private String sprintRuns; // sprints or run
    private int recoveryTime; // number of minutes for recovery
    private String distanceUnit; // m for sprints, km for runs
    float distance;

    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int reps, String sprints, int recovery) {
        super(n, d, m, y, h, min, s, dist);
        repititions = reps;
        sprintRuns = sprints;
        recoveryTime = recovery;
    }

    public int getReps() {
        return repititions;
    }

    public String getSprintVSRun() {
        String out = "";
        if (sprintRuns.equals("sprints")) {
            out = "sprints";
        } else {
            out = "run";
        }
        return out;
    }

    public String getDistanceUnits() {
        distance = getDistance();
        if (sprintRuns.equals("sprints")) {
            distanceUnit = "m";
            distance *= 1000;
        } else {
            distanceUnit = "km";
        }
        return distanceUnit;
    }

    public int getRecoveryTime() {
        return recoveryTime;
    }

    public String getEntry() {
        String out;
        if (sprintRuns.equals("sprints")) {
            out = getName() + " ran " + repititions + " * " + getDistance() + " km sprints (with "
                    + recoveryTime + " minutes recovery between) in " + getHour() + ":" + getMin() + ":"
                    + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        } else {
            out = getName() + " ran " + repititions + " * " + getDistance() + "km run in " + getHour()
                    + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/"
                    + getYear() + "\n";
        }
        return out;
    }
}
