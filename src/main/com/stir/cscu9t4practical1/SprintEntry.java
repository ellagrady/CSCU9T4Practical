package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private int repetitions; // number of times sprint/run is repeated
    private String sprintRuns; // sprints or run
    private int recoveryTime; // number of minutes for recovery

    // constructor for SprintEntry
    // takes input of name, date, time, distance, number of repetitions, type of run, recovery time
    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int reps, String sprints, int recovery) {
        super(n, d, m, y, h, min, s, dist);
        repetitions = reps;
        sprintRuns = sprints;
        recoveryTime = recovery;
    }

    // returns number of repetitions
    public int getReps() {
        return repetitions;
    }

    // returns type of workout
    public String getSprintVSRun() {
        return sprintRuns;
    }

    // returns recovery time
    public int getRecoveryTime() {
        return recoveryTime;
    }

    // returns string representation of entry
    public String getEntry() {
        String out;
        if (sprintRuns.equals("sprints")) {
            out = getName() + " ran " + repetitions + " * " + getDistance() + " km sprints (with "
                    + recoveryTime + " minutes recovery between) in " + getHour() + ":" + getMin() + ":"
                    + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        } else {
            out = getName() + " ran a " + repetitions + " * " + getDistance() + "km run in " + getHour()
                    + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/"
                    + getYear() + "\n";
        }
        return out;
    }
}
