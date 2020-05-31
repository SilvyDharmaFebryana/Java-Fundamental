package CicilanCalculator.src;
import java.util.Scanner;


public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Harga Awal = P
        // Durasi Cicilan = D (tahun)
        // Bunga = B
        // Bayaran per Bulan = M

        // M = [P + (P * B / 100) / D * 12]

        System.out.println("======== CALCULATOR CICILAN =========");

        // while (true) {
        //     hargaAwal = (int) Console.readInputNumber("Harga Awal: ");

        //     if (hargaAwal >= 1_000_000) {
        //         break;
        //     }

        //     System.out.println("Harga minimal 1.000.000");
        // }    

        // while (true) {
        //     durasiCicilan = (int) Console.readInputNumber("Durasi Ciclan/tahun: ");
        
        //     if (durasiCicilan >= 1) {
        //         break;
        //     }

        //     System.out.println("tahun minimal 1");
        // }

        // while (true) {
        //     bunga = Console.readInputNumber("Bunga: ");

        //     if (bunga >= 0) {
        //         break;
        //     }

        //     System.out.println("Bunga harus lebih dari 0");
        // }

        int inputHargaAwal = (int) Console.readInputNumber("Harga Awal: ");
        int inputDurasiCicilan = (int) Console.readInputNumber("Durasi Ciclan/tahun: ");
        double inputBunga = Console.readInputNumber("Bunga: ");

        Cicilan cicilan = new Cicilan(inputHargaAwal, inputDurasiCicilan, inputBunga);

        double bayaranPerBulan = Hitung.hitungBayaranPerBulan(inputHargaAwal, inputDurasiCicilan, inputBunga);

        Hitung.tampilJumlahBayar(bayaranPerBulan);
        Hitung.hitungSisaBayaranPerbulan(inputHargaAwal, inputDurasiCicilan, inputBunga, bayaranPerBulan);
        
    }



}
