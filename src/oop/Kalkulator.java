/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ASUS
 */
public class Kalkulator implements KalkulatorInterface{
     int x;
    
    @Override
    public int Tambah(int a, int b){
        return a+b;
    }

    @Override
    public int Kurang(int a, int b) {
        return a-b;
    }
    
    public static int Kali(int a, int b) {
        return a*b;
    }
}