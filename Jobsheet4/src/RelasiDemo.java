/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet4;

/**
 *
 * @author Indah Iasha - 22343022
 */
public class RelasiDemo {
    public static void main (String[] args){
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Nilai Variabel...");
        System.out.println("i = " + i );
        System.out.println("j = " + j );
        System.out.println("k = " + k );
        
        //lebih besar dari
        System.out.println("\nLebih besar dari...");
        System.out.println("i > j = " + (i > j)); //false
        System.out.println("j > i = " + (j > i)); //true
        System.out.println("k > j = " + (k > j)); //false
        
        //lebih besar atau sama dengan
        System.out.println("\nLebih besar dari atau sama dengan...");
        System.out.println("i >= j = " + (i >= j)); //false
        System.out.println("j >= i = " + (j >= i)); //true
        System.out.println("k >= j = " + (k >= j)); //true
        
        //lebih kecil dari
        System.out.println("\nLebih kecil dari...");
        System.out.println("i < j = " + (i < j)); //true
        System.out.println("j < i = " + (j < i)); //false
        System.out.println("k < j = " + (k < j)); //false
        
        //lebih kecil atau sama dengan
        System.out.println("\nLebih kecil dari atau sama dengan..."); //false
        System.out.println("i <= j = " + (i <= j)); //true
        System.out.println("j <= i = " + (j <= i)); //false
        System.out.println("k <= j = " + (k <= j)); //true
        
        //sama dengan
        System.out.println("\nSama dengan...");
        System.out.println("j == j = " + (i == j)); //false
        System.out.println("k == j = " + (k == j)); //true
        
        //tidak sama dengan
        System.out.println("\nTidak sama dengan...");
        System.out.println("i != j = " + (i != j)); //true
        System.out.println("k != j = " + (k != j)); //false
    }
}
