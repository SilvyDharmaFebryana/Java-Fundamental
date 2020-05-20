import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Functions {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input min: ");
        byte inputMin = scanner.nextByte();

        System.out.print("Input max: ");
        byte inputMax = scanner.nextByte();

        System.out.print("Input num: ");
        byte inputNum = scanner.nextByte();

        System.out.println(generateArrayFromRange(inputMin, inputMax));
        System.out.println(cekArrayValue(inputNum));

    }

    public static ArrayList<Integer> generateArrayFromRange (int inputMin, int inputMax) {

        // ------------ pake arraylist -----------------------

        if (inputMin < inputMax) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            for (int i = inputMin; i <= inputMax; i++) {
                numbers.add(i);
            }

            return numbers;
        }
        return new ArrayList<Integer>();

        //===================================================================================

        // ----------- for loop biasa cari length dlu --------

        // int range = (inputMax - inputMin) + 1;
        // int numbers[] = new int[range];

        // for (int i = 0; i < range ; i++) {
        // numbers[i] = i + inputMin;
        // }
        // System.out.println(Arrays.toString(numbers));
        
    }

    public static boolean cekArrayValue(int item) {

        int num[] = {1, 2, 3, 4, 5};
        for (int i = 0 ; i < num.length ; i++) {
            if (num[i] == item) {
                return true;
            }
        }
        return false;
    }

}