package lab5;

import java.util.ArrayList;

public class Director extends Employee {

    ArrayList<Worker> Workers;

    /**
     * 
     * @param firstname      is fistname
     * @param lastname       selfexplanetory
     * @param employeeNumber
     * @param salary
     */
    public Director(String firstname, String lastname, int employeeNumber, double salary) {
        super(firstname, lastname, employeeNumber, salary);
        Workers = new ArrayList<Worker>();
    }

    /**
     * 
     * @param arg is worker
     */
    public void addEmployee(Worker arg) {
        Workers.add(arg);
    }

    public double computeBonus() {
        double Bonus = 0;
        for (int i = 0; i < Workers.size(); i++) {
            Bonus += Workers.get(i).getSalary();
        }
        return Bonus * 0.1 + this.getSalary();
    }

    public double computeTaxes() {
        double tax = 0.25;
        return tax * this.computeBonus();
    }

    public int compareTo(Employee arg) {
        if (this.getSalary() > arg.getSalary()) {

            return -1;
        } else if (this.getSalary() == arg.getSalary()) {

            return 0;
        } else {

            return 1;
        }
    }
}
