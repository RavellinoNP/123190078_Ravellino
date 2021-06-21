/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author LENOVO
 */
public class Senjata {
    String nama;
    int jumlahpeluru;
    int magazine;

    public Senjata(String nama, int jumlahpeluru) {
        this.nama = nama;
        this.jumlahpeluru = jumlahpeluru;
    }
    
    int magazine(){
        System.out.println("Jumlah Magazine");
        return 1;
    }
    
    void menembak(){
        System.out.println(nama + " menyerang sasaran");
        jumlahpeluru -= 30;
        System.out.println("Sisa peluru : " + jumlahpeluru);
    }
    void reload(){
        jumlahpeluru += 30;
        System.out.println("Reload ");
        System.out.println("Peluru : " + jumlahpeluru);
    }
}
