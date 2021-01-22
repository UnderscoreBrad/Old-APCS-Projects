/*
=================================================================================
Project Author:         Brad Estus
Project Group/Topic:    APCS Assign 8
Project Type:           Object Class
Date Completed:         31 Jan 2019
Date Due:               1 Feb 2019
=================================================================================
 */

public class Student {

    //===========================================================================
    //                        STATIC VARIABLES
    //===========================================================================
    public static int numStudents = 0;
    public static int totalPoints = 0;
    public static int totalNumQuiz = 0;
    //===========================================================================
    //                       INSTANCE VARIABLES
    //===========================================================================
    private String name;
    private int numQuizzes;
    private int studentGrade;

    //===========================================================================
    //                       C O N S T R U C T O R S
    //===========================================================================
    public Student() {
        name = "<No Name>";
        numQuizzes = 0;
        studentGrade = 0;
        numStudents++;
    }

    public Student(String nm) {
        if (nm.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }            //EVERYONE GETS AN EXCEPTION TO THROW!
        name = nm;
        numQuizzes = 0;
        studentGrade = 0;
        numStudents++;
    }

    public Student(String nm, int nq, int tg) {
        if (nm.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;
        if (nq <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative NUMBER OF QUIZZES");
        }
        numQuizzes = nq;
        if (tg <= 0) {
            throw new IllegalArgumentException("You Cannot Have Negative TOTAL POINTS");
        }
        studentGrade = tg;
        numStudents++;
    }

    //===========================================================================
    //                       A C C E S S O R S
    //===========================================================================
    public String getName() {
        return name;             //these guys don't get exceptions though
    }

    public int getNumQuiz() {
        return numQuizzes;
    }

    public int getTotalGrade() {
        return studentGrade;
    }

    public int getAvgGrade() {
        if (numQuizzes == 0) {
            return 0;
        } else {
            return (studentGrade / numQuizzes);
        }
    }
    public String toString(){  //simple toString, all relevant values to string
        return ("===\nSTUDENT NAME: " + name + "\nNUMBER OF QUIZZES: " + numQuizzes + "\nSTUDENT GRADE: " + studentGrade + "\n===");
    }

    //===========================================================================
    //                       M U T A T O R S
    //===========================================================================
    public void setName(String nm) {
        if (nm.equals("")) {
            throw new IllegalArgumentException("You Cannot Have An Empty NAME Field");
        }
        name = nm;
    }

    public void setNumQuizzes(int nq) {
        if (nq <= 0) {
            throw new IllegalArgumentException("You Cannot Have A Negative NUMBER OF QUIZZES");
        }
        totalNumQuiz -= numQuizzes;
        numQuizzes = nq;
        totalNumQuiz += nq;

    }

    public void setStudentGrade(int tg) {
        if (tg <= 0) {
            throw new IllegalArgumentException("You Cannot Have Negative TOTAL POINTS");
        }
        totalPoints -= studentGrade;
        studentGrade = tg;
        totalPoints += tg;
    }

    public void addQuiz(int grade) {
        if (grade <= 0) {
            throw new IllegalArgumentException("You Cannot Have Negative QUIZ GRADE");
        }
        studentGrade += grade;
        numQuizzes++;
        totalNumQuiz++;
        totalPoints += grade;
    }

    public void clear() {
        totalNumQuiz -= numQuizzes;
        totalPoints -= studentGrade;
        numQuizzes = 0;
        studentGrade = 0;
    }
}
