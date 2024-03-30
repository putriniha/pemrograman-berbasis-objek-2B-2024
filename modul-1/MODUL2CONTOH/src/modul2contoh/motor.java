/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2contoh;

/**
 *
 * @author sonia
 */
public class motor extends kendraan{
  private String warna;
    
    public motor (String merk, String warna){
        super(merk);
        this.warna =warna;
        }
    public String getwarna(){
        return warna;
   
    }

    String getmerk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
