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

import java.util.Scanner;

public class DoubleVerifier {

    public DoubleVerifier(Scanner sr, double lo, boolean incLo, double hi, boolean incHi) { //clips are included in the Utilities Class
        sc = sr;
        low = lo;
        lowInc = incLo;
        high = hi;
        highInc = incHi;
    }
    

    public double verifier() {
        double rtn = -Double.MAX_VALUE;
        double inVal = 0;
        while (true) {
            boolean goodLo = false, goodHi = false;
            String inString = sc.nextLine();
            inVal = BEEUtilities.inputCheckDouble(inString);                    //inputCheckDouble converts strings to double, it's an old method now included in Utilities.
            if (lowInc) {
                if (inVal >= low)
                    goodLo = true;

            } else {
                if (inVal > low)
                    goodLo = true;
            }
            if (highInc) {
                if (inVal <= high)
                    goodHi = true;
            } else {
                if (inVal < high)
                    goodHi = true;
            }
            if (inVal == -Double.MAX_VALUE) {
                goodLo = goodHi = false;
            }
            if (goodLo && goodHi) {
                rtn = inVal;
                BEEUtilities.verAudio();                                    //Because it's all in utilities, adding verification audio was easy.
                break;
            } else {
                BEEUtilities.errorAudio();                                  //Again, clips are in the Utilities method, because it's easier and more reusable that way.
                System.out.println("Invalid Input. Please Try Again.");
            }
        }
        return (rtn);
    }
    private Scanner sc;
    private double low, high;
    private boolean lowInc, highInc;
}
