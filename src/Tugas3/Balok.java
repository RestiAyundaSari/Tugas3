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
public class Balok extends Persegi implements MenghitungRuang {
    private int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    private double luasBalok(double p,double t,double l){
        return 2*(p*l + l*t + t*p);
    }

    @Override
    public double luasBangunRuang() {
        return luasBalok(super.getPanjang(),this.tinggi,super.getLebar());
    }

    @Override
    public double volumeBangunRuang() {
        return super.luasBangunDatar()*this.tinggi;
        
    }
    
}
