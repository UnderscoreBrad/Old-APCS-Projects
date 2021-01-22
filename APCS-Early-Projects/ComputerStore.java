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
Date Completed:         [DATE]
Date Due:               [DUE]
 */
import java.util.Scanner;

public class ComputerStore {

    public static void main(String[] args) {
        System.out.println("============================================================ WELCOME, USER. ============================================================");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Cost of the Item Being Purchased. Type 'PRICING' for a Pricing Chart.");
            String userIn = sc.next();
            if (userIn.equalsIgnoreCase("pricing")) {
                pricingList();
            } else {
                double totalCost = inputCheck(userIn);
                System.out.println("Enter the Annual Percentage Rate of Interest.");
                userIn = sc.next();
                double interestPercent = inputCheck(userIn);
                System.out.println("Enter the Downpayment Percentage.");
                userIn = sc.next();
                double downPayPercent = inputCheck(userIn);
                double downPay = totalCost * (downPayPercent / 100);
                System.out.println("You have input a total cost of " + totalCost);
                System.out.println("With interest at " + interestPercent + "%");
                System.out.println("And a downpayment of " + downPayPercent + "% or %" + downPay);
                System.out.println("CONFIRM: Y/N");
                userIn = sc.next();
                if (userIn.equalsIgnoreCase("N") || userIn.equalsIgnoreCase("No") || userIn.equalsIgnoreCase("Decline")) {

                } else {
                    System.out.println("========================================================================================================================================");
                    System.out.println("                                                          |Scheduled Payments|                                                          ");
                    System.out.println("========================================================================================================================================");
                    int f = 10;
                    String one = "Start Bal.";
                    String two = "Principal";
                    String three = "Interest";
                    String four = "Payment";
                    String five = "End Bal.";
                    System.out.format("Month %25s%25s%25s%25s%25s", one, two, three, four, five);
                    System.out.println("");
                    double amtRemainingStart = totalCost - downPay;
                    int month = 1;
                    double principal = 0;
                    interestPercent = (interestPercent / 12.0) / 100;
                    double interest = 0;
                    double payment = amtRemainingStart * 0.05;
                    double amtRemainingEnd = 0;
                    while (amtRemainingStart > 0) {
                        if (amtRemainingStart < payment) {
                            amtRemainingStart = rnd(amtRemainingStart);
                            interest = amtRemainingStart * (interestPercent);
                            principal = payment - interest;
                            principal = rnd(principal);
                            interest = rnd(interest);
                            payment = amtRemainingStart;
                            amtRemainingEnd = 0.0;
                            System.out.format("%3s%28s%25s%25s%25s%25s", month , amtRemainingStart, principal, interest, payment, amtRemainingEnd);
                            System.out.println("");
                            break;
                        } else {
                            amtRemainingStart = rnd(amtRemainingStart);
                            interest = amtRemainingStart * (interestPercent);
                            principal = payment - interest;
                            principal = rnd(principal);
                            interest = rnd(interest);
                            amtRemainingEnd = amtRemainingStart + interest - payment;
                            amtRemainingEnd = rnd(amtRemainingEnd);
                            System.out.format("%3s%28s%25s%25s%25s%25s", month , amtRemainingStart, principal, interest, payment, amtRemainingEnd);
                            System.out.println("");
                            amtRemainingStart = amtRemainingEnd;
                            month++;
                        }
                    }
                }
            }
        }
    }

    public static double rnd(double num) {
        double rtn = 0;
        rtn = num * 100;
        rtn = Math.round(rtn);
        rtn = rtn / 100.0;
        return (rtn);
    }

    public static double inputCheck(String uInp) {                                     //Separating this out into its own method was a wonderful idea. 
        double rtn = 0;                                                                //Unfortunately due to unique cases it doesn't make sense to retrofit it into other programs.
        try {                                                                          //Try catch to handle non-integers and exit commands. 
            if (uInp.equalsIgnoreCase("Exit") || uInp.equalsIgnoreCase("Quit")) {
                System.exit(0);
            } else {
                rtn = Double.parseDouble(uInp);
            }
        } catch (NumberFormatException ignore) {
            System.out.println("========================================================================================================================================");
            System.out.println("Invalid Input. Please Try Again.");
        }
        return (rtn);                                                               //It will be useful in the future though.
    }
    public static void pricingList(){
        System.out.println("=====================================");
                System.out.println("Premium X-CLASS RGB...........$12,000");
                System.out.println("Premium X-CLASS Standard......$11,000");
                System.out.println("Editor's X-CLASS..............$10,000");
                System.out.println("GAMING X-CLASS RGB.............$9,500");
                System.out.println("Elite A-CLASS RGB..............$5,000");
                System.out.println("Elite A-CLASS Standard.........$4,500");
                System.out.println("Stealth AL-TF4 R4 G3...........$2,000");
                System.out.println("Deus GAMING OC.................$1,750");
                System.out.println("Centurion Gen2.................$1,500");
                System.out.println("Sentinel Win L.................$1,100");
                System.out.println("Xenon Vortex...................$1,000");
                System.out.println("Argon T9.........................$940");
                System.out.println("Phosphor H81.....................$800");
                System.out.println("Titanium L11.....................$700");
                System.out.println("Titanium L9......................$600");
                System.out.println("Titanium L7......................$500");
                System.out.println("Productivity P4..................$400");
                System.out.println("Productivity P3..................$300");
                System.out.println("Productivity P2..................$250");
                System.out.println("=====================================");
    }
}
