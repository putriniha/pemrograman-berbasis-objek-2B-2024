/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2contoh;

/**
 *
 * @author sonia
 */
public class MODUL2CONTOH {

    /**
     * @param args the command line arguments
     */
   
   public static void main(String[] args) {
        // TODO code application logic here
        String merk = "Honda";
        String warna = "Merah";
        
        motor motor = new motor(merk,warna);
        System.out.println("Merk motor ku " + motor.getmerk());
        System.out.println("Warna motorku " + motor.getwarna());
    }
    
}
