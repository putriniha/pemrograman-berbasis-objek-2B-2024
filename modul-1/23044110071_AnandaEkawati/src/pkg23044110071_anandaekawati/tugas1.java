package pkg23044110071_anandaekawati;
import java.util.Scanner;
class Manusia {
    String nama, alamat;
    int umur;
    public void berlari() {
        System.out.println("Objek ini " + this.nama + " berlari");
    }
    void berjalan() {
        System.out.println("Objek ini " + this.nama + " berjalan");
    }
}
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();//isi nilai atribut

        System.out.print("Masukkan Nama orang 1: ");
        orang1.nama = input.nextLine();

        System.out.print("Masukkan umur orang 1: ");
        orang1.umur = input.nextInt();
        input.nextLine(); // untuk mengonsumsi newline character
        System.out.print("Masukkan Alamat orang 1: ");
        orang1.alamat = input.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Orang pertama bernama " + orang1.nama);
        System.out.println("Orang pertama beralamat di " + orang1.alamat);
        System.out.println("Orang pertama berumur " + orang1.umur + " Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terima kasih");

        System.out.println("---------------------------------------------");

        orang2.nama = "Tia";
        orang2.umur = 19;
        orang2.alamat = "Sumenep";
        System.out.println("Orang kedua bernama " + orang2.nama);
        System.out.println("Orang kedua beralamat di " + orang2.alamat); 
        System.out.println("Orang kedua berumur " + orang2.umur + " Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terima Kasih");

        input.close(); // Menutup scanner
    }
}

//clas adlah templat untuk ceatakan untuk menciptakan objek
//ojek hasil nyata dari classs