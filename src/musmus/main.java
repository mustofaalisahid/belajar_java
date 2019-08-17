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
public class main {
    public static void main(String[] args) {
        kalkulator kalkulator = new kalkulator(); //dibuat instance class
        //untuk dipanggil
        kalkulator.nilaiSatu = 5;
        kalkulator.nilaiDua = 7;
        kalkulator.jumlah();
    }
}
