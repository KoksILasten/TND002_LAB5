package lab5;

import javax.swing.*;

public class Lab5 {

    public static void main(String[] args) {

        Company theCompany = new Company();

        /*
         * Directors are created as objects with an own reference variable because they
         * are added to
         * Workers. The entries in the constructor are the first name, surname, employee
         * number and salary.
         */

        Director director1 = new Director("John", "Smith", 1, 700000.0);
        Director director2 = new Director("Elaine", "Garret", 2, 670000.0);

        /** We add the directors to the company */

        theCompany.addEmployee(director1);
        theCompany.addEmployee(director2);

        /** We add workers to the company and assign them to a director. */

        theCompany.addEmployee(new Worker("Paul", "Johnson", 3, 400000.0), director1);
        theCompany.addEmployee(new Worker("Sarah", "Davidson", 4, 420000.0), director1);
        theCompany.addEmployee(new Worker("Doris", "McClure", 5, 470000.0), director1);
        theCompany.addEmployee(new Worker("James", "Adams", 6, 340000.0), director1);
        theCompany.addEmployee(new Worker("Sam", "Cooper", 7, 460000.0), director2);
        theCompany.addEmployee(new Worker("Andrea", "Lester", 8, 460000.0), director2);
        theCompany.addEmployee(new Worker("Olga", "Gibbs", 9, 420000.0), director2);

        /**
         * Here we change the sorting criterium using the class constants of Employee:
         * BYNAME = 0, BYSALARY = 1, BYTAXES = 2.
         */

        /** This is the code for part B. */
        Employee.changeCriterion(Employee.BYTAXES);
        System.out.println(theCompany);

        String answr = JOptionPane.showInputDialog("Sort by\n1. BYNAME\n2. BYSALARY\n3. BYTAXES");

        while (!answr.equals("1") && !answr.equals("2") && !answr.equals("3")) {
            JOptionPane.showMessageDialog(null, "Try again!");
            answr = JOptionPane.showInputDialog("Sort?");
        }
        Employee.changeCriterion(Integer.valueOf(answr));
        JOptionPane.showMessageDialog(null, theCompany);
        /** Checks input and writes out the according table */
    }
}
