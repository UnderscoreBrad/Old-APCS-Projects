/*
=================================================================================
Project Author:         Brad Estus
Project Group/Topic:    APCS Assign 8
Project Type:           Console Application
Date Completed:         31 Jan 2019
Date Due:               1 Feb 2019
=================================================================================
 */

public class Planet {
    
    //===========================================================================
    //                        STATIC VARIABLES
    //===========================================================================

    public static int totalDays = 0;
    public static int numPlanets = 0;
    public static int totalNumRot = 0;
    //===========================================================================
    //                       INSTANCE VARIABLES
    //===========================================================================
    private String name;
    private double days;
    private int numRotations;//Rotations should really be orbit but ¯\_(-_-)_/¯
    private double daysPerRot;

    //===========================================================================
    //                       C O N S T R U C T O R
    //===========================================================================
    public Planet() {
        name = "<None>";                            //Zero-arg constructor
        numRotations = 0;
        daysPerRot = 0;
    }

    public Planet(String nm) {
        if (nm.equals("")) {                        //Name only
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }       //EVERYONE GETS AN EXCEPTION TO THROW!
        name = nm;
        numRotations = 0;
        daysPerRot = 0;
    }

    public Planet(String nm, double dpr) {
        if (nm.equals("")) {                        //Name, Days/Rotation
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;

        numRotations = 0;
        if (dpr <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative DAYS PER ROTATION");
        }
        daysPerRot = dpr;

    }

    public Planet(String nm, double dy, int cr, double dpr) {
        if (nm.equals("")) {                    //Name, Days, Current Rotation, Days/Rotation
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;
        if (dy <= 0) {
            throw new IllegalArgumentException("You Cannot Have Negative DAYS");
        }
        days = dy;
        if (cr <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative NUMBER OF ROTATIONS");
        }
        numRotations = cr;
        if (dpr <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative DAYS PER ROTATION");
        }
        daysPerRot = dpr;
    }

    //===========================================================================
    //                       A C C E S S O R S
    //===========================================================================
    public String getName() {
        return name;             //these guys don't get exceptions though
    }

    public double getDays() {
        return days;
    }

    public int getNumRotations() {
        if (daysPerRot == 0) {
            return 0;
        }
        return numRotations;
    }

    public double getDPR() {
        return daysPerRot;
    }

    public double daysUntilNext() {
        if (daysPerRot == 0) {
            return 0;
        }
        double dNext = ((numRotations + 1) * daysPerRot) - days;
        return dNext;
    }

    public int daysInNextRot() {
        if (daysPerRot == 0) {
            return (int) days;
        }
        return (int) (days % daysPerRot);
    }
    
    public String toString(){   //simple toString, all relevant values to string
        return ("===\nPLANET NAME: " + name + "\nNUMBER OF DAYS: " + days + "\nNUMBER OF ROTATIONS: " + numRotations + "\nDAYS PER ROTATION:" + daysPerRot + "\n===");
    }

    //===========================================================================
    //                       M U T A T O R S
    //===========================================================================
    public void setName(String nm) {
        if (nm.equals("")) {                        
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;
    }

    public void setDays(double dy) {
        if (dy <= 0) {
            throw new IllegalArgumentException("You Cannot Have Negative DAYS");
        }
        days = dy;
        numRotations = (int) (days / daysPerRot);
    }

    public void setNumRotation(int nr) {
        if (nr <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative NUMBER OF ROTATIONS");
        }
        numRotations = nr;
    }

    public void orbit(double dy) {
        if (dy <= 0) {                 
            throw new IllegalArgumentException("You Cannot Have Negative DAYS");
        }
        days += dy;            //Adds days passed
        numRotations = (int) Math.floor(days / daysPerRot); //Finds number of orbits
    }

    public void addRotations(double nr) {
        if (nr <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative NUMBER OF ROTATIONS");
        }
        numRotations += nr;
    }

    public void setDPR(double dpr) {
        if (dpr <= 0) {                 
            throw new IllegalArgumentException("You Cannot Have A Negative DAYS PER ROTATION");
        }
        daysPerRot = dpr;
    }
}
