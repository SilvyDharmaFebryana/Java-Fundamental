package OOP.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // gaji pokok
        // lembur(jam)
        // gajiPerjam

        // hitung gaji -> gaji pokok + (gajiPerJam * lembur)

        Scanner scanner = new Scanner(System.in);
        // int salary = scanner.nextInt();
        // int payHour = scanner.nextInt();
        Employee orang =  new Employee(50000, 100);  
        Employee person =  new Employee(50000);    
        
        // orang.setSalary(scanner.nextInt());
        // orang.setOvertime(scanner.nextInt());
        // orang.setPayPerHour(scanner.nextInt());

        // int overtime = 20;

        // System.out.println(orang.calculateWage());

        // System.out.println(Employee.employeeCount);
        System.out.println(person.calculateWage());
    }

    public static int calculatorWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }
}
