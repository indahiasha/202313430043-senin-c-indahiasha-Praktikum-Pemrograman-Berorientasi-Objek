/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet6;

/**
 *
 * @author Indah Iasha
 */

import java.util.Scanner;

public class Tugas2_IFELSEIF {
    public static void main(String[] args) {
        int angka;
        String pesan;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka (1-10) : ");
        angka = dataMasuk.nextInt();
        
        if (angka == 1){
            pesan = "Satu";
        }
        else if (angka == 2){
            pesan = "Dua";
        }
        else if (angka == 3){
            pesan = "Tiga";
        }
        else if (angka == 4){
            pesan = "Empat";
        }
        else if (angka == 5){
            pesan = "Lima";
        }
        else if (angka == 6){
            pesan = "Enam";
        }
        else if (angka == 7){
            pesan = "Tujuh";
        }
        else if (angka == 8){
            pesan = "Delapan";
        }
        else if (angka == 9){
            pesan = "Sembilan";
        }
        else if (angka == 10){
            pesan = "Sepuluh";
        }
        else {
            pesan = "Masukkan angka yang benar!!!";
        }
        System.out.println( pesan);
    }
}
