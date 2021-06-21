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
public class Akm extends Senjata {

    public Akm(String nama, int jumlahpeluru, int magazine) {
        super(nama,jumlahpeluru);
    }
    
     @Override
    int magazine(){
        System.out.println("Jumlah Magazine yang ada : ");
        return 1;
    }
}
