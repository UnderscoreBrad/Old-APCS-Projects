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
Date Completed:         Aug. 26 2018
Date Due:               Aug. 30 2018

This did not take nine hours.
That makes me worried, because it only took one.

 */
import java.io.IOException;                                                     //Imports
import java.util.Scanner;
import java.util.Random;

public class Craps {

    static int rollVal;                                                         //Useful globals, as few as I could get.
    static boolean useSeed = false;

    public static void main(String[] args) {                                    //just a quick way t have both the no-seed and 10-seed variations in one.
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'Exit' Between Rounds To Quit.");
        System.out.println("Use a seed? Y/N");
        String userIn = sc.next();
        if (userIn.equalsIgnoreCase("Y") || userIn.equalsIgnoreCase("Yes")) {
            useSeed = true;
            System.out.println("A Seed Of 10 Will Be Used.");
        } else if (userIn.equalsIgnoreCase("N") || userIn.equalsIgnoreCase("No")) {
            useSeed = false;
            System.out.println("No seed will be used.");
        }else{
            System.out.println("We'll Take That As A No.");
            useSeed = false;
        }
        int chips = 100;
        int wager = (int) (chips * 0.1);                                        //I only added this because the default wager is 10%
        int rollNum = 0;
        while (true) {                                                                      //For the true losers out there
            if (chips <= 0) {
                System.out.println("Mission Failed, We'll Get 'Em Next Time.");
                System.exit(0);
            }
            int firstRoll = 0;                                                          //Some variables
            System.out.println("You have " + chips + " Chips. Select Your Wager.");
            while (true) {
                userIn = sc.next();
                wager = tryCatcherExit(userIn);
                if (wager > chips || wager < 0) {
                    System.out.println("Your Wager Must Be Positive And Less Than Your Chip Bank.");                      //for the illiterate
                } else {
                    break;
                }
            }
            System.out.println("====================================================");
            boolean nextReroll = false;
            while (true) {                                                                                          //There used to be a Mission Failed here but it seemed to to nothing.
                roll();
                rollNum++;
                if (rollNum == 1) {
                    firstRoll = rollVal;
                }
                if ((rollVal == 7 && rollNum == 1) || (rollVal == 11 && rollNum == 1)) {                                //all of the wins and losses
                    System.out.println("INSTANT WINNER! You Get " + wager + " Chips");
                    chips = chips + wager;
                    rollNum = 0;
                    break;
                } else if ((rollVal == 2 && rollNum == 1) || (rollVal == 3 && rollNum == 1) || (rollVal == 12 && rollNum == 1)) {
                    System.out.println("IS THIS LOSS? You Lose " + wager + " Chips");
                    chips = chips - wager;
                    rollNum = 0;
                    break;
                } else if ((rollVal == 5 && rollNum == 1) || (rollVal == 9 && rollNum == 1) || (rollVal == 12 && rollNum == 1) || (rollVal == 6 && rollNum == 1)) {
                    nextReroll = true;
                } else if (rollVal == firstRoll && rollNum > 1) {
                    System.out.println("Winner! You Get " + wager + " Chips");
                    chips = chips + wager;
                    rollNum = 0;
                    break;
                } else if (rollVal == 7 && rollNum > 1) {
                    System.out.println("Loser! You Lose " + wager + " Chips");
                    chips = chips - wager;
                    rollNum = 0;
                    break;
                }
                System.out.println("Press [Enter] To Continue");                //Press [Enter] To Continue is my new favorite thing.
                try {
                    System.in.read();
                } catch (IOException ignore) {

                }
            }
        }
    }

    public static void roll() {                                                 //More of the quick way to have the 10-seed and no seed.
        if (useSeed == true) {
            int dice1 = (r2.nextInt(6) + 1);
            int dice2 = (r2.nextInt(6) + 1);
            rollVal = dice1 + dice2;
            System.out.println("You rolled a " + rollVal);
        } else if (useSeed == false) {
            int dice1 = (r.nextInt(6) + 1);
            int dice2 = (r.nextInt(6) + 1);
            rollVal = dice1 + dice2;
            System.out.println("You rolled a " + rollVal);
        }
    }
    static Random r = new Random();                                             //two randoms, one with a seed, one without.
    static Random r2 = new Random(10);

    public static int tryCatcherExit(String uInp) {                                     //Separating this out into its own method was a wonderful idea. 
        int rtn = 0;                                                                    //Unfortunately due to unique cases it doesn't make sense to retrofit it into other programs.
        try {                                                                           //Try catch to handle non-integers and exit commands. 
            if (uInp.equalsIgnoreCase("Exit") || uInp.equalsIgnoreCase("Quit")) {
                System.exit(0);
            } else {
                rtn = Integer.parseInt(uInp);
            }
        } catch (NumberFormatException ignore) {
            System.out.println("============================================================");
            System.out.println("Invalid Input. Please Try Again.");
        }   
        return (rtn);                                                               //It will be useful in the future though.
    }
}
