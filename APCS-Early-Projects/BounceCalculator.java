/*
THIS IS FOR APCS
APCS WITH THE HANLEY

Three Hanleys for the Elven-kings under the sky,
Seven for the Dwarf-lords in their halls of stone,
Nine for Mortal Men doomed to die,
One for the Dark Lord on his dark throne
In the Land of Mordor where the Shadows lie.

One Hanley to rule them all, One Hanley to find them,
One Hanley to bring them all and in the darkness bind them
In the Land of Mordor where the Shadows lie.

Project Author:         Brad Estus
Project Group/Topic:    APCS Summer Work
Project Type:           Console Application
Date Completed:         Aug. 22, 2018
Date Due:               Aug. 30, 2018

This did not take six hours.
That makes me worried, because it only took one.
 */
import java.util.Scanner;

public class BounceCalculator {

    public static int height = 0;
    public static double index = 0;
    public static int bounceCount = 0;

    public static void main(String[] args) {
        while(true){                                                            //Why use separate methods? Because everything in Main would be a giant mess.
        setupInputs();
        bounces();
        }
    }

    public static void setupInputs() {
        Scanner sc = new Scanner(System.in);                                    //Initialize scanner as sc
        while (true) {                                                          //prompt and capture height
            System.out.println("============================================================");
            System.out.println("Type 'Exit' at any stage to quit.");
            System.out.println("Enter start height.");
            System.out.println("============================================================");
            String userIn = sc.next();                                          //Prompt for user input

            try {                                                               //Try-Catch to handle non-integers and exit commands. 
                if (userIn.equalsIgnoreCase("Exit") || userIn.equalsIgnoreCase("Quit")) {
                    System.exit(0);
                } else {                                                            
                    height = Integer.parseInt(userIn);
                }
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("============================================================");
                System.out.println("Invalid Input. Please Try Again.");
            }
        }
        while (true) {                                                          //prompt and capture bounce index
            System.out.println("============================================================");
            System.out.println("Enter the bounce index, 0.1 to 0.9");
            System.out.println("============================================================");
            String userIn = sc.next();

            try {                                                               //This Try-Catch handles non doubles, invalid values, and exit commands
                if (userIn.equalsIgnoreCase("Exit") || userIn.equalsIgnoreCase("Quit")) {
                    System.exit(0);
                } else {
                    index = Double.parseDouble(userIn);
                    if (index <= 0.9 && index >= 0.1) {
                        break;
                    } else {
                        System.out.println("============================================================");
                        System.out.println("Invalid Input. Please Try Again.");
                    }
                }
            } catch (NumberFormatException ignore) {
                System.out.println("============================================================");
                System.out.println("Invalid Input. Please Try Again.");
            }
        }
        while (true) {                                                          //prompt and capture number of bounces
            System.out.println("============================================================");
            System.out.println("Enter the number of bounces.");
            System.out.println("============================================================");
            String userIn = sc.next();

            try {                                                               //Try-catch to handle non-integers and exit commands.
                if (userIn.equalsIgnoreCase("Exit") || userIn.equalsIgnoreCase("Quit")) {
                    System.exit(0);
                } else {
                    bounceCount = Integer.parseInt(userIn);
                }
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("============================================================");
                System.out.println("Invalid Input. Please Try Again.");
            }
        }
    }

    public static void bounces() {                                              //this method does the math for the bounces.
        double bh = height;                                                     //bh is a temp variable for height
        int bc = 0;                                                             //bc is a temp variable for bounce count
        double totalDist = 0;
        System.out.println("");
        System.out.println("\t \t \t Results:");
        System.out.println("============================================================");
        while (bc < bounceCount && bh > 0.001) {                                //Loops through bounces
            bc++;
            System.out.println("Bounce Number: " + bc);
            System.out.println("Down: " + bh);
            totalDist = totalDist + bh;                                         //total distance + down
            bh = bh*(index);                                                    //calculate next bounce
            totalDist = totalDist + bh;                                         //total distance + up
            System.out.println("Up: " + bh);                                    
            System.out.println("============================================================");
        }
        if(bh < 0.001){
            System.out.println("Further bounces are insignificant.");
        }
        System.out.println("Total Distance Traveled: " + totalDist);            //displays the distance traveled
        System.out.println("");
        System.out.println("");
    }
}
