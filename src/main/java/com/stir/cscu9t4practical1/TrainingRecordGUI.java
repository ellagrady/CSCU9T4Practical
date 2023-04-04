// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JTextField name = new JTextField(30);
    private JTextField day = new JTextField(2);
    private JTextField month = new JTextField(2);
    private JTextField year = new JTextField(4);
    private JTextField hours = new JTextField(2);
    private JTextField mins = new JTextField(2);
    private JTextField secs = new JTextField(2);
    private JTextField dist = new JTextField(4);
    private JLabel labn = new JLabel(" Name:");
    private JLabel labd = new JLabel(" Day:");
    private JLabel labm = new JLabel(" Month:");
    private JLabel laby = new JLabel(" Year:");
    private JLabel labh = new JLabel(" Hours:");
    private JLabel labmm = new JLabel(" Mins:");
    private JLabel labs = new JLabel(" Secs:");
    private JLabel labdist = new JLabel(" Distance (km):");
    private JButton addR = new JButton("Add");
    private JButton lookUpByDate = new JButton("Look Up");

    private JButton FindAllByDate = new JButton("Find By Date");

    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5, 50);

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());
        add(labn);
        add(name);
        name.setEditable(true);
        add(labd);
        add(day);
        day.setEditable(true);
        add(labm);
        add(month);
        month.setEditable(true);
        add(laby);
        add(year);
        year.setEditable(true);
        add(labh);
        add(hours);
        hours.setEditable(true);
        add(labmm);
        add(mins);
        mins.setEditable(true);
        add(labs);
        add(secs);
        secs.setEditable(true);
        add(labdist);
        add(dist);
        dist.setEditable(true);
        add(addR);
        addR.addActionListener(this);
        add(lookUpByDate);
        lookUpByDate.addActionListener(this);

        add(FindAllByDate);
        FindAllByDate.addActionListener(this);

        add(outputArea);
        outputArea.setEditable(false);
        setSize(720, 200);
        setVisible(true);
        blankDisplay();

        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)

    } // constructor

    // listen for and respond to GUI events
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (event.getSource() == addR) {
            message = addEntry("generic");
        }
        if (event.getSource() == lookUpByDate) {
            message = lookupEntry();
        }

        if (event.getSource() == FindAllByDate) {
            message = findAllByDate();
        }
        outputArea.setText(message);
        blankDisplay();
    } // actionPerformed

    public String addEntry(String what) {
        String message = "Record added\n";
        System.out.println("Adding " + what + " entry to the records");
        String n = name.getText();
        if (n.equals("")) {
            message = "Name should not be an empty string";
            return message;
        }

        int m = 0;
        int d = 0;
        int y = 0;
        try {
            m = Integer.parseInt(month.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of month input, should be in integer format";
            return message;
        }
        try {
            d = Integer.parseInt(day.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of day input, should be in integer format";
            return message;
        }
        try {
            y = Integer.parseInt(year.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of year input, should be in integer format";
            return message;
        }
        float km = 0;
        try {
            km = java.lang.Float.parseFloat(dist.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of distance input, should be in numerical format";
            return message;
        }
        int h = 0;
        int mm = 0;
        int s = 0;
        try {
            h = Integer.parseInt(hours.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of hours input, should be in integer format";
            return message;
        }
        try {
            mm = Integer.parseInt(mins.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of mins input, should be in integer format";
            return message;
        }
        try {
            s = Integer.parseInt(secs.getText());
        } catch (NumberFormatException excp) {
            message = "Incorrect type of seconds input, should be in integer format";
            return message;
        }
        String results = myAthletes.findAllbyDate(d, m, y);

        if (results.length() > 1) {
            String[] arr = results.split("\n");

            for (String value : arr) {
                String[] individualEntry = value.split(" ");
                String[] time = individualEntry[5].split(":");
                String[] date = individualEntry[7].split("/");
                if (individualEntry[0].equals(n) && (Float.parseFloat(individualEntry[2]) == km)
                        && (Integer.parseInt(time[0]) == h) && (Integer.parseInt(time[1]) == mm) && (Integer.parseInt(time[2]) == s)
                        && (Integer.parseInt(date[0]) == d) && (Integer.parseInt(date[1]) == m) && (Integer.parseInt(date[2]) == y)) {
                    message = "Attempted entry is a duplicate of previous entry: \n" + value;
                    return message;

                }
            }
        }

        Entry e = new Entry(n, d, m, y, h, mm, s, km);
        myAthletes.addEntry(e);
        return message;
    }

    public String lookupEntry() {
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up record ...");
        String message = myAthletes.lookupEntry(d, m, y);
        return message;
    }

    // method called by Find By Date button to return all entries on given date
    public String findAllByDate() {
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up records ...");
        String message = myAthletes.findAllbyDate(d, m, y);
        return message;
    }

    public void blankDisplay() {
        name.setText("");
        day.setText("");
        month.setText("");
        year.setText("");
        hours.setText("");
        mins.setText("");
        secs.setText("");
        dist.setText("");

    }// blankDisplay

    // Fills the input fields on the display for testing purposes only
    public void fillDisplay(Entry ent) {
        name.setText(ent.getName());
        day.setText(String.valueOf(ent.getDay()));
        month.setText(String.valueOf(ent.getMonth()));
        year.setText(String.valueOf(ent.getYear()));
        hours.setText(String.valueOf(ent.getHour()));
        mins.setText(String.valueOf(ent.getMin()));
        secs.setText(String.valueOf(ent.getSec()));
        dist.setText(String.valueOf(ent.getDistance()));
    }

} // TrainingRecordGUI

