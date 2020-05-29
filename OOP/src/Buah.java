package OOP.src;

import java.util.ArrayList;

public class Buah {
    private String namaBuah;
    private int harga;
    private int stock;

    public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public Buah (String namaBuah, int harga, int stock) {
        setNamaBuah(namaBuah);
        setHarga(harga);
        setStock(stock);

        // listBuah.add(new Buah(namaBuah, harga, stock));
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    private void setNamaBuah(String namaBuah) {
        if (namaBuah.length() ==  0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.namaBuah = namaBuah;
    }

    public int getHarga() {
        return harga;
    }

    private void setHarga(int harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("harga cannot be bellow 0");
        }

        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("stock cannot be bellow 0");
        }

        this.stock = stock;
    }

    
    
}