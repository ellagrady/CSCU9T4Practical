// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class TrainingRecord {
    private List<Entry> tr;

    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor


    // add a record to the list
    public void addEntry(Entry e) {
        tr.add(e);
    } // addClass

    public void addEntry(SwimEntry e) {
        tr.add(e);
    }

    public void addEntry(CycleEntry e) {
        tr.add(e);
    }

    public void addEntry(SprintEntry e) {
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
    // returns all the entries in a single string
    public String findAllbyDate(int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        //List<String> results = new ArrayList<String>();
        String results = "";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) {
                results += (current.getEntry());
            }
        }
        return results;
    }

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
