/**
 * ---------------------------------------------------------------------------
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ---------------------------------------------------------------------------
 * FILE: Employee.java
 *
 * DATE:  Nov 3, 2014
 *
 * PURPOSE: Employee problem from Big Java
 *
 * @author mr Hanley
 * @version 1.0
 * ---------------------------------------------------------------------------
 *
 * h-a-n-l-e-y.c-o-.-n-r------t-e-a-m-2-0-.-c-o-m-----------------------------
 */
import java.text.DecimalFormat;

public class Employee {

    //----------------------------------------------------------------
    //---------------- I N S T A N C E V A R I A B L E S ------------
    //----------------------------------------------------------------
    private double salary;
    private String name;

    //------|+@-CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC-|+@------
    //------|+@-CCCCCCCCC  C O N S T R U C T O R S  CCCCCCCC-|+@------
    //------|+@-CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC-|+@------
    public Employee() {
        name = "<No Name>";
    }

    public Employee(String na, double sal) {
        name = na;
        salary = sal;
    }

    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAA  A C C E S S O R S  AAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public String getName() {
        return name != null ? name : "             ";
    }

    public double getSalary() {
        return salary;
    }

    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMM  M U T A T O R S   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void setName(String n) {
        name = n;
    }

    /**
     * setSalary preconditions: sal >0
     *
     * @param sal salary which must be 0 or positive
     *
     */
    public void setSalary(double sal) {
        if (sal >= 0) {
            salary = sal;
        }
    }

    /**
     *
     * @param byPercent a number > 0 which represents the raise to annual salary
     */
    public void raise(double byPercent) {
        salary += salary * byPercent / 100;
  
    }

}