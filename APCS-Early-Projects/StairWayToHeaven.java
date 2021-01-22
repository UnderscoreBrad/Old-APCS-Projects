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
Date Completed:         Sept. 26, 2018
Date Due:               Sept. 27, 2018
 */
import java.util.Scanner;

public class StairWayToHeaven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cutoff Integers Over 10? Y/N");                     //This is just in case we weren't supposed to include sizes over 10
        String userIn = sc.next();
        boolean cut11 = false;
        if (userIn.equalsIgnoreCase("Y") || userIn.equalsIgnoreCase("Yes") || userIn.equalsIgnoreCase("Indeed")) {
            cut11 = true;
        } else {
            cut11 = false;
        }
        while (true) {
            System.out.println("Please enter the name of the staircase you desire.");   //==== M E N U ====
            System.out.println("It must be an integer. Type 'Exit' to quit.");
            userIn = sc.next();
            int size = inputCheck(userIn);
            int ct = 2;                                                         //ct is just a variable which reduces with each pass so as to keep from printing too much.
            int numInLine = 1;                                                  //I probably could have just done this without ct but ct is a good guy and I'm lazy.
            if (cut11 && size >= 10) {
                System.out.println("You can't do that!");
            } else {
                for (int k = 0; k < size; k++) {
                    for (int spaces = 0; spaces < (size + 1) - ct; spaces++) {  //This prints empty spaces before the top of a box
                        System.out.print("    ");
                    }
                    for (int boxes = 0; boxes < numInLine; boxes++) {           //This prints the top of the boxes in a line
                        System.out.print("+---");
                    }
                    System.out.println("+");                                    //This finishes off a top box
                    for (int spaces = 0; spaces < (size + 1) - ct; spaces++) {  //This prints the spaces before the middle of a box
                        System.out.print("    ");
                    }
                    for (int boxes = 0; boxes < numInLine; boxes++) {           //This prints the sides of boxes
                        System.out.print("|   ");
                    }
                    System.out.println("|");                                    //This finishes off the box-sides in a line
                    numInLine += 1;
                    ct += 1;
                    if (numInLine > size) {                                     //Writes out a bottom row, which would be left out otherwise.
                        for (int p = 0; p < size; p++) {
                            System.out.print("+---");                               //Most of the bottom row here.
                        }
                        System.out.println("+");                                //Final character + new line.
                        break;
                    }
                }
            }
        }
    }

    public static int inputCheck(String uInp) {                                     //Separating this out into its own method was a wonderful idea. 
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
        return (rtn);
    }
}
