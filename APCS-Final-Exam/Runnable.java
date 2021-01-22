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

We've had a great year but now it's time to yeet out.

Project Author:         Brad Estus
Project Group/Topic:    APCS
Project Type:           FINAL EXAM
Date Completed:         10 June 2019
Date Due:               11 June 2019
 */

import java.util.*;
import java.io.*;

public class Runnable {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ConnectFour cf = new ConnectFour();
        File dataIn = new File("testData.txt");
        try {
            sc = new Scanner(dataIn);
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        while (sc.hasNextLine()) {
            //System.out.println("Enter the column to place your piece.");
            int column = Integer.parseInt(sc.nextLine());
            if (cf.takeTurn(column)) {
                int w = cf.checkWin();
                if (w == 1) {
                    System.out.println("Player 1 Wins!");
                    break;
                } else if (w == 0) {
                    System.out.println("Player 2 Wins!");
                    break;
                }else if (w == -2){
                    System.out.println("Game Ends In A Draw!");
                    break;
                }
            } else {
                System.out.println("You cannot place a piece there! Column: " + column);
            }
        }
    }
}
