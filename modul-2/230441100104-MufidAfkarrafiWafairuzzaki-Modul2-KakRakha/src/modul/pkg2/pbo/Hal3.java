package modul.pkg2.pbo;
import java.util.ArrayList;
import java.util.Scanner;

public class Hal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Universitas: "); 
        String namaUniversitas = scanner.next();
        Hal2.setNamaUniversitas(namaUniversitas);

        ArrayList<Hal1> daftarMahasiswa = new ArrayList<>();

        char ulang;
        do {
            System.out.println("Masukkan Data Mahasiswa:");
            System.out.print("Nama: ");
            String nama = scanner.next();
            scanner.nextLine(); 
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Pilih Jurusan : ");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI,");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (41-49): ");
            int jurusan = scanner.nextInt();

            Hal1 mahasiswa = new Hal1(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y/T)");
            ulang = scanner.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');

        System.out.println("\nDaftar Mahasiswa di " + Hal2.getNamaUniversitas() + ":");
        for (Hal1 m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }

    private static String getJurusanString(int jurusan) {
        return switch (jurusan) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}
