import java.util.ArrayList;
public class minimarketUAS {
    // properties
    private String namaBarang;
    private int jumlahBarang;
    private double hargaBarang;

    // constructor 1 - tanpa parameter
    public minimarketUAS() {
    }

    // constructor 2 - dengan parameter
    public minimarketUAS(String namaBarang, int jumlahBarang, double hargaBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
    }

    // getter and setter
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    // method cetak invoice
    public void cetakInvoice() {
        double subtotal = jumlahBarang * hargaBarang;
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Subtotal: " + subtotal);
    }
}
