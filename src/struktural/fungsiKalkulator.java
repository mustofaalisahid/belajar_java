/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktural;

/**
 *
 * @author ASUS
 */
public class fungsiKalkulator {

    public int kali(int x, int y) {
        int hasil = 0;
        if (x > 0 && y > 0) {
            for (int i = 1; i <= y; i++) {
                hasil = hasil + x;
            }
        }
        else if (x < 0 && y < 0){
            y = y * (-1); x = x * (-1);
            for (int i = 1; i <= y; i++) {
                hasil = hasil + x;
            }
        }
        else{
            if(y < 0){y = y * (-1);}
            else{x = x * (-1);}
            for (int i = 1; i <= y; i++) {
                hasil = hasil + x;
            }
            hasil = hasil * -1;
        }
        return hasil;
    }

    public int bagi(int a, int b) {
        int hasil = 1, hasilbagi;

        for (hasilbagi = a; hasilbagi > b; hasilbagi = hasilbagi - b) {
            hasil++;
        }

        return hasil;
    }

    public int pangkat(int c, int d) {
        int hasil = 1;
        for (int i = 1; i <= d; i++) {
            hasil = hasil + hasil;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int x = 4, y = -7;
        int a = 20, b = 4;
        int c = 2, d = 3;
        fungsiKalkulator f = new fungsiKalkulator();
        System.out.println("Hasil kali " + x + " x " + y + " = " + f.kali(x, y));
        System.out.println("Hasil bagi " + a + " : " + b + " = " + f.bagi(a, b));
        System.out.println("Hasil pangkat " + c + " ^ " + d + " = " + f.pangkat(c, d));
    }
}
