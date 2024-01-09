/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet8;

/**
 *
 * @author 22343022 - Indah Iasha
 */

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args){
        Float[] angka = new Float[10];
        Float angka_tertinggi = Float.MIN_VALUE;
        String a;
        JOptionPane.showMessageDialog(null, "Masukkan 10 angka acak");
        for (int i = 0; i < 10; i++){
            a = JOptionPane.showInputDialog("Masukkan angka ke - "+ (i+1));
            angka[i] = Float.parseFloat(a);
            if (angka[i] > angka_tertinggi){
                angka_tertinggi = angka[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Angka tertinggi adalah: " + angka_tertinggi );
        
    }
}
