/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet4;

/**
 *
 * @author Indah Iasha - 22343022
 */
public class AritmatikaDemo {
    public static void main(String[] args){
        int i = 10;
        int j = 3;
        double x = 27.457;
        double y = 7.22;
        
        System.out.println("Variable values...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        //penjumlahan angka
        System.out.println("\nAdding...");
        System.out.println("i + j = " + (i + j));
        System.out.println("x + y = " + (x + y));
        
        //pengurangan angka
        System.out.println("\nSubstracting...");
        System.out.println("i - j = " + (i - j));
        System.out.println("x - y = " + (x - y));
        
        //perkalian angka
        System.out.println("\nMultyplying...");
        System.out.println("i * j = " + (i * j));
        System.out.println("x * y = " + (x * y));
        
        //pembagian angka
        System.out.println("\nDividing...");
        System.out.println("i / j = " + ((float)i * j));
        System.out.println("x / y = " + (x / y));
        
        //menghitung hasil modulus dari pembagian
        System.out.println("\nComputing the remainder...");
        System.out.println("i % j = " + (i % j));
        System.out.println("x % y = " + (x % y));
        
        //tipe penggabungan
        System.out.println("\nMixing tipes...");
        System.out.println("j + y = " + (j + y));
        System.out.println("i + x = " + (i + x));
    }
}
