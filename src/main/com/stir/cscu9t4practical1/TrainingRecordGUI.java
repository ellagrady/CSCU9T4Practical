// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JTextField recordType = new JTextField(10); // field for swim/cycle/run
    private JLabel recordLabel = new JLabel("Session Type:");
    private JButton newRecord = new JButton("New Entry");
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
    private JButton enter = new JButton("Enter");

    private JButton lookUpByDate = new JButton("Look Up");


    private JTextField laps = new JTextField(4);
    private JLabel lapLabel = new JLabel(" No. Laps:");
    private JTextField sprintsSwim = new JTextField(8); // "sprints" vs "distance"
    private JLabel sprintsSwimLabel = new JLabel(" Sprints or Distance:");
    private JTextField location = new JTextField(8); // "pool" vs "outdoors"
    private JLabel locationLabel = new JLabel(" Location:");

    private JTextField recovery = new JTextField(2);
    private JLabel recoveryLabel = new JLabel("Recovery time");

    private JTextField reps = new JTextField(4);
    private JLabel repsLabel = new JLabel(" No. Reps");
    private JTextField sprintsRun = new JTextField(8);
    private JLabel sprintsRunLabel = new JLabel(" Sprints or Run");


    private JTextField terrain = new JTextField(15);
    private JLabel terrainLabel = new JLabel(" Terrain:");
    private JTextField tempo = new JTextField(15);
    private JLabel tempoLabel = new JLabel(" Tempo:");

    private JFrame frame = new JFrame();

    private JButton FindAllByDate = new JButton("Find By Date");
    private JButton findByName = new JButton("Find By Name");
    private JButton remove = new JButton("Remove");

    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5, 50);

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI
    public TrainingRecordGUI() {
        super("Training Record");
        frame.setLayout(new FlowLayout());
        frame.add(recordLabel);
        frame.add(recordType);
        recordType.setEditable(true);
        frame.add(enter);
        enter.addActionListener(this);

        frame.add(labn);
        frame.add(name);
        name.setEditable(true);
        frame.add(labd);
        frame.add(day);
        day.setEditable(true);
        frame.add(labm);
        frame.add(month);
        month.setEditable(true);
        frame.add(laby);
        frame.add(year);
        year.setEditable(true);
        frame.add(labh);
        frame.add(hours);
        hours.setEditable(true);
        frame.add(labmm);
        frame.add(mins);
        mins.setEditable(true);
        frame.add(labs);
        frame.add(secs);
        secs.setEditable(true);
        frame.add(labdist);
        frame.add(dist);
        dist.setEditable(true);
        frame.add(addR);
        addR.addActionListener(this);
        frame.add(lookUpByDate);
        lookUpByDate.addActionListener(this);

        frame.add(FindAllByDate);
        FindAllByDate.addActionListener(this);
        frame.add(findByName);
        findByName.addActionListener(this);
        frame.add(remove);
        remove.addActionListener(this);


        frame.add(outputArea);
        outputArea.setEditable(false);
        frame.setSize(1000, 500);
        frame.setVisible(true);
        blankDisplay();


    } // constructor

    private String record;

    // creates cases so depending on what type of training record is being added, fields are added
    //  makes it so window would be less cluttered by irrelevant fields, checks against string entry
    //  in record field
    private String recordCheckerGUI() {
        record = recordType.getText();
        switch (record) {
            case "swim": // if it is a swim entry add relevant fields for swim
                frame.add(lapLabel);
                frame.add(laps);
                laps.setEditable(true);
                frame.add(sprintsSwimLabel);
                frame.add(sprintsSwim);
                sprintsSwim.setEditable(true);
                frame.add(locationLabel);
                frame.add(location);
                location.setEditable(true);
                frame.add(recoveryLabel);
                frame.add(recovery);
                recovery.setEditable(true);
                break;
            case "cycle": // if cycling entry add relevant fields
                frame.add(terrainLabel);
                frame.add(terrain);
                terrain.setEditable(true);
                frame.add(tempoLabel);
                frame.add(tempo);
                tempo.setEditable(true);
                break;
            case "run": // if running entry add relevant fields
                frame.add(repsLabel);
                frame.add(reps);
                reps.setEditable(true);
                frame.add(sprintsRunLabel);
                frame.add(sprintsRun);
                sprintsRun.setEditable(true);
                frame.add(recoveryLabel);
                frame.add(recovery);
                recovery.setEditable(true);
                break;
            default: // if none added do nothing
                return null;
        }
        frame.add(addR);
        addR.addActionListener(this);
        frame.add(newRecord);
        newRecord.addActionListener(this);
        frame.add(outputArea);
        outputArea.setEditable(false);
        return record;
    }

    // listen for and respond to GUI events
    public void actionPerformed(ActionEvent event) {
        String message = "";

        if (event.getSource() == addR) {
            message = addEntry("generic");

        }
        if (event.getSource() == enter) { // when session type added and enter pressed
            message = recordCheckerGUI();
        }
        if (event.getSource() == newRecord) {
            removeFields();
        }
        if (event.getSource() == lookUpByDate) {
            message = lookupEntry();
        }

        if (event.getSource() == FindAllByDate) {
            message = findAllByDate();
        }
        if (event.getSource() == findByName) {
            message = searchByName();
        }
        if (event.getSource() == remove) {
            message = removeEntry();
        }

        outputArea.setText(message);
        blankDisplay();
    } // actionPerformed

    // removes training type specific fields after new entry button is selected
    //  helps to keep gui window less cluttered by irrelevant fields
    private void removeFields() {
        record = recordType.getText();
        switch (record) {
            case "swim": // removes fields relevant to swim
                frame.remove(lapLabel);
                frame.remove(laps);
                frame.remove(sprintsSwimLabel);
                frame.remove(sprintsSwim);
                frame.remove(locationLabel);
                frame.remove(location);
                frame.remove(recoveryLabel);
                frame.remove(recovery);
                frame.remove(newRecord);
                frame.repaint();
                break;
            case "cycle": // removes fields relevant to cycle
                frame.remove(terrainLabel);
                frame.remove(terrain);
                frame.remove(tempoLabel);
                frame.remove(tempo);
                frame.remove(newRecord);
                frame.repaint();
                break;
            case "run": // removes fields relevant to run
                frame.remove(repsLabel);
                frame.remove(reps);
                frame.remove(sprintsRunLabel);
                frame.remove(sprintsRun);
                frame.remove(recoveryLabel);
                frame.remove(recovery);
                frame.remove(newRecord);
                frame.repaint();
                break;
            default:
                frame.remove(outputArea);
                frame.repaint();
        }

    }

    // adds a new entry from input to fields

    public String addEntry(String what) {
        String message = "";
        System.out.println("Adding " + what + " entry to the records");
        String n = name.getText();
        record = recordType.getText();

        int m = 0; // month
        int d = 0; // day
        int y = 0; // year

        // ensures input is valid
        if (!(month.getText()).isEmpty()) {
            try {
                m = Integer.parseInt(month.getText());
                // System.out.println("month: " + m);
            } catch (NumberFormatException excp) {
                System.out.println("Incorrect type of month input, should be in integer format");
                message = "Incorrect type of month input, should be in integer format";
                outputArea.setText(message);
                return message;
            }
        }
        if (!(day.getText()).isEmpty()) {
            try {
                d = Integer.parseInt(day.getText());
            } catch (NumberFormatException excp) {
                System.out.println("Incorrect type of day input, should be in integer format");
                message = "Incorrect type of day input, should be in integer format";
                outputArea.setText(message);
                return message;
            }
        }
        if (!(year.getText()).isEmpty()) {
            try {
                y = Integer.parseInt(year.getText());
            } catch (NumberFormatException excp) {
                System.out.println("Incorrect type of year input, should be in integer format");
                message = "Incorrect type of year input, should be in integer format";
                outputArea.setText(message);
                return message;
            }
        }
        float km = 0;
        if (!(dist.getText()).isEmpty()) {
            try {
                km = java.lang.Float.parseFloat(dist.getText());
            } catch (NumberFormatException excp) {
                System.out.println("Incorrect type of distance input, should be in numerical format");
                message = "Incorrect type of distance input, should be in numerical format";
                outputArea.setText(message);
                return message;
            }
        }
        int h = 0; // hours
        int mm = 0; // minutes
        int s = 0; // seconds

        // ensures input is valid
        if (!(hours.getText()).isEmpty()) {
            try {
                h = Integer.parseInt(hours.getText());
            } catch (final NumberFormatException except) {
                System.out.println("Incorrect type of hours input, should be in integer format");
                message = "Incorrect type of hours input, should be in integer format";
                outputArea.setText(message);
                return message;
            }
        }
        if (!(mins.getText()).isEmpty()) {
            try {
                mm = Integer.parseInt(mins.getText());
            } catch (final NumberFormatException except) {
                System.out.println("Incorrect type of mins input, should be in integer format");
                message = "Incorrect type of mins input, should be in integer format";
                outputArea.setText(message);
                return message;
            }
        }
        if (!(secs.getText()).isEmpty()) {
            try {
                s = Integer.parseInt(secs.getText());
            } catch (final NumberFormatException except) {
                System.out.println("Incorrect type of seconds input, should be in integer format");
                message = "Incorrect type of seconds input, should be in integer format";
                outputArea.setText(message);
                return message;
            }
        }
        // checks that entry is unique
        // String out = myAthletes.findAllbyDate(d, m, y);
        // System.out.println("out: " + out);
        //String[] results = out.split("\n");
        // System.out.println("results length: " + results.length);
        /* if (out.length() != 0) {
            String[] results = out.split("\n");

            for (String value : results) {
                System.out.println("value: " + value);
                String[] individualEntry = value.split(" ");
                String[] time = {};
                String[] date = {};
                for (String element : individualEntry) {
                    if (element.contains(":")) {
                        time = element.split(":");
                    }
                    if (element.contains("/")) {
                        date = element.split("/");
                    }
                }
                /* System.out.println(time[0] + " " + time[1] + " " + time[2]);
                System.out.println(h + " " + mm + " " + s);
                System.out.println(date[0] + " " + date[1] + " " + date[2]);
                System.out.println(d + " " + m + " " + y); */

               /*  System.out.println(recordType.getText() + " " + record);
                System.out.println(individualEntry[0] + " " + n + " " + individualEntry[2] + " " + km);
                if (individualEntry[0].equals(n) && (Float.parseFloat(individualEntry[2]) == km)
                        && (Integer.parseInt(time[0]) == h) && (Integer.parseInt(time[1]) == mm) && (Integer.parseInt(time[2]) == s)
                        && (Integer.parseInt(date[0]) == d) && (Integer.parseInt(date[1]) == m) && (Integer.parseInt(date[2]) == y)) {
                    System.out.println("duplicate");
                    outputArea.setText("Attempted entry is a duplicate of previous entry: \n" + value);
                    message = "Attempted entry is a duplicate of previous entry: \n" + value;
                    return message;


                }
            }
        } else {*/

        // creates SwimEntry object if swim type
        if (record.equals("swim")) {
            String p = location.getText();
            System.out.println(p);
            int r = Integer.parseInt(recovery.getText());
            System.out.println(r);
            int l = Integer.parseInt(laps.getText());
            System.out.println(l);
            String sp = sprintsSwim.getText();
            System.out.println(sp);
            SwimEntry swimE = new SwimEntry(n, d, m, y, h, mm, s, km, p, r, l, sp);
            System.out.println(swimE.getEntry());
            myAthletes.addEntry(swimE);
            outputArea.setText("Record added");
            message = "Record added";
        }
        // creates SprintEntry object if run type
        else if (record.equals("run")) {
            int rp = Integer.parseInt(reps.getText());
            System.out.println(rp);
            String sp = sprintsRun.getText();
            System.out.println(sp);
            int rc = Integer.parseInt(recovery.getText());
            System.out.println(rc);
            SprintEntry sprintE = new SprintEntry(n, d, m, y, h, mm, s, km, rp, sp, rc);
            myAthletes.addEntry(sprintE);
            outputArea.setText("Record added");
            message = "Record added";
        }
        // creates CycleEntry object if cycle type
        else if (record.equals("cycle")) {
            String t = terrain.getText();
            System.out.println(terrain.getText());
            String p = tempo.getText();
            System.out.println(tempo.getText());
            CycleEntry cycleE = new CycleEntry(n, d, m, y, h, mm, s, km, t, p);
            myAthletes.addEntry(cycleE);
            outputArea.setText("Record added");
            message = "Record added";
        }
        // if no type entered, creates generic Entry object
        else if (record.length() == 0) {
            Entry e = new Entry(n, d, m, y, h, mm, s, km);
            myAthletes.addEntry(e);
            outputArea.setText("Record added");
            message = "Record added";

        } else {
            return message;
        }
        //}

        return message;
    }

    // method called by Look Up button to look up entry, returns last entry with given date
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

    // method called by Find By Name button, returns all records under given name
    public String searchByName() {
        String n = name.getText();
        n = n.toLowerCase();
        outputArea.setText("looking up records ...");
        String message = myAthletes.searchByName(n);
        return message;
    }

    // method called by Remove button, removes entry of given name and date
    public String removeEntry() {
        String n = name.getText();
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("deleting record ...");
        myAthletes.removeEntry(n, d, m, y);
        return "";
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
    public void fillDisplay(Entry ent, String record) {
        recordType.setText(record);
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

