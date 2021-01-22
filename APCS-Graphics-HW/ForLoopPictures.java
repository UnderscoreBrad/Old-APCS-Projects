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
Project Type:           JFrame (Logic)
Date Completed:         11/8/2018
Date Due:               11/9/2018
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ForLoopPictures extends JPanel implements ActionListener {

    private int counter;
    private int pixNum;

    public ForLoopPictures(JButton button) {
        counter = 0;
        pixNum = 0;
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        counter++;
        pixNum = counter;
        if (pixNum % 9 == 0) {
            pixNum = 0;
            counter = 0;
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (pixNum) {

            case 0:
                int y = 500,
                 x = 0;
                for (int i = 1; i <= 10; i++) {
                    g.setColor(new Color(i * 25, 0, 0));
                    g.fillRect(x, x, y, y);
                    x += 25;
                    y -= 50;
                }
                break;
            case 1:
                int f = 250;
                for (int i = 0; i < 500; i++) {
                    if (i < 250) {
                        g.setColor(new Color(0, 0, i));
                        g.drawLine(i, 0, i, i);
                    } else {
                        g.setColor(new Color(0, 0, f));
                        g.drawLine(i, 0, i, f);
                        f -= 1;
                    }
                }
                f = 250;
                for (int i = 0; i < 501; i++) {
                    if (i < 251) {
                        g.setColor(new Color(0, 0, i));
                        g.drawLine(i, 500, i, 500 - i);
                    } else {
                        g.setColor(new Color(0, 0, 250 - f));
                        g.drawLine(f + 250, 250 + f, f + 250, 500);
                        f -= 1;
                    }
                }
                break;
            case 2:                                                             //Yes it's 4 for loops, no I didn't want to spend my entire evening consolidating it.
                g.setColor(new Color(0, 0, 0));                                 
                g.fillRect(0, 0, 500, 500);
                lineArtYellow(g);                                               //It's better if we never look at these methods again  
                lineArtPurple(g);                                               //They get the job done and that's it.
                break;
            case 3:
                g.setColor(new Color(0, 0, 0));
                g.fillRect(0, 0, 500, 500);
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 1) {
                        g.setColor(new Color(250, 250, 250));
                    } else {
                        g.setColor(new Color(50, 250, 50));
                    }
                    g.fillOval(1 + 44 * i, 1 + 44 * i, 100, 100);
                }
                break;
            case 4:
                g.setColor(new Color(250, 250, 0));
                g.fillRect(50, 50, 450, 450);
                for (int i = 1; i < 19; i++) {                                  //honestly I just played with the numbers until it worked.
                    if (i < 10) {
                        g.setColor(new Color(250, 0, 0));                       //First half of the lines
                        g.drawLine(50, (50 * i), i * 50, 50);
                    } else {
                        int h = i - 10;
                        g.setColor(new Color(250, 0, 0));                       //Second half of the lines
                        g.drawLine(500, 450 - (50 * h), 450 - (50 * h), 500);
                    }
                }
                break;
            case 5:
                for (int x5 = 0; x5 < 100; x5++) {                                   //I was honestly about to blow my brains out here.
                    double trig = Math.sin((x5 / 4.5));                           //That /4.5 makes all the difference.
                    int y5 = (int) (trig * -100.0) + 200;                       //makes the curve look like a traditional sine graph (w/ -100) and places it in view (+200)
                    g.fillOval(x5 * 10, y5, 5, 5);                                //plots it sir
                }
                break;
            case 6:
                g.setColor(Color.black);                                        //It is now 8:00 PM, I have not eaten since 10:15 AM, I am hungry. I refuse to improve this code.
                int angle = 0;                                                  //It works as is, that's enough for me.
                for (int i = 0; i < 60; i++) {                                  
                    int x6 = (int) (200 * Math.cos(Math.toRadians(angle)));     //This wasn't fun, but it finds the X coordinate based on the angle given
                    int y6 = (int) (200 * Math.sin(Math.toRadians(angle)));     //This wasn't fun, but it finds the Y coordinate based on the angle given
                    if (angle % 30 == 0) {
                        int num = angle / 30;
                        num = (num+3)%12;
                        if(num==0){
                            num=12;
                        }
                        String time = Integer.toString(num);
                        g.drawString(time, 249+x6, 255+y6);
                        angle += 6;
                    } else {
                        g.drawOval(250 + x6, 250 + y6, 5, 5);
                        angle += 6;
                    }
                }
                break;
            case 7:
                circleArt(g);
                break;
            case 8:
                spirograph(g);
                break;
        }
    }

    public void lineArtYellow(Graphics g) {
        int x1 = 0;
        int y1 = 250;
        int x2 = 250;
        int y2 = 0;
        g.setColor(new Color(250, 250, 0));
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            y1 -= 25;
            x2 += 25;
            y2 += 25;
        }
       
        x1 = 0;
        y1 = 250;
        x2 = 250;
        y2 = 500;
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            y1 += 25;
            x2 += 25;
            y2 -= 25;
        }
    }

    public void lineArtPurple(Graphics g) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 250;
        int y2 = 250;
        g.setColor(new Color(250, 0, 250));
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            y1 += 25;
            x2 -= 25;
            y2 += 25;
        }
        
        x1 = 250;
        y1 = 250;
        x2 = 500;
        y2 = 500;
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            y1 -= 25;
            x2 -= 25;
            y2 -= 25;
        }
       
    }

    //HANLEY CODE BELOW
    public void circleArt(Graphics g) {
//Use parametric equations to generate 
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.black);
        g.drawOval(175, 175, 150, 150);

        int angle = 270;
        int radius = 50;
        int diameter = 50;
        g.setColor(Color.red);

        for (int i = 0; i < 36; i++) {
//Figure out the center of each circle
            int x = (int) (225 + 100 * Math.cos(Math.toRadians(angle)));
            int y = (int) (225 + 100 * Math.sin(Math.toRadians(angle)));
            g.drawOval(x, y, diameter, diameter);
            angle += 12;
        }

    }

    public void spirograph(Graphics g) {
//Use parametric equations to generate 
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.black);
        g.drawOval(175, 175, 150, 150);

        int angle = 270;
        int radius = 50;
        int diameter = 50;
        g.setColor(Color.red);

        for (int i = 0; i < 36; i++) {
//Figure out the center of each circle
            int x = (int) (225 + 100 * Math.cos(Math.toRadians(angle)));
            int y = (int) (225 + 100 * Math.sin(Math.toRadians(angle)));
            g.drawOval(x, y, diameter, diameter);
            angle += 12;
        }
        angle = 270;
        g.setColor(Color.blue);
        for (int i = 0; i < 36; i++) {
//Figure out the center of each circle
            int x = (int) (225 + 67 * Math.cos(Math.toRadians(angle)));
            int y = (int) (225 + 67 * Math.sin(Math.toRadians(angle)));
            g.drawOval(x, y, diameter, diameter);
            angle += 12;
        }
        angle = 270;
        g.setColor(Color.cyan);
        for (int i = 0; i < 36; i++) {
//Figure out the center of each circle
            int x = (int) (225 + 87 * Math.cos(Math.toRadians(angle)));
            int y = (int) (225 + 87 * Math.sin(Math.toRadians(angle)));
            g.drawOval(x, y, diameter, diameter);
            angle += 12;
        }
        angle = 270;
        g.setColor(new Color(30, 240, 100));
        for (int i = 0; i < 18; i++) {
//Figure out the center of each circle
            int x = (int) (225 + 45 * Math.cos(Math.toRadians(angle)));
            int y = (int) (225 + 45 * Math.sin(Math.toRadians(angle)));
            g.drawOval(x, y, diameter, diameter);
            angle += 24;
        }
        angle = 270;
        g.setColor(Color.orange);
        for (int i = 0; i < 72; i++) {
//Figure out the center of each circle
            int x = (int) (225 + 50 * Math.cos(Math.toRadians(angle)));
            int y = (int) (225 + 50 * Math.sin(Math.toRadians(angle)));
            g.drawOval(x, y, diameter, diameter);
            angle += 6;
        }
    }

}
