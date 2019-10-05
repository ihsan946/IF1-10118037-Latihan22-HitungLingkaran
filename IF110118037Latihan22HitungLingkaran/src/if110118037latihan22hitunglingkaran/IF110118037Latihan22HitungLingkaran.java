/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan22hitunglingkaran;
import java.util.Scanner;
import java.math.MathContext;

/**
 *
 * @author Muhammad Ihsan
 * NAMA                           : Muhammad Ihsan
 * KELAS                         : IF-1
 * NIM                              : 10118037
 * Deskripsi Program   : Program ini berisi program perhitungan lingkaran
 */
public class IF110118037Latihan22HitungLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
           int diameter;
           int jari2;
           double luasLingkaran;
           double kelilingLingkaran;
           String validasi;
           boolean valid = true;
           
           
      
        do{
            //input
             System.out.print("Masukkan Nilai Diameter Lingkaran : ");
             Scanner temp = new Scanner(System.in);
             validasi = temp.nextLine();
        
            //logika dan output
            if (validasi.matches("[0-9]*")) {
                diameter = temp.nextInt();
                jari2 = diameter / 2;
                luasLingkaran = 3.14 * Math.pow(jari2, 2) ;
                kelilingLingkaran = 3.14 * diameter;
                System.out.println("+++HASIL PERHITUNGAN+++");
                System.out.println("Jari-Jari Lingkaran\t= " + jari2);
                System.out.printf("Luas Lingkaran\t\t= %.2f%n",luasLingkaran);
                System.out.printf("Keliling Lingkaran\t= %.2f%n",kelilingLingkaran);
                valid = false;
                break;
             } 
            else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println();
             }
        }while(valid = true);
              
        
       
       

       
        
        
       
        
        
    }
    
}
