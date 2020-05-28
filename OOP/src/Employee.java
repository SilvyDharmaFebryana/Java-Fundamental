package OOP.src;

public class Employee {
    private int salary;
    public int overtime;
    public int payPerHour;

    public static int employeeCount;

    public Employee (int salary, int payPerHour) {
        setSalary(salary);
        setPayPerHour(payPerHour);
        employeeCount++;
    }

    public Employee(int salary) {
        this(salary, 0);
    }

    private void setSalary(int salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("salary cannot be bellow 0");
        }

        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    private void setOvertime(int overtime) {
        if (overtime <= 0) {
            throw new IllegalArgumentException("overtime cannot be bellow 0");
        }

        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    private void setPayPerHour(int payPerHour) {
        if (payPerHour < 0) {
            throw new IllegalArgumentException("payPerHour cannot be bellow 0");
        }
        this.payPerHour = payPerHour;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public int calculateWage () {
        return this.salary;
    }

    public int calculateWage (int overtime) {
        setOvertime(overtime);
        return this.salary + (this.overtime * this.payPerHour);
    }


}