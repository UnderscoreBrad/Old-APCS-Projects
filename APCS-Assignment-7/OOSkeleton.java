//S K E L E T O N S   A R E   B A D   F O R   Y O U R   H E A L T H 


import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class OOSkeleton {

    static final char ur = '\u2557';
    static final char ul = '\u2554';
    static final char top = '\u2550';
    static final char side = '\u2551';
    static final char sideTL = '\u2560';
    static final char sideRL = '\u2563';
    static final char bl = '\u255A';
    static final char br = '\u255D';

    public static void main(String[] args) {
        System.out.println("                    Mr Hanley's Rubrics Are All Wrong!");
        OOSkeleton es = new OOSkeleton();  //invoke constructor
    }

    public String padding(String text, int totalLength) {
        int difference = totalLength - text.length();
        if (difference > 0) {

            for (int i = 0; i < difference; i++) {
                text += " ";
            }
        }
        return text;
    }

    public OOSkeleton() {
        menu();
    }

    public void menu() {                                                        //Main menu:
        while (true) {
            Date now = new Date();
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(ur);
            System.out.println("\t\t" + side + "        OO Practice Main Menu            " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + sideTL);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        1 = Employee Example             " + side);     //Options given
            System.out.println("\t\t" + side + "        2 = Car Example                  " + side);
            System.out.println("\t\t" + side + "        3 = Student Example              " + side);
            System.out.println("\t\t" + side + "        4 = Enhanced Employee Example    " + side);
            System.out.println("\t\t" + side + "        5 = Enhanced Car Example         " + side);
            System.out.println("\t\t" + side + "        6 = Enhanced Student Example     " + side);
            System.out.println("\t\t" + side + "        7 = Planets                      " + side);
            System.out.println("\t\t" + side + "        8 = Custom Class - SpaceShip     " + side);
            System.out.println("\t\t" + side + "        9 = Exit                         " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(br);
            System.out.println("\t\tYour Selection?");
            Scanner sc = new Scanner(System.in);
            IntVerifier menuVer = new IntVerifier(sc, 0, true, 9, true);        //Verifier for menu choices
            int choice = menuVer.verifier();
            switch (choice) {
                case 0:
                    BEEUtilities.outputBOX("Bradley Estus - Period 8 - APCS");
                    break;
                case 1:
                    employeeModule();
                    break;
                case 2:
                    carModule();
                    break;
                case 3:
                    studentModule();
                    break;
                case 4:
                    //  employeeModuleWithMods();
                    break;
                case 5:
                    //   carModuleWithMods();
                    break;
                case 6:
                    //studentModuleWithMods();
                    break;
                case 7:
                    planets();
                    break;
                case 8:
                    spaceShips();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    public void employeeModule() {
        DecimalFormat df = new DecimalFormat("###,###,###");
        Employee e1 = new Employee("Chris Hanley", Double.MAX_VALUE);
        Employee e2 = new Employee("John Anderson", 52000);
        Employee e3 = new Employee("Steve Wozniak", 60000);
        while (true) {
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(ur);
            System.out.println("\t\t" + side + "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% " + side);
            System.out.println("\t\t" + side + "  E M P L O Y E E     M E N U            " + side);
            System.out.println("\t\t" + side + "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% " + side);
            System.out.print("\t\t" + sideTL);

            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        1 = Display Employees            " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Employee        " + side);
            System.out.println("\t\t" + side + "        3 = Give Raise                   " + side);
            System.out.println("\t\t" + side + "        4 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        5 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(br);
            System.out.println("\t\tYour Selection?");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            IntVerifier threeOptions = new IntVerifier(sc, 1, true, 3, true);
            switch (choice) {
                case 1:
                    System.out.println("_____________Display Employees____________");   //Employees displayed in order              
                    System.out.println(e1.getName() + "\t\t\t" + e1.getSalary());       //All using OO methods
                    System.out.println(e2.getName() + "\t\t\t" + e2.getSalary());
                    System.out.println(e3.getName() + "\t\t\t" + e3.getSalary());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("_____________Recreate Employee____________");
                    System.out.println("Which employee? 1 2 or 3:");
                    threeOptions = new IntVerifier(sc, 1, true, 3, true);       //Verifier
                    sc.skip("\n");                  
                    int whichOne = threeOptions.verifier();
                    System.out.println("Enter the employee name.");             //Collect recreation info
                    String eName = sc.nextLine();
                    System.out.println("Enter the employee salary.");
                    DoubleVerifier salaryVER = new DoubleVerifier(sc, 100, false, 1000000, true);
                    double eSalary = salaryVER.verifier();
                    switch (whichOne) {
                        case 1:                                                 //cases to apply info
                            e1.setName(eName);
                            e1.setSalary(eSalary);
                            break;
                        case 2:
                            e2.setName(eName);
                            e2.setSalary(eSalary);
                            break;
                        case 3:
                            e3.setName(eName);
                            e3.setSalary(eSalary);
                            break;
                    }

                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("Employee " + whichOne + " Updated");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 3:
                    System.out.println("$$$$$$$$$$$ Give Employee Raise $$$$$$$$$$$");
                    System.out.println("Which employee? 1 2 or 3:");        
                    sc.skip("\n");
                    whichOne = threeOptions.verifier();                             //verifier
                    System.out.println("Enter the employee Raise (Percentage)");
                    DoubleVerifier raiseVer = new DoubleVerifier(sc, 1.0, true, 50.0, true); //collect verifier info
                    double raise = raiseVer.verifier();
                    switch (whichOne) {
                        case 1:
                            e1.raise(raise);                                    //Employee's salary is raised by the percent given
                            break;
                        case 2:
                            e2.raise(raise);
                            break;
                        case 3:
                            e3.raise(raise);
                            break;
                    }
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("Employee " + whichOne + " Given Raise");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
            if (choice == 4) {
                break;
            }
        }
    }

    public void carModule() {
        Car c1 = new Car();
        Car c2 = new Car("Accord", "Honda", 30, 16);                            //2018 
        Car c3 = new Car("Supra", "Toyota", 18, 16);                            //DUDE IS THAT A SUPRA?
        while (true) {
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(ur);
            System.out.println("\t\t" + side + "  ______________________________________ " + side);
            System.out.println("\t\t" + side + "       C A R     M E N U                 " + side);
            System.out.println("\t\t" + side + "  ______________________________________ " + side);

            System.out.print("\t\t" + sideTL);

            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        1 = Display Cars                 " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Car             " + side);
            System.out.println("\t\t" + side + "        3 = Fill Up                      " + side);
            System.out.println("\t\t" + side + "        4 = Drive                        " + side);
            System.out.println("\t\t" + side + "        5 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        6 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 41; i++) {                                      
                System.out.print(top);
            }
            System.out.println(br);
            System.out.println("\t\tYour Selection?");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            IntVerifier threeOptions = new IntVerifier(sc, 1, true, 3, true);
            switch (choice) {
                case 1:
                    System.out.println("_____________Display Cars____________");
                    System.out.println("Name\t\tManufacturer\tMPG\tGas in Tank");
                    System.out.println(c1.getName() + "\t\t" + c1.getManufacturer() + "\t\t" + c1.getFuelEfficiency() + "\t\t" + c1.getFuelLvl());
                    System.out.println(c2.getName() + "\t\t" + c2.getManufacturer() + "\t\t" + c2.getFuelEfficiency() + "\t\t" + c2.getFuelLvl());
                    System.out.println(c3.getName() + "\t\t" + c3.getManufacturer() + "\t\t" + c3.getFuelEfficiency() + "\t\t" + c3.getFuelLvl());
                    break;
                case 2:
                    System.out.println("_____________Recreate Car____________");    //Car recreation, recreates the instance of the car.
                    System.out.println("Which car? 1 2 or 3:");                     //Sets all veriables to the supplied values
                    sc.skip("\n");
                    int which = threeOptions.verifier();
                    System.out.println("Enter the car name.");
                    String cName = sc.nextLine();
                    System.out.println("Enter the manufacturer");
                    String cManuf = sc.nextLine();
                    System.out.println("Enter the MPG rating");
                    DoubleVerifier mpgVer = new DoubleVerifier(sc, 5, true, 100, true);
                    double cMPG = mpgVer.verifier();
                    System.out.println("Enter the fuel amount.");
                    DoubleVerifier gallonsVer = new DoubleVerifier(sc, 0, true, 50, true);
                    double cFL = gallonsVer.verifier();
                    switch (which) {
                        case 1:
                            c1.setName(cName);
                            c1.setManufacturer(cManuf);
                            c1.setFuelEff(cMPG);
                            c1.setFuelLvl(cFL);
                            break;
                        case 2:
                            c2.setName(cName);
                            c2.setManufacturer(cManuf);
                            c2.setFuelEff(cMPG);
                            c2.setFuelLvl(cFL);
                            break;
                        case 3:
                            c3.setName(cName);
                            c3.setManufacturer(cManuf);
                            c3.setFuelEff(cMPG);
                            c3.setFuelLvl(cFL);
                            break;
                    }
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("Car " + which + " Updated");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 3:
                    System.out.println("_____________Fill Up____________");
                    System.out.println("Which car? 1 2 or 3:");                 //Okay, no more verifiers for me. I'm done with all that.
                    int whichOne = threeOptions.verifier();
                    System.out.println("How many gallons will you add?");
                    DoubleVerifier gAddedVer = new DoubleVerifier(sc, 0, true, 20, true);
                    double gAdd = gAddedVer.verifier();                         
                    switch (whichOne) {
                        case 1:
                            c1.addGas(gAdd);
                            break;
                        case 2:
                            c2.addGas(gAdd);
                            break;
                        case 3:
                            c3.addGas(gAdd);
                            break;
                    }
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("Car " + whichOne + " Added " + gAdd + " gallons!");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 4:
                    System.out.println("____________Drive Car____________");    //Drive a specific car.
                    System.out.println("Which car? 1 2 or 3:");
                    sc.skip("\n");
                    int wh = threeOptions.verifier();
                    System.out.println("How many miles?");
                    DoubleVerifier dVer = new DoubleVerifier(sc, 0, false, 1000, true);
                    Double dMiles = dVer.verifier();
                    boolean check = false;
                    switch (wh) {                                               //Yes it violates DRY but it was easier to do this way.
                        case 1:
                            check = c1.drive(dMiles);
                            if (!check) {
                                System.out.println("You cannot drive that far.");
                            }
                            break;
                        case 2:
                            check = c2.drive(dMiles);
                            if (!check) {
                                System.out.println("You cannot drive that far.");
                            }
                            break;
                        case 3:
                            check = c3.drive(dMiles);
                            if (!check) {
                                System.out.println("You cannot drive that far.");
                            }
                            break;
                    }
                    if (check) {
                        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                        System.out.println("Car " + wh + " Drove " + dMiles + " Miles");
                        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
            if (choice == 5) {
                break;
            }
        }
    }

    public void studentModule() {

        DecimalFormat df = new DecimalFormat("###,###,###");
        Student s1 = new Student("Francis Bedlam", 4, 400);
        Student s2 = new Student("Jeremy Clarkson", 4, 300);
        Student s3 = new Student("ByungHoon Han", 4, 100);
        char menuBox = '\u2660';
        while (true) {
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //_________________________________________");
            System.out.println(ur);
            System.out.print("\t\t" + side + "  ");
            for (int i = 0; i < 38; i++) {
                System.out.print(menuBox);
            }
            System.out.println(" " + side);
            System.out.println("\t\t" + side + "    S T U D E N T     M E N U            " + side);
            System.out.print("\t\t" + side + "  ");
            for (int i = 0; i < 38; i++) {
                System.out.print(menuBox);
            }
            System.out.println(" " + side);
            System.out.print("\t\t" + sideTL);

            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        1 = Display Students             " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Student         " + side);
            System.out.println("\t\t" + side + "        3 = Add Quiz Grade               " + side);
            System.out.println("\t\t" + side + "        4 = Clear Grades                 " + side);
            System.out.println("\t\t" + side + "        5 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        6 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            System.out.println(br);
            System.out.println("\t\tYour Selection?");
            Scanner sc = new Scanner(System.in);
            IntVerifier threeOptions = new IntVerifier(sc, 1, true, 3, true);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        if (i % 2 == 0) {
                            System.out.print("\u263A");
                        } else {
                            System.out.print("\u263B");
                        }
                    }
                    System.out.println("");
                    System.out.println("             Display Students");
                    for (int i = 0; i < 50; i++) {
                        if (i % 2 == 0) {
                            System.out.print("\u263A");
                        } else {
                            System.out.print("\u263B");
                        }
                    }
                    System.out.println("");
                    System.out.println("Name\t\t\tQuizzes\t\tAverage");
                    System.out.println("----\t\t\t----\t\t---------");
                    System.out.println(s1.getName() + "\t\t" + s1.getNumQuiz() + "\t\t" + s1.getAvgGrade());
                    System.out.println(s2.getName() + "\t\t" + s2.getNumQuiz() + "\t\t" + s2.getAvgGrade());
                    System.out.println(s3.getName() + "\t\t" + s3.getNumQuiz() + "\t\t" + s3.getAvgGrade());
                    for (int i = 0; i < 50; i++) {
                        if (i % 2 == 0) {
                            System.out.print("\u263A");
                        } else {
                            System.out.print("\u263B");
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    for (int i = 0; i < 45; i++) {

                        System.out.print("\u2206");

                    }
                    System.out.println("_____________Recreate Student____________");
                    System.out.println("Which student? 1 2 or 3:");
                    int which = threeOptions.verifier();
                    System.out.println("Enter the new student name.");
                    String sName = sc.nextLine();
                    System.out.println("Enter the new student quiz count.");
                    IntVerifier nqVer = new IntVerifier(sc, 0, true, 1000, true);
                    int quizCount = nqVer.verifier();
                    System.out.println("Enter the new total student score.");
                    IntVerifier tVer = new IntVerifier(sc, 0, true, 100000, true);
                    int tGrade = tVer.verifier();
                    switch (which) {
                        case 1:
                            s1.setName(sName);
                            s1.setNumQuizzes(quizCount);
                            s1.setStudentGrade(tGrade);
                            break;
                        case 2:
                            s2.setName(sName);
                            s2.setNumQuizzes(quizCount);
                            s2.setStudentGrade(tGrade);
                            break;
                        case 3:
                            s3.setName(sName);
                            s3.setNumQuizzes(quizCount);
                            s3.setStudentGrade(tGrade);
                            break;
                    }
                    System.out.println("((((((((((((()))))))))))))))))");
                    System.out.println("Student " + which + " Updated");
                    System.out.println("((((((((((((()))))))))))))))))");
                    break;
                case 3:
                    System.out.println("%^%^%^%^%^ Add Quiz %^%^%^%^%^");
                    System.out.println("Which student? 1 2 or 3:");
                    sc.skip("\n");
                    int whichOne = threeOptions.verifier();
                    System.out.println("What was the quiz score?");
                    IntVerifier qVer = new IntVerifier(sc, 0, true, 100, true);
                    int qScore = qVer.verifier();
                    switch (whichOne) {
                        case 1:
                            s1.addQuiz(qScore);
                            break;
                        case 2:
                            s2.addQuiz(qScore);
                            break;
                        case 3:
                            s3.addQuiz(qScore);
                            break;
                    }
                    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Student " + whichOne + " added quiz");
                    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    break;
                case 4:
                    System.out.println("============Clear Student===========");
                    System.out.println("Which student? 1 2 or 3:");
                    sc.skip("\n");
                    int whichStu = threeOptions.verifier();
                    switch (whichStu) {
                        case 1:
                            s1.clear();
                            break;
                        case 2:
                            s2.clear();
                            break;
                        case 3:
                            s3.clear();
                            break;
                    }
                    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Student " + whichStu + " cleared");
                    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    break;

                case 6:
                    System.exit(0);
            }
            if (choice == 5) {
                break;
            }
        }
    }

    public void planets() {
        Scanner sc = new Scanner(System.in);
        IntVerifier pVer = new IntVerifier(sc, 1, true, 9, true);
        Planet[] p = new Planet[9];
        p[0] = new Planet("Mercury", 88);
        p[1] = new Planet("Venus", 225);
        p[2] = new Planet("Earth", 365);
        p[3] = new Planet("Mars", 687);
        p[4] = new Planet("Jupiter", 4328.9);                                   //Where the Google Searches start to get sketchy
        p[5] = new Planet("Saturn", 10751.84);
        p[6] = new Planet("Uranus", 30667.48);
        p[7] = new Planet("Neptune", 60182);
        p[8] = new Planet();
        while (true) {
            System.out.println("\t\t===========================================");
            System.out.println("\t\t" + side + "        1 = Display Planets              " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Planet          " + side);
            System.out.println("\t\t" + side + "        3 = Add Days to System           " + side);
            System.out.println("\t\t" + side + "        4 = Add Days to Planet           " + side);
            System.out.println("\t\t" + side + "        5 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        6 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.println("\t\t===========================================");
            System.out.println("");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Display Planets:");
                    System.out.println("Name\t\tOrbits \t   Days Until Next \t Next Rotation");
                    for (int i = 0; i < 9; i++) {
                        System.out.println(p[i].getName() + "\t\t" + Math.round(p[i].getNumRotations() * 100) / 100 + "\t\t" + Math.round(p[i].daysUntilNext() * 100) / 100 + "\t\t  " + p[i].daysInNextRot());
                    }
                    break;
                case 2:
                    System.out.println("Which planet should be recreated (1-9)?");
                    int planetChosen = pVer.verifier() - 1;
                    System.out.println("What is the new planet name?");
                    String pName = sc.nextLine();
                    System.out.println("What is the planet's orbit period?");
                    double pDPR = sc.nextDouble();
                    System.out.println("What day should this planet begin with?");
                    double pDay = sc.nextDouble();
                    System.out.println("How many rotations should we begin with?");
                    int pNRot = sc.nextInt();
                    p[planetChosen] = new Planet(pName, pDay, pNRot, pDPR);
                    break;
                case 3:
                    System.out.println("How many days will be added to the system?");
                    double daysAdded = sc.nextDouble();
                    for (int j = 0; j < 9; j++) {
                        p[j].orbit(daysAdded);
                    }
                    break;
                case 4:
                    System.out.println("Which planet should have more days added?");
                    sc.skip("\n");
                    int pChoice = pVer.verifier() - 1;
                    System.out.println("How many days will be added to the planet?");
                    double daysAdd = sc.nextDouble();
                    p[pChoice].orbit(daysAdd);
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public void spaceShips() {
        Scanner sc = new Scanner(System.in);
        IntVerifier sVer = new IntVerifier(sc, 1, true, 4, true);
        SpaceShip[] s = new SpaceShip[4];
        s[0] = new SpaceShip("Interdictor", "Frigate", 3000, 100);
        s[1] = new SpaceShip("Vanguard", "Cruiser", 4000, 100);
        s[2] = new SpaceShip("Mercury FT", "Cargo", 2000, 100);
        s[3] = new SpaceShip();
        while (true) {
            System.out.println("\t\t===========================================");
            System.out.println("\t\t" + side + "        1 = Display Space Fleet          " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Vessel          " + side);
            System.out.println("\t\t" + side + "        3 = Engage Enemy With Ship       " + side);
            System.out.println("\t\t" + side + "        4 = Travel Distance              " + side);
            System.out.println("\t\t" + side + "        5 = Refuel Fleet                 " + side);
            System.out.println("\t\t" + side + "        6 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        7 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.println("\t\t===========================================");
            System.out.println("");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Display Space Fleet:");
                    System.out.println("Name\t\tClass\t\tHitPoints\tFuel%");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(s[i].getName() + "\t" + s[i].getType() + "\t\t" + s[i].getHP() + "\t\t" + s[i].getFuelPercent());
                    }
                    break;
                case 2:
                    System.out.println("Which planet should be recreated (1-4)?");
                    sc.skip("\n");
                    int shipChosen = sVer.verifier() - 1;
                    System.out.println("What is the new ship name?");
                    String sName = sc.nextLine();
                    System.out.println("What is the ship class?");
                    String sType = sc.nextLine();
                    System.out.println("What is the ship's HP?");
                    int sHP = sc.nextInt();
                    System.out.println("What is the current fuel percentage?");
                    double sFuel = sc.nextDouble();
                    s[shipChosen] = new SpaceShip(sName, sType, sHP, sFuel);
                    break;
                case 3:
                    System.out.println("Which ship should attack (1-4)?");
                    sc.skip("\n");
                    int attackShip = sVer.verifier() - 1;
                    boolean check = s[attackShip].engageAttack();
                    if(check){
                        System.out.println("The " + s[attackShip].getName() + " has won the engagement! HP Remaining: " + s[attackShip].getHP());
                    }else{
                        System.out.println("The " + s[attackShip].getName() + " has been destroyed.");
                    }
                    break;
                case 4:
                    System.out.println("Which ship should travel (1-4)?");
                    sc.skip("\n");
                    int tShip = sVer.verifier() - 1;
                    System.out.println("How far?");
                    int dist = sc.nextInt();
                    s[tShip].travelDist(dist);
                    System.out.println("The " + s[tShip].getName() + " has traveled and has " + s[tShip].getFuelPercent() + "% fuel remaining!");
                    break;
                case 5:
                    System.out.println("Refueling all ships.");
                    for(int i=0; i<4; i++){
                        s[i].setFuelPercent(100);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

// === === A S S I G N M E N T   E I G H T   B E L O W === ===
/* public void carModuleWithMods() {
        //Declare some Cars
        //aren't all the "With Mods" methods for Assignment 8?
        Car c1 = new Car();
        //FINISH
        while (true) {
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //_________________________________________");
            System.out.println(ur);
            System.out.println("\t\t" + side + "  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ " + side);
            System.out.println("\t\t" + side + "    C A R  M E N U  W I T H  M O D S     " + side);
            System.out.println("\t\t" + side + "  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ " + side);
            //FINISH

            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //_________________________________________
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        1 = Display Cars                 " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Car             " + side);
            System.out.println("\t\t" + side + "        3 = Fill Up                      " + side);
            System.out.println("\t\t" + side + "        4 = Drive                        " + side);
            System.out.println("\t\t" + side + "        5 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        6 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //+"_________________________________________
            System.out.println(br);
            System.out.println("\t\tYour Selection?");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("_____________Display Cars____________");
                    // CAR 1
                    //FINISH
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    // System.out.println("Car " + which + " Updated");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 3:
                    System.out.println("_____________Fill Up____________");

                    System.out.println("Which car? 1 2 or 3:");
                    int whichOne = sc.nextInt();
                    //FINISH
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    //   System.out.println("Car " + wh + " Drove " + f + " Miles");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
            if (choice == 5) {
                break;
            }
        }
    }

    public void employeeModuleWithMods() {
        DecimalFormat df = new DecimalFormat("###,###,###");
        //Declare some Employees
        Employee e1 = new Employee();
        Employee e2 = new Employee("John Anderson", 52000);
        Employee e3 = new Employee("Steve Wozniak", 60000);
        while (true) {
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //_________________________________________");
            System.out.println(ur);
            System.out.println("\t\t" + side + "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% " + side);
            System.out.println("\t\t" + side + "  %       E M P L O Y E E     M E N U  % " + side);
            System.out.println("\t\t" + side + "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% " + side);
            //
            //Num Employees Stuff
            //
            //FINISH in ASSIGN 8

            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //_________________________________________
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        1 = Display Employees            " + side);
            System.out.println("\t\t" + side + "        2 = Recreate one Employee        " + side);
            System.out.println("\t\t" + side + "        3 = Give Raise                   " + side);
            System.out.println("\t\t" + side + "        4 = Exit to Main                 " + side);
            System.out.println("\t\t" + side + "        5 = Exit Program                 " + side);
            System.out.println("\t\t" + side + "                                         " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 41; i++) {
                System.out.print(top);
            }
            //+"_________________________________________
            System.out.println(br);
            System.out.println("\t\tYour Selection?");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("_____________Display Employees____________");
                    System.out.println("Name\t\t\t$Salary");
                    System.out.println("----\t\t\t------");
                    System.out.println(e1.getName() + "\t\t\t" + e1.getSalary());
                    System.out.println(e2.getName() + "\t\t\t" + e2.getSalary());
                    System.out.println(e3.getName() + "\t\t\t" + e3.getSalary());
                    break;
                case 2:
                    System.out.println("_____________Recreate Employee____________");
                    System.out.println("Which employee? 1 2 or 3:");
                    int which = sc.nextInt();
                    Employee e = new Employee();
                    //TODO: FINISH

                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("Employee " + which + " Updated");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 3:
                    System.out.println("$$$$$$$$$$$ Give Employee Raise $$$$$$$$$$$");
                    System.out.println("Which employee? 1 2 or 3:");
                    int whichOne = sc.nextInt();
                    //TODO: FINISH

                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("Employee " + whichOne + " Given Raise");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
            if (choice == 4) {
                break;
            }
        }
    }

    public void studentModuleWithMods() {
        //FINISH Assignment 8
        //So I guess don't do it now?
    }
     */
}
