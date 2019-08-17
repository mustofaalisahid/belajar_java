/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musmus;

/**
 *
 * @author ASUS
 */
public class kalkulator {
    int nilaiSatu, nilaiDua;
    void jumlah (){ //deklarasi method instance
        int hasil = nilaiDua + nilaiSatu;
        System.out.println("Angka pertama \t: " +nilaiSatu);
        System.out.println("Angka kedua \t: " +nilaiDua);
        System.out.println("\nHasil dari " +nilaiSatu +" + " +nilaiDua +" = " +hasil);
        System.out.println(hasil);
    }
}