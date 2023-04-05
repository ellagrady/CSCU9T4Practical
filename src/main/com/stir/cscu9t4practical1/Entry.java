// This class holds information about a single training session
package com.stir.cscu9t4practical1;

import java.util.Calendar;

/**
 * This code implements the Entry class
 * includes constructor, getDay(), getMonth(), getYear(), getHour(),
 * getMin(), getSec(), getDistance, and getEntry() methods
 *
 * @author 3122142
 * @date April 5, 2023
 */
public class Entry {
    private String name; // input name
    private Calendar dateAndTime; // representation of date and time from input
    private float distance; // input distance

    /**
     * constructor for Entry object
     *
     * @param n    String name
     * @param d    int day
     * @param m    int month
     * @param y    int year
     * @param h    int hour
     * @param min  int minutes
     * @param s    int seconds
     * @param dist float distance (km)
     */
    public Entry(String n, int d, int m, int y, int h, int min, int s, float dist) {
        name = n;
        Calendar inst = Calendar.getInstance();
        inst.set(y, m - 1, d, h, min, s);
        dateAndTime = inst;
        distance = dist;
    } //constructor

    /**
     * returns name
     *
     * @return string name
     */
    public String getName() {
        return name;
    } //getName

    /**
     * returns day
     *
     * @return int day from dateAndTime
     */
    public int getDay() {
        return dateAndTime.get(Calendar.DATE);
    } //getDay

    /**
     * returns month
     *
     * @return int month from dateAndTime
     */
    public int getMonth() {
        int month = dateAndTime.get(Calendar.MONTH) + 1;
        return month;
    } //getMonth

    /**
     * returns year
     *
     * @return int year from dateAndTime
     */
    public int getYear() {
        return dateAndTime.get(Calendar.YEAR);
    } //getYear

    /**
     * returns hours
     *
     * @return int hours from dateAndTime
     */
    public int getHour() {
        return dateAndTime.get(Calendar.HOUR);
    } //getHour

    /**
     * returns minutes
     *
     * @return int minutes from dateAndTime
     */
    public int getMin() {
        return dateAndTime.get(Calendar.MINUTE);
    } //getMin

    /**
     * returns seconds
     *
     * @return int seconds from dateAndTime
     */
    public int getSec() {
        return dateAndTime.get(Calendar.SECOND);
    } //getSec

    /**
     * returns distance
     *
     * @return float distance
     */
    public float getDistance() {
        return distance;
    } //getYear

    /**
     * returns string representation of entry
     *
     * @return string result - representation of entry
     */
    public String getEntry() {
        String result = getName() + " ran " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        return result;
    } //getEntry

} // Entry
