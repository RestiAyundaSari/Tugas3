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
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private int tinggiKerucut;

    public Kerucut(int tinggiKerucut, int jari) {
        super(jari);
        this.tinggiKerucut = tinggiKerucut;
    } 

    public int getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(int tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }
    

    public double getPytaghoras(){
        return Math.sqrt( Math.pow(super.getJari(),2) + Math.pow(tinggiKerucut,2) );
    }
    
    @Override
    public double luasBangunRuang() {
        return Math.PI*super.getJari()*(super.getJari()+getPytaghoras());
        
    }

    @Override
    public double volumeBangunRuang() {
        return (super.luasBangunDatar()*tinggiKerucut)/3;
     }
    
    
}
