// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * This code implements the TrainingRecord class,
 * includes constructor, addEntry(Entry e), addEntry(SwimEntry e), addEntry(CycleEntry e),
 * addEntry(SprintEntry e), lookUpEntry(int d, int m, int y), findAllByDate(int d, int m, int y),
 * searchByName(String name), removeEntry(String name, int d, int m, int y),
 * getNumberOfEntries(), and clearAllEntries()
 *
 * @author 3122142
 * @date April 5, 2023
 */
public class TrainingRecord {
    private List<Entry> tr; // list to hold Entry objects

    /**
     * constructor, creates empty list for Entry objects
     */
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    }


    /**
     * adds a unique record to the list
     *
     * @param e Entry object to be added to list
     */
    public void addEntry(Entry e) {
        // checks entry is unique
        int d = e.getDay();
        int m = e.getMonth();
        int y = e.getYear();
        String name = e.getName();
        String find = findAllbyDate(d, m, y);
        String[] entries = find.split("\n");
        for (String entry : entries) {
            String[] record = entry.split(" ");
            if (record[0].equals(name)) {
                return;
            }
        }
        tr.add(e);
    } // addClass

    /**
     * adds a unique SwimEntry to list
     *
     * @param e SwimEntry obj to be added to list
     */
    public void addEntry(SwimEntry e) {
        // checks entry is unique
        int d = e.getDay();
        int m = e.getMonth();
        int y = e.getYear();
        String name = e.getName();
        String find = findAllbyDate(d, m, y);
        String[] entries = find.split("\n");
        for (String entry : entries) {
            String[] record = entry.split(" ");
            if (record[0].equals(name)) {
                return;
            }
        }
        tr.add(e);
    }

    /**
     * adds a unique CycleEntry to list
     *
     * @param e CycleEntry to be added to list
     */
    public void addEntry(CycleEntry e) {
        // checks entry is unique
        int d = e.getDay();
        int m = e.getMonth();
        int y = e.getYear();
        String name = e.getName();
        String find = findAllbyDate(d, m, y);
        String[] entries = find.split("\n");
        for (String entry : entries) {
            String[] record = entry.split(" ");
            if (record[0].equals(name)) {
                return;
            }
        }
        tr.add(e);
    }

    /**
     * adds a unique SprintEntry to list
     *
     * @param e SprintEntry obj to be added to list
     */
    public void addEntry(SprintEntry e) {
        // checks entry is unique
        int d = e.getDay();
        int m = e.getMonth();
        int y = e.getYear();
        String name = e.getName();
        String find = findAllbyDate(d, m, y);
        String[] entries = find.split("\n");
        for (String entry : entries) {
            String[] record = entry.split(" ");
            if (record[0].equals(name)) {
                return;
            }
        }
        tr.add(e);
    }

    /**
     * look up the entry of a given day and month
     * and returns the last entry with the given date in list
     *
     * @param d day for entry in search of
     * @param m month for entry in search of
     * @param y year for entry in search of
     * @return returns result : last occurrence of date in list
     */

    public String lookupEntry(int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
                result = current.getEntry();
        }
        return result;
    } // lookupEntry

    /**
     * look up all entries of a given day and month
     * returns all the entries as a single string
     *
     * @param d day for entries in search of
     * @param m month for entries in search of
     * @param y year for entries in search of
     * @return string results containing all entries on given date
     */

    public String findAllbyDate(int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        String results = "";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) {
                results = results.concat(current.getEntry());
            }
        }
        return results;
    }

    /**
     * look up all entries under a given day
     * returns all the entries as a single string
     *
     * @param name name of person for entries in search of
     * @return string results of all entries for given name
     */

    public String searchByName(String name) {
        ListIterator<Entry> iter = tr.listIterator();
        String results = "";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getName().equals(name)) {
                results = results.concat(current.getEntry());
            }
        }
        return results;
    }

    /**
     * removes the entry under given name and date from list
     *
     * @param name name of person for entry to be removed
     * @param d    day of date for entry to be removed
     * @param m    month of date for entry to be removed
     * @param y    year of date for entry to be removed
     */
    public void removeEntry(String name, int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getName().equals(name) && (current.getDay() == d)
                    && (current.getMonth() == m) && (current.getYear() == y)) {
                tr.remove(current);
            }
        }
    }

    /**
     * Count the number of entries
     *
     * @return int size of list
     */
    public int getNumberOfEntries() {
        return tr.size();
    }

    /**
     * Clear all entries
     */
    public void clearAllEntries() {
        tr.clear();
    }

} // TrainingRecord
