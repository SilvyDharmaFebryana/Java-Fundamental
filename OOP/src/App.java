package OOP.src;
import java.util.ArrayList;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // gaji pokok
        // lembur(jam)
        // gajiPerjam

        // hitung gaji -> gaji pokok + (gajiPerJam * lembur)

        // Scanner scanner = new Scanner(System.in);
        // int salary = scanner.nextInt();
        // int payHour = scanner.nextInt();
        // Employee orang =  new Employee(50000, 100);  
        // Employee person =  new Employee(50000);    
        
        // orang.setSalary(scanner.nextInt());
        // orang.setOvertime(scanner.nextInt());
        // orang.setPayPerHour(scanner.nextInt());

        // int overtime = 20;

        // System.out.println(orang.calculateWage());

        tambahBuah();
        tampilMenu();

    }

    public static int calculatorWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }

    public static void tambahBuah () {

        while (true) {

            String inputBuah = readInput("Nama Buah: ");
        
            System.out.print("Input harga buah: ");
            int inputHarga = scanner.nextInt();
    
            System.out.print("Input stock buah: ");
            int inputStock = scanner.nextInt(); 

            Buah buah = new Buah(inputBuah, inputHarga, inputStock);

            listBuah.add(buah);

            System.out.println("Repeat? (y/n)");
            String option = scanner.next();
            if (option.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static String readInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public static String readInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void tampilMenu () {
        System.out.println("========= BUAH =========");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println((i +1) + ". " + listBuah.get(i).getNamaBuah() + " || " + listBuah.get(i).getHarga() + " || " + listBuah.get(i).getStock());
        }
    }


   
}
