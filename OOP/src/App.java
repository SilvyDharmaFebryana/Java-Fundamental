package OOP.src;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("***** pilih menu *****");
            System.out.println("1. Tambah Buah");
            System.out.println("2. List Buah");
            System.out.println("3. Exit");
            String menuOption = scanner.next();

            if ( menuOption.equals("1")) {
                Menu.tambahBuah();
            } else if (  menuOption.equals("2") ) {
                Menu.tampilListBuah();
            } else if ( menuOption.equals("3")) {
                break;
            };
        }

    }


 


   
}
