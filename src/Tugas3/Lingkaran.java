/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Resti
 */
public class Lingkaran implements MenghitungBidang{
    int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }
        
    public Lingkaran() {
        jari = 0;
    }
    
    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public double luasBangunDatar() {
        return Math.PI*jari*jari;
    }

    @Override
    public double kelilingBangunDatar() {
        return 2*Math.PI*jari;
    }
    
    
    
}
