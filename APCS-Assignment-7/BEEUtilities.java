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
Project Group/Topic:    APCS
Project Type:           Console Application
Date Completed:         [DATE]
Date Due:               [DUE]
 */

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class BEEUtilities {

    public static void outputSQRT() {
        for (int i = 1; i <= 1000; i++) {
            double j = (double) Math.sqrt(i);
            System.out.println(i + "\t" + j);
        }
    }

    public static void outputBOX(String input) {
        if (input.length() > 100) {
            input = input.substring(0, 100);
        }
        int size = input.length();
        size += 2;
        for (int i = 0; i < size + 2; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.print("|");
        System.out.print("/");
        for (int i = 0; i < size - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        System.out.println("|");
        System.out.print("| ");
        System.out.print(input);
        System.out.println(" |");
        System.out.print("|");
        System.out.print("\\");
        for (int i = 0; i < size - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("/");
        System.out.println("|");
        for (int i = 0; i < size + 2; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // THESE METHODS ARE EXTRA AND ONLY FOR MY CONVENIENCE AND EASE OF IMPLEMENTATION
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static int inputCheckInt(String uInp) {                                     
        int rtn = -Integer.MAX_VALUE;                                                                
        try {                                                                          
            if (uInp.equalsIgnoreCase("Exit") || uInp.equalsIgnoreCase("Quit")) {
                System.exit(0);
            } else {
                rtn = Integer.parseInt(uInp);
            }
        } catch (NumberFormatException ignore) {
            System.out.println("Bad Character.");
        }
        return (rtn);                                                              
    }

    public static double inputCheckDouble(String uInp) {
        double rtn = -Double.MAX_VALUE;                                                                
        try {                                                                          
            if (uInp.equalsIgnoreCase("Exit") || uInp.equalsIgnoreCase("Quit")) {
                System.exit(0);
            } else {
                rtn = Double.parseDouble(uInp);
            }
        } catch (NumberFormatException ignore) {
            System.out.println("Bad Character.");
        }
        return (rtn);                                                               
    }
    static Clip deniedAudio;

    public static void errorAudio() {
        File denied16 = new File("AudioResources/Denied16.wav");
        deniedAudio = null;
        try {
            deniedAudio = AudioSystem.getClip();
            deniedAudio.open(AudioSystem.getAudioInputStream(denied16));
        } catch (Exception ignore) {
            System.out.println("Audio Issue When Loading.");
        }
        deniedAudio.setFramePosition(0);
        deniedAudio.start();
    }

    static Clip verifiedAudio;
        
    
    public static void verAudio() {
        File verified16 = new File("AudioResources/Verified16.wav");
        verifiedAudio = null;
        try {
            verifiedAudio = AudioSystem.getClip();
            verifiedAudio.open(AudioSystem.getAudioInputStream(verified16));
        } catch (Exception ignore) {
            System.out.println("Audio Issue When Loading.");
        }
        verifiedAudio.setFramePosition(0);
        verifiedAudio.start();
    }
}

