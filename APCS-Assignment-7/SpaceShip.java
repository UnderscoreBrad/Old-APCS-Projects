/*
=================================================================================
Project Author:         Brad Estus
Project Group/Topic:    APCS Assign 8
Project Type:           Object Class
Date Completed:         31 Jan 2019
Date Due:               1 Feb 2019
=================================================================================
 */
import java.util.Random;

public class SpaceShip {

    //===========================================================================
    //                        STATIC VARIABLES
    //===========================================================================
    static Random r = new Random();
    public static int fleetSize = 0;
    public static int fleetHP = 0;
    //===========================================================================
    //                       INSTANCE VARIABLES
    //===========================================================================
    private String name;
    private String type;
    private int HP;
    private double fuelPercent;

    //===========================================================================
    //                       C O N S T R U C T O R
    //===========================================================================
    public SpaceShip() {
        name = "<No Name>";     //zero-arg constructor
        type = "<None>";
        HP = 100;
        fuelPercent = 50;
        fleetSize++;
    }

    public SpaceShip(String nm, String tp, int hp, double fp) {
        if (nm.equals("")) {          //4-arg "everything" constructor
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }                //EVERYONE GETS AN EXCEPTION TO THROW!
        name = nm;

        if (tp.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty TYPE Field");
        }
        type = tp;
        if (hp < 0) {
            throw new IllegalArgumentException("You Cannot Have Negative HITPOINTS.");
        }
        HP = hp;

        if (fp < 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL PERCENTAGE");
        } else if (fp > 100) {
            throw new IllegalArgumentException("You Cannot Overfill Your FUEL PERCENTAGE");
        }
        fuelPercent = fp;

        fleetSize++;
        fleetHP += hp;
    }

    public SpaceShip(int hp) {
        name = "<No Name>";             //HP only
        type = "<None>";
        if (hp < 0) {
            throw new IllegalArgumentException("You Cannot Have Negative HITPOINTS");
        }
        HP = hp;

        fuelPercent = 50;
        fleetSize++;
        fleetHP += hp;
    }

    public SpaceShip(String nm) {
        if (nm.equals("")) {                //Name only
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;
        type = "<None>";
        HP = 100;
        fuelPercent = 50;
        fleetSize++;
    }

    public SpaceShip(String nm, String tp, int hp) {
        if (nm.equals("")) {                //Name, type and HP
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;

        if (tp.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty TYPE Field");
        }
        type = tp;

        if (hp < 0) {
            throw new IllegalArgumentException("You Cannot Have Negative HITPOINTS");
        }
        HP = hp;

        fuelPercent = 50;
        fleetSize++;
        fleetHP += hp;
    }

    public SpaceShip(String nm, double fp) {
        if (nm.equals("")) {                //Name and fuel
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;

        type = "";
        HP = 100;
        if (fp < 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL PERCENTAGE");
        } else if (fp > 100) {
            throw new IllegalArgumentException("You Cannot Overfill Your FUEL PERCENTAGE");
        } else {
            fuelPercent = fp;
        }
        fleetSize++;
    }

    //===========================================================================
    //                       A C C E S S O R S
    //===========================================================================
    public String getName() {
        return name;        //these guys don't get exceptions though
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return HP;
    }

    public double getFuelPercent() {
        return fuelPercent;
    }

    public String toString() {  //simple toString, all relevant values to string
        return ("===\nSHIP NAME: " + name + "\nSHIP TYPE: " + type + "\nSHIP HITPOINTS: " + HP + "\nSHIP FUEL %: " + fuelPercent + "\n===");
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

    public void setType(String tp) {
        if (tp.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty TYPE Field");
        }
        type = tp;
    }

    public void setHP(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("You Cannot Have Negative HITPOINTS");
        }
        fleetHP -= HP;
        HP = hp;
        fleetHP += hp;
    }

    public void setFuelPercent(int fp) {
        if (fp < 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL PERCENTAGE");
        } else if (fp > 100) {
            throw new IllegalArgumentException("You Cannot Overfill Your FUEL PERCENTAGE");
        }
        fuelPercent = fp;
    }

    public boolean engageAttack() {
        int dmgTaken = r.nextInt(HP + 1000);
        HP -= dmgTaken;
        fleetHP -= dmgTaken;
        return HP > 0;
    }

    public boolean travelDist(int dist) {
        if (dist <= 0) {
            throw new IllegalArgumentException("You Cannot Travel A Negative Distance");
        }
        double fuelUsed = dist * 0.001;
        fuelPercent -= fuelUsed;
        return fuelPercent <= 0;
    }
}
