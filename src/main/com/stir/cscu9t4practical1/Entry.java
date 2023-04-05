// This class holds information about a single training session
package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class Entry {
    private String name; // input name
    private Calendar dateAndTime; // representation of date and time from input
    private float distance; // input distance

    // constructor for Entry
    // takes name, date, time, and distance as input
    public Entry(String n, int d, int m, int y, int h, int min, int s, float dist) {
        name = n;
        Calendar inst = Calendar.getInstance();
        inst.set(y, m - 1, d, h, min, s);
        dateAndTime = inst;
        distance = dist;
    } //constructor

    // returns name
    public String getName() {
        return name;
    } //getName

    // returns day
    public int getDay() {
        return dateAndTime.get(Calendar.DATE);
    } //getDay

    // returns month
    public int getMonth() {
        int month = dateAndTime.get(Calendar.MONTH) + 1;
        return month;
    } //getMonth

    // returns year
    public int getYear() {
        return dateAndTime.get(Calendar.YEAR);
    } //getYear

    // returns hours
    public int getHour() {
        return dateAndTime.get(Calendar.HOUR);
    } //getHour

    // returns minutes
    public int getMin() {
        return dateAndTime.get(Calendar.MINUTE);
    } //getMin

    // returns seconds
    public int getSec() {
        return dateAndTime.get(Calendar.SECOND);
    } //getSec

    // returns distance
    public float getDistance() {
        return distance;
    } //getYear

    // returns string representation of entry
    public String getEntry() {
        String result = getName() + " ran " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        return result;
    } //getEntry

} // Entry
