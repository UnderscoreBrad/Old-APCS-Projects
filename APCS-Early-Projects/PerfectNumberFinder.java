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
Date Completed:         Aug. 19, 2018
Date Due:               Aug. 30, 2018
 */
import java.util.Scanner;
public class PerfectNumberFinder {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the number to check.");
        String userIn = sc.next();
        int number = 0;
        try {                                                               //Try catch to handle non-integers and exit commands. 
                if (userIn.equalsIgnoreCase("Exit") || userIn.equalsIgnoreCase("Quit")) {
                    System.exit(0);
                } else {
                    number = Integer.parseInt(userIn);
                }
            } catch (NumberFormatException ignore) {
                System.out.println("============================================================");
                System.out.println("Invalid Input. Please Try Again.");
            }
        int total = divSum(number);                                             //This will be used to display results after the divSum and isDivisor methods.
        if(total<number){
            System.out.println("=============================================");
            System.out.println(number + " is Deficient.");
            System.out.println("=============================================");
        }else if(total==number){
            System.out.println("=============================================");
            System.out.println(number + " is Perfect.");
            System.out.println("=============================================");
        }else if(total>number){
            System.out.println("=============================================");
            System.out.println(number + " is Abundant.");
            System.out.println("=============================================");
        }
        }
    }
    static boolean isDivisor(int num, int div){                                 //isDivisor is a small method that just checks if the number is a divisor
        boolean rtn = false;                                                    //if no returns false
        if(num%div==0){
            rtn = true;                                                         //if yes returns true
        }
        return(rtn);
    }
    static int divSum(int num){                                                 //divSum is divisorSum but smaller in name
        int i = 1;
        int rtn = 0;    
        while(i<num){
            boolean divCheck = isDivisor(num,i);                                //It runs through integers, then uses isDivisor to check them
            if(divCheck == true){                                               //If they check out, we have a good time.
                rtn = rtn+i;
                System.out.println(i+ " \t \t " + divCheck);
            }
            i++;
        }
        return(rtn);
    }
    
}
