import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World !");
        // System.out.println("silvy silvy silvy");

        // int number = 11;
        // System.out.println(number);


        //--- data type ---

        byte umur = 91; // range max 1127
        short age = 140 ;
        float iniFloat = 122.2f;
        String nama = "nama saya silvy";
        char grade = 'A';


        // --- array ---
        String people[] = new String[5];
        people[0] = "santi";

        // int number[] = {1, 2, 3, 4, 5};


        // --- looping array ---
        int angka[] = new int[5];
        for (int i = 0 ; i < angka.length ; i++) {
            angka[i] = i + 1;
        }

        System.out.println(Arrays.toString(angka));


        // --- array 2 dimensi ----
        int matrix[][] = new int[4][3];
        matrix[0][0] = 1;
        matrix[1][0] = 2;

        // System.out.println(Arrays.deepToString(matrix));


        // --- Constant Variable --- 
        final float PI = 3.14F;
        // System.out.println(PI);


        // --- input scanner ---
            //---- input int ----
        // Scanner scanner = new Scanner(System.in);
        // byte inputAge = scanner.nextByte();
        // System.out.println("Age: " + inputAge);


            //---- input string ----
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input nama anda: ");
        // String inputName = scanner.nextLine();
        // System.out.println("Nama: " + inputName);


        
    }
};

