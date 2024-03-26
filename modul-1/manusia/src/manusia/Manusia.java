// Definisi kelas Manusia
public class Manusia {
    // Atribut
    private String nama;
    private int umur;
    private String alamat;

    // Konstruktor untuk inisialisasi objek Manusia
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method berjalan
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    // Method berlari
    public void berlari() {
        System.out.println(nama + " sedang berlari cepat.");
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Getter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    // Main method untuk menguji kelas Manusia
    public static void main(String[] args) {
        // Membuat objek manusia1
        Manusia manusia1 = new Manusia("John Doe", 30, "Jl. Jendral Sudirman No. 123");

        // Memanggil method berjalan untuk manusia1
        manusia1.berjalan();

        // Membuat objek manusia2
        Manusia manusia2 = new Manusia("Jane Smith", 25, "Jl. Pahlawan No. 45");

        // Memanggil method berlari untuk manusia2
        manusia2.berlari();

        // Menampilkan informasi tentang manusia1 dan manusia2
        System.out.println("Informasi manusia1:");
        System.out.println("Nama: " + manusia1.getNama());
        System.out.println("Umur: " + manusia1.getUmur() + " tahun");
        System.out.println("Alamat: " + manusia1.getAlamat());

        System.out.println("\nInformasi manusia2:");
        System.out.println("Nama: " + manusia2.getNama());
        System.out.println("Umur: " + manusia2.getUmur() + " tahun");
        System.out.println("Alamat: " + manusia2.getAlamat());
    }
}
