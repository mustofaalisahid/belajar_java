/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author TOFA
 */
public class Hewan { //Superclass
    String jenis, ciri, suara, berjalan, bernafas;
    
    void suara(String suara){
        this.suara = suara;
    }
    
    void berjalan(String berjalan){
        this.berjalan = berjalan;
    }
    
    void cetak(String jenis){
        this.jenis = jenis;
        System.out.println("Jenis\t\t: " +this.jenis);
        System.out.println("Ciri-ciri\t: " +ciri);
        System.out.println("Suara\t\t: " +suara);
        System.out.println("Bergerak\t: " +berjalan);
        System.out.println("Pernafasan\t: " +bernafas);
    }
    
    void coba(){
        System.out.println("ini coba");
    }
}

class Singa extends Hewan{ //Subclass, menggunakan extends
    @Override
    void suara(String suara){
        super.suara = "RRRRRRRRR"; //memanggil construktor dari superclass
    }
    
    @Override
    void berjalan(String berjalan){
        super.berjalan = "Berjalan dengan empat kaki";
    }
    
    void suara(){
        super.suara = "AWWW";
    }
    
    void berjalan(){
        super.berjalan = "Berjalan dengan empat kaki";
    }
    
    void cetak(){
        suara("");
        berjalan();
        super.jenis = "Mamalia";
        super.ciri = "Temennya Raja Hutan";
        super.bernafas = "Paru - paru";
        System.out.println("SINGA");
        super.cetak(jenis);
    }
}

class Elang extends Hewan{
    @Override
    void suara(String suara) {
        super.suara = "NGEKKKKKKK";
    }
    @Override
    void berjalan(String berjalan){
        super.berjalan = "Terbang dengan sayap";
    }
    void cetak(){
        suara("");
        berjalan("");
        super.jenis = "Aves";
        super.ciri = "Mungkin Raja Langit";
        super.bernafas = "Pundi - pundi udara (Paru - paru)";
        System.out.println("ELANG");
        super.cetak(jenis);
    }
}

class Lebah extends Hewan{
    void suara(String suara) {
        super.suara = "NGINGGGGGGG";
    }
    void berjalan(String berjalan){
        super.berjalan = "Terbang layaknya serangga";
    }
    void cetak(){
        suara("");
        berjalan("");
        super.jenis = "Insecta";
        super.ciri = "Penghasil Madu";
        super.bernafas = "Trakea";
        System.out.println("LEBAH");
        super.cetak(jenis);
    }
}

class Paus extends Hewan{
    void suara(String suara) {
        super.suara = "WOUWWWWWWWW";
    }
    void berjalan(String berjalan){
        super.berjalan = "Berenang dengan sirip";
    }
    void cetak(){
        suara("");
        berjalan("");
        super.jenis = "Mamalia";
        super.ciri = "Mamalia Laut Terbesar";
        super.bernafas = "Paru - paru";
        System.out.println("PAUS");
        super.cetak(jenis);
    }
}