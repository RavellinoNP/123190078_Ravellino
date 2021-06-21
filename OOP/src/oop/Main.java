/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kunci senjata = new Kunci ("putar ke kanan");
        String BukaKunci;
        
    //    Akm akm = new Akm ("Aku", 250);
          M416 m416 = new M416 ("Saya", 360, 0);
            
                System.out.print("Masukkan Cara Untuk Membuka Senjata ini : ");
                BukaKunci = input.nextLine();
                
                if(senjata.Lock(BukaKunci)){
                   System.out.println("Anda Dapat Menggunakan Senjata");
                   System.out.println();


                   m416.menembak();
                   m416.menembak();
                   m416.reload();
                   
                } else {
                    System.out.println("Anda Tidak Dapat Menggunakan Senjata");
                    System.out.println("Input : putar ke kanan");
                    
                }
                senjata.Lock(BukaKunci);
           
       }
}