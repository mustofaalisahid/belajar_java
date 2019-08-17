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

public class StrukturalPrograming {
    static int prima(int x){
        int hasil = 0;
        for(int i = 1; i<=x ; i++){
            if(x % i == 0){
                hasil = hasil + 1;
            }
        }
        if (hasil == 2){
            hasil = 1;
        }else {hasil = 0;}
        return hasil;
    }
    
    public static void main(String[] args) {
        int i, panjangData = 500;
        int  countprima = 0, countgenap = 0, countganjil = 0;
        int [] nilai;
        nilai = new int[panjangData];
        
        for (i = 0; i<panjangData; i++){
            nilai[i] = i * 1;
        }
        
        for (i = 0; i<nilai.length; i++){
            if(i == 0){
                System.out.println("Nilai 0 tidak masuk manapun");
            }
            else if(prima(i) == 1){
                System.out.println("Nilai prima \t: " +nilai[i]);
                countprima++;
            }
            else if(i % 2 == 0){
                System.out.println("Nilai genap \t: " +nilai[i]);
                countgenap++;
            }
            else if(i % 2 != 0){
                System.out.println("Nilai ganjil \t: " +nilai[i]);
                countganjil++;
            }
        }
        
        System.out.println("\nTotal data dari 0 hingga " +(panjangData-1));
        System.out.println("----------------------------------------------");
        System.out.println("Total bil prima \t\t\t: " +countprima);
        System.out.println("Total bil genap dan tidak prima \t: " +countgenap);
        System.out.println("Total bil ganjil dan tidak prima \t: " +countganjil);
    }
}
