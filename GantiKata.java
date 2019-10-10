/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantikata;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Mengganti Suatu Kata di Sebuah Kalimat
 *
 * @author LENOVO
 */
public class GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("===== Program Ganti Kata");
        System.out.print("Masukkan Kalimat : ");
        String k =input.nextLine();
        System.out.println("");
        System.out.println("Ganti Kata : ");
        String KataAwal=input.nextLine();
        System.out.println("Menjadi Kata : ");
        String KataGanti=input.nextLine();
        String Sesudah =k.replace(KataAwal, KataGanti);
        System.out.println("");
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal : "+k);
        System.out.println("Kalimat Baru : "+Sesudah);
        
        
    }
    
}
