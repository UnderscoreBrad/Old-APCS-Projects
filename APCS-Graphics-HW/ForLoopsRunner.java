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
Project Group/Topic:    Graphics Homework with For Loops
Project Type:           JFrame (Main Class)
Date Completed:         11/8/2018
Date Due:               11/9/2018
 */
import java.awt.*;
import javax.swing.*;

public class ForLoopsRunner {

    public static void main(String args[]) {
        JFrame jf = new JFrame("ViCiOuS pRoGrAm MuRdErS sTuDeNt");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 600);
        Container c = jf.getContentPane();
        JButton nextPix = new JButton("New Picture");
        ForLoopPictures flp = new ForLoopPictures(nextPix);
        jf.add(flp);
        jf.add(nextPix, BorderLayout.SOUTH);
        jf.setVisible(true);
    }
}
