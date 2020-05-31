package CicilanCalculator.src;

import java.text.NumberFormat;

public class Format {

	public static void jumlahUangFormat(double Jumlah) {
	    System.out.println(NumberFormat.getCurrencyInstance().format(Jumlah));
	}

	public static void headFormat(String head) {
	    System.out.println(head);
	}
    
}