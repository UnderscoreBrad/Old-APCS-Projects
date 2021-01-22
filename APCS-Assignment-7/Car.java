/*
=================================================================================
Project Author:         Brad Estus
Project Group/Topic:    APCS Assign 8
Project Type:           Object Class
Date Completed:         31 Jan 2019
Date Due:               1 Feb 2019
=================================================================================
 */

public class Car {

    //===========================================================================
    //                        STATIC VARIABLES
    //===========================================================================
    public static int totalMiles = 0;
    public static int numCars = 0;
    //===========================================================================
    //                       INSTANCE VARIABLES
    //===========================================================================
    private String name;
    private String manufacturer;
    private double mpg;
    private double fuelLvl;

    //===========================================================================
    //                       C O N S T R U C T O R
    //===========================================================================
    public Car() {                                  //No-arg constructor
        name = "<None>";
        manufacturer = "<None>";
        mpg = 0;
        fuelLvl = 0;
        numCars++;
    }

    public Car(String nm) {
        if (nm.equals("")) {                        //Name only
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }        //EVERYONE GETS AN EXCEPTION TO THROW!
        name = nm;
        manufacturer = "<Not Given>";
        mpg = 0;
        fuelLvl = 0;
        numCars++;
    }

    public Car(double mg) {
        name = "<None>";                            //MPG only
        manufacturer = "<None>";
        mpg = mg;
        fuelLvl = 0;
        numCars++;
    }

    public Car(String nm, String manuf, double mg, double fl) {
        if (nm.equals("")) {                        //4-arg constructor
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;
        if (manuf.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty MANUFACTURER Field");
        }
        manufacturer = manuf;
        if (mg <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL ECONOMY");
        }
        mpg = mg;
        if (fl <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL LEVEL");
        }
        fuelLvl = fl;
        numCars++;
    }

    //===========================================================================
    //                       A C C E S S O R S
    //===========================================================================
    public String getName() {
        return name;             //these guys don't get exceptions though
    }

    public double getFuelLvl() {
        return fuelLvl;
    }

    public double getFuelEfficiency() {
        return mpg;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String toString() {  //simple toString, all relevant values to string
        return ("===\nCAR NAME: " + name + "\nMANUFACTURER: " + manufacturer + "\nFUEL EFFICIENCY: " + mpg + " MPG\nFUEL LEVEL:" + fuelLvl + "\n===");
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

    public void setManufacturer(String manuf) {
        if (manuf.equals("")) {                 
            throw new IllegalArgumentException("You Cannot Have An Empty MANUFACTURER Field");
        }
        manufacturer = manuf;
    }

    public void setFuelEff(double mg) {
        if (mg <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL ECONOMY");
        }
        mpg = mg;
    }

    public void addGas(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("You Cannot Add A Negative FUEL AMOUNT");
        }
        fuelLvl += amt;
    }

    public void setFuelLvl(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative FUEL LEVEL");
        }
        fuelLvl = amt;
    }

    public boolean drive(double miles) {
        if (miles <= 0) {                           //Drives a specified number of miles
            throw new IllegalArgumentException("You Cannot Drive A Negative Number Of MILES");
        }
        double gasUsed = miles / mpg;               //Fuel usage
        if (gasUsed > fuelLvl) {                    //Boolean to check if possible
            return false;
        } else {
            fuelLvl -= gasUsed;                     //End results: fuel level & fleet miles
            totalMiles += miles;
            return true;
        }
    }
}
