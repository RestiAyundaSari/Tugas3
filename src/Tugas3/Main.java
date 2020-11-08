/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Resti
 */
public class Main {
       
    public static void main(String[] args) {
             menu();
    }
    
    static void menu(){
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1. Balok ");
        System.out.println("2. Kerucut");
        System.out.println("3. Exit");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    Balok();
                    break;
                case 2:
                    Kerucut();
                    break;
                default:
                    exit(0);
                    break;
            }

    }
    
    
   static void Balok(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan Panjang      : ");
       int panjang = scan.nextInt();
       System.out.print("Masukkan Lebar        : ");
       int lebar = scan.nextInt();
       System.out.print("Masukkan Tinggi       : ");
       int tinggi = scan.nextInt();
       Persegi persegi = new Persegi(panjang,lebar);
       Balok balok = new Balok(tinggi,panjang,lebar);
       System.out.println("Luas Permukaan Balok : " + balok.luasBangunRuang());
       System.out.println("Volume Balok         : " + balok.volumeBangunRuang());
       System.out.println("Luas Persegi         : " + persegi.luasBangunDatar());
       System.out.println("Keliling Persegi     : " + persegi.kelilingBangunDatar());
       
       menu();
       
   }
   
      static void Kerucut(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan Jari - Jari  : ");
       int jari = scan.nextInt();
       System.out.print("Masukkan Tinggi       : ");
       int tinggiKerucut = scan.nextInt();
       Lingkaran lingkaran = new Lingkaran(jari);
       Kerucut kerucut = new Kerucut(tinggiKerucut,jari);
       System.out.println("Luas Kerucut         : " + kerucut.luasBangunRuang());
       System.out.println("Volume Kerucut       : " + kerucut.volumeBangunRuang());
       System.out.println("Luas Lingkaran       : " + lingkaran.luasBangunDatar());
       System.out.println("Keliling Lingkaran   : " + lingkaran.kelilingBangunDatar());
       
       menu();
       
   }
   
    
}
