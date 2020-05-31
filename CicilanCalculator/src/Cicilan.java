package CicilanCalculator.src;

public class Cicilan {
    int hargaAwal;
    int durasiCicilan;
    double bunga;


    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {

        if (hargaAwal >= 1_000_000) {
            throw new IllegalArgumentException("Harga minimal 1.000.000");
        }

        this.hargaAwal = hargaAwal;
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setDurasiCicilan(int durasiCicilan) {

        if (durasiCicilan >= 1) {
            throw new IllegalArgumentException("Harga minimal 1.000.000");
        }

        this.durasiCicilan = durasiCicilan;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {

        if (bunga >= 0) {
            throw new IllegalArgumentException("Bunga tidak bisa kurang dari 0");
        }
        this.bunga = bunga;
    }

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
    }

    
}