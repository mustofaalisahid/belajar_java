/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Coba {

    public static void main(String[] args) {
//        Hewan hewan = new Hewan();      //instance
//        Singa singa = new Singa();      //instance
//        
//        hewan.suara("iiii");
//        singa.suara();
//        System.out.println(hewan.suara);
//        System.out.println(singa.suara);
//        singa.coba();
//        System.out.println(singa.jenis);
//        
//        singa.cetak("Ini Jenisnya");
//        
//        System.out.println(singa.jenis);

//        Mahasiswa m = new Mahasiswa("11111", "TOFU RESHU", "Jl. Kaki Aja");
        Mahasiswa m = new Mahasiswa();
        m.setNim("11111");
        m.setNama("TOFU RESHU");
        m.setAlamat("Jl. Kaki Aja");
        System.out.println(m.getNim() + " - " + m.getNama() + " - " + m.getAlamat());
        
//        Kalkulator ko = new Kalkulator();
//        KalkulatorInterface ki = new Kalkulator();
//        System.out.println(ki.Tambah(0, 0));
//            System.out.println(Math.abs(-5));
    }
}
