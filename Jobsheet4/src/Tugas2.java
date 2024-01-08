/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet4;

/**
 *
 * @author Indah Iasha  - 22343022
 */
public class Tugas2 {
    public static void main(String args[]){
        int satu = 10;
        int dua = 23;
        int tiga = 5;
        int angkatertinggi = (satu > dua) ? ((satu > tiga) ? satu : tiga) : ((dua > tiga) ? dua : tiga);
        System.out.println("number 1 = "+satu);
        System.out.println("number 2 = "+dua);
        System.out.println("number 3 = "+tiga);
        System.out.println("Nilai tertingginya adalah angka = "+dua);
    }
}
