package lab5;

import java.util.ArrayList;
import java.util.Collections;

public class Company extends Object {

    ArrayList<Employee> theWorkers;

    public Company() {
        theWorkers = new ArrayList<Employee>();
    }

    // This instance method adds a director to the dynamic array of employees.
    public void addEmployee(Director director) {
        theWorkers.add(director);
    }

    // This instance method adds a worker to the dynamic array ofemployees and
    // attaches it to one director.
    public void addEmployee(Worker worker, Director director) {
        theWorkers.add(worker);
        director.addEmployee(worker);
    }

    /**
     * This instance method writes out a header followed by the sorted list of
     * employees.
     * 
     * @result Making a table
     * @Collections.sort Sorting java functions is basepackage
     */
    public String toString() {
        String result = "List of Employees" + "\n";
        result += "---------------------" + "\n";

        if (Employee.sortCriterion == 0) {
            result += String.format("%-12s %-12s %-8s", "First name", "Surname", "Number") + "\n";

        } else if (Employee.sortCriterion == 1) {
            result += String.format("%-12s %-12s %-8s %-8s", "First name", "Surname", "Number", "Salary") + "\n";

        } else {
            result += String.format("%-12s %-12s %-8s %-8s", "First name", "Surname", "Number", "Taxes") + "\n";
        }

        Collections.sort(theWorkers);

        for (Employee e : theWorkers) {
            result += e.toString();
        }

        return result;
    }

}
