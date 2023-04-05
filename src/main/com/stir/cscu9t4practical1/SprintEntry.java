package com.stir.cscu9t4practical1;

/**
 * This code implements the SprintEntry class, extended from Entry class
 * includes constructor, getReps(), getSprintvsRun(), getRecoveryTime, and getEntry() methods
 *
 * @author 3122142
 * @date April 5, 2023
 */
public class SprintEntry extends Entry {
    private int repetitions; // number of times sprint/run is repeated
    private String sprintRuns; // sprints or run
    private int recoveryTime; // number of minutes for recovery

    /**
     * constructor for SprintEntry
     *
     * @param n        String name
     * @param d        int day
     * @param m        int month
     * @param y        int year
     * @param h        int hour
     * @param min      int minutes
     * @param s        int seconds
     * @param dist     float distance
     * @param reps     int repetitions
     * @param sprints  String "sprints" vs "runs"
     * @param recovery int recovery
     */
    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int reps, String sprints, int recovery) {
        super(n, d, m, y, h, min, s, dist);
        repetitions = reps;
        sprintRuns = sprints;
        recoveryTime = recovery;
    }

    /**
     * returns number of repetitions
     *
     * @return int repetitions
     */
    public int getReps() {
        return repetitions;
    }

    /**
     * returns type of workout, "sprints" or "run"
     *
     * @return string sprintRuns
     */
    public String getSprintVSRun() {
        return sprintRuns;
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
     * returns string representation of entry
     *
     * @return string out - string representation of entry
     */
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
