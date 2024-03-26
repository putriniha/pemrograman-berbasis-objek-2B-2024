/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;
class perilaku {
String nama;
int umur;
String alamat;
    void berjalan (){
        System.out.println(nama+ " sedang berjalan");
    }
    void berlari (){
        System.out.println(nama+ " sedang berlari");
    }
}
public class Manusia {
    public static void main(String[] args) {
        perilaku objek =new perilaku();
        objek.nama="Natasya Haidar";
        objek.umur=20;
        objek.alamat= "gresik";
     
        System.out.println("Nama Saya " +objek.nama);
        System.out.println("Umur saya "+objek.umur);
        System.out.println("Alamat Saya "+objek.alamat);
        
        objek.berjalan();
        objek.berlari();
    }
 }