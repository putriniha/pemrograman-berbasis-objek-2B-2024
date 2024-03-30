/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100061_sonia;

/**
 *
 * @author sonia
 */
class persegi {
       int panjang;
    int lebar;
    int mencariluas(){ 
        int hasi1=panjang*lebar;
        return hasi1;
       }
    int mencarikeliling(){ 
        int hasil=2*panjang+lebar;
        return hasil;
       }
    int mencaripanjang(){ 
        int hasil=panjang*lebar/lebar;
        return hasil;
       }
    int mencarilebar(){ 
        int hasil=panjang*lebar/panjang;
        return hasil;
       }
}
