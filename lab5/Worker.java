package lab5;

public class Worker extends Employee {

    /**
     * This constructor is called with the details of the worker and it passes these
     * on to the constructor of the superclass.
     * 
     * @param Worker Consists of firstname, lastname, the employee number and salary
     * @param super  Sends the information to superclass Employee
     */
    public Worker(String firstname, String lastname, int employeenumber, double salary) {
        super(firstname, lastname, employeenumber, salary);

    }

    /**
     * @param return returns amount of taxes paid by current worker
     * @param tax    25% taxrate
     */
    public double computeTaxes() {

        double tax = 0.25;
        return tax * this.getSalary();

    }

    /**
     * @if a value -1, 0, 1 depending on if the salary of this employee is higher,
     *     equal or lower than that of arg.
     * @arg Instance of employee
     * @this Current employee
     * 
     */
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
