/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author TOFA
 */
public class TestHewan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, menu;
        do{
            System.out.println("Pilih Nama Hewan");
            System.out.println("1. Singa");
            System.out.println("2. Elang");
            System.out.println("3. Lebah");
            System.out.println("4. Paus");
            System.out.println("5. Exit");
            do{System.out.print("Pilih menu : "); menu = in.nextByte();}
            while(menu<1 || menu>5);
            
            switch(menu){
                case 1 :
                    Singa singa = new Singa();
                    System.out.println("");
                    singa.cetak();
                    System.out.println("\n");
                    break;
                    
                case 2 :
                    Elang elang = new Elang();
                    System.out.println("");
                    elang.cetak();
                    System.out.println("\n");
                    break;
                    
                case 3 :
                    Lebah lebah = new Lebah();
                    System.out.println("");
                    lebah.cetak();
                    System.out.println("\n");
                    break;
                    
                case 4 :
                    Paus paus = new Paus();
                    System.out.println("");
                    paus.cetak();
                    System.out.println("\n");
                    break;
                    
                case 5 :
                    System.exit(0);
            }
        }while(true);
    }
}
