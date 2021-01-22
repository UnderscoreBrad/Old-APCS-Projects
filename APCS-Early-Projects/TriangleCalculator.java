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
Date Completed:         Aug. 04, 2018
Date Due:               Aug. 30, 2018
 */
import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'Exit' At Any Point To Quit.");
        while (true) {
            //System.out.println("Press 1 to use doubles, Press 2 to use integers, Type 'Exit' to quit.");
            //String input = sc.next();
            // if (input.equals("1")) {
            //    useDoubles();
            // } else if (input.equals("2")) {
            useInts();
            //} else if (input.equalsIgnoreCase("exit")) {
            //  System.exit(0);
            // } else {
            //     System.out.println("Invalid input, please try again.");
            // }
        }
    }

    public static void useInts() {                                              //This one uses ints because it can
        boolean isTriangle = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of side one.");             //prompt and capture side lengths
        String userIn = sc.next();
        int s1 = tryCatcherExit(userIn);
        System.out.println("Please enter the length of side two.");
        userIn = sc.next();
        int s2 = tryCatcherExit(userIn);
        System.out.println("Please enter the length of side three.");
        userIn = sc.next();
        int s3 = tryCatcherExit(userIn);
        int longest = Math.max(s1, s2);
        longest = Math.max(s3, longest);
        int smallerSum = (s1 + s2 + s3) - longest;
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Please enter only positive length values.");    //check to make sure inputs are positive
        } else if (longest < smallerSum) {
            isTriangle = true;
            System.out.println("This is a triangle.");                          //Reports triangularity and type
            if (s1 == s2 && s2 == s3) {
                System.out.println("The triangle is equilateral.");
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                System.out.println("The triangle is isoceles.");
            } else if (s1 != s2 && s2 != s3 && s1 != s3) {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("This is not a triangle.");
        }
    }

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

    public static void useDoubles() {                                           //This is the code done once such that it uses doubles. It is currently dormant.
        Scanner sc = new Scanner(System.in);                                    //It can be revived if necessary, but I don't think so.
        boolean isTriangle = false;
        System.out.println("Please enter the length of side one.");             //prompt and capture side lengths
        double s1 = sc.nextDouble();
        System.out.println("Please enter the length of side two.");
        double s2 = sc.nextDouble();
        System.out.println("Please enter the length of side three.");
        double s3 = sc.nextDouble();
        double longest = Math.max(s1, s2);
        longest = Math.max(s3, longest);
        double smallerSum = (s1 + s2 + s3) - longest;
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Please enter only positive length values.");    //checks to make sure inputs are positive
        } else if (longest < smallerSum) {
            isTriangle = true;
            System.out.println("This is a triangle.");                          //reports triangularity and type
            if (s1 == s2 && s2 == s3) {
                System.out.println("The triangle is equilateral.");
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                System.out.println("The triangle is isoceles.");
            } else if (s1 != s2 && s2 != s3 && s1 != s3) {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("This is not a triangle.");
        }
    }
}
