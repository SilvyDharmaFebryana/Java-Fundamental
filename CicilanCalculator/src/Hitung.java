package CicilanCalculator.src;

public class Hitung {

	public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
	    return (hargaAwal + (hargaAwal * (bunga / Final.PERCENT))) / (durasiCicilan * Final.BULAN_PER_TAHUN);
	}

	public static void hitungSisaBayaranPerbulan(int hargaAwal, int durasiCicilan, double bunga, double bayaranPerBulan) {
	    Format.headFormat("--- SISA BAYAR ---");
	
	    double sisaBayaran = hargaAwal + (hargaAwal * (bunga / Final.PERCENT));
	    for (int i = 0; i < durasiCicilan * Final.BULAN_PER_TAHUN; i++) {
	        sisaBayaran -= bayaranPerBulan;
	        Format.jumlahUangFormat(sisaBayaran);; 
	    }
	}

	public static void tampilJumlahBayar(double bayaranPerBulan) {
	    Format.headFormat("--- JUMLAH BAYAR PERBULAN ---");
	    Format.jumlahUangFormat(bayaranPerBulan);
	}
    
}