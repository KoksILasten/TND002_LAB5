package lab5;

public abstract class Employee extends Object implements Comparable<Employee> {

    public static final int BYNAME = 0;
    public static final int BYSALARY = 1;
    public static final int BYTAXES = 2;

    private String firstname;
    private String lastname;
    private int employeeNumber;
    private double salary;
    protected static int sortCriterion = 0;

    public Employee(String firstname, String lastname, int employeenumber, double salary) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.employeeNumber = employeenumber;
        this.salary = salary;

    }

    public int getNumber() {
        return employeeNumber;
        /** gets employeenumber */
    }

    public String getName() {
        return lastname;
        /** gets lastname */
    }

    public double getSalary() {
        return salary;
    }

    public static void changeCriterion(int arg) {
        sortCriterion = arg;
    }

    public abstract double computeTaxes();

    public String toString() {
        String result = "";

        if (sortCriterion == 0) {
            result += "\n" + String.format("%-12s %-12s %-8s", firstname, lastname, employeeNumber);

        } else if (sortCriterion == 1) {
            result += "\n" + String.format("%-12s %-12s %-8s %-13s", firstname, lastname, employeeNumber, salary);

        } else {
            result += "\n"
                    + String.format("%-12s %-12s %-8s %-13s", firstname, lastname, employeeNumber, computeTaxes());

        }

        return result;
    }

}
