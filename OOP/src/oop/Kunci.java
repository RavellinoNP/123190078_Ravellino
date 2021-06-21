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
public class Kunci {
    private String BukaKunci;

    public Kunci(String BukaKunci) {
        this.BukaKunci = BukaKunci;
    }

    public String getBukaKunci() {
        return BukaKunci;
    }

    public void setBukaKunci(String BukaKunci) {
        this.BukaKunci = BukaKunci;
    }

    
     
    boolean Lock(String BukaKunci){
        if(this.BukaKunci.equals(BukaKunci)){
            return true;
        }else {
            return false;
        }
    }
}
