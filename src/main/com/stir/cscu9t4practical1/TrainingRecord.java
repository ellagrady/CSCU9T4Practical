// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class TrainingRecord {
    private List<Entry> tr; // list to hold Entry objects

    // constructor, creates empty list for Entry objects
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    }


    // add a unique record to the list
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

    // adds a unique SwimEntry to list
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

    // adds a unique CycleEntry to list
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

    // adds a unique SprintEntry to list
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

    // look up the entry of a given day and month
    // returns last occurrence of date in list
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

    // look up all entries of a given day and month
    // returns all the entries as a single string
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

    // look up all entries under a given day
    // returns all the entries as a single string
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

    // removes the entry under given name and date from list
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

    // Count the number of entries
    public int getNumberOfEntries() {
        return tr.size();
    }

    // Clear all entries
    public void clearAllEntries() {
        tr.clear();
    }

} // TrainingRecord
