package OOP.src;

public class Buah {
    private String namaBuah;
    private int harga;
    private int stock;

    // public Buah(String namaBuah, int harga, int stock) {
    //     this.namaBuah = namaBuah;
    //     this.harga = harga;
    //     this.stock = stock;
    // }

    public Buah (String namaBuah, int harga, int stock) {
        setNamaBuah(namaBuah);
        setHarga(harga);
        setStock(stock);
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