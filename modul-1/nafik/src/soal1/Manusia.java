/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * 
 */
class Manusia {
      
    String nama;
    int umur;
    String alamat;

    
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    
    public void berjalan() {
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("saat ini sedang berjalan");
        System.out.println();
        
    }

    
    public void berlari() {
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("saat ini sedang berlari");
        System.out.println();
        
    }
    public void jogging() {
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("saat ini sedang jogging");
        System.out.println();
        
    }
    
 
}
