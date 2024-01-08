/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5;

import java.util.Scanner;

/**
 *
 * @author Indah Iasha - 22343022
 */
public class Tugas1_Scanner {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan kata pertama :");
        String kata1 =in.nextLine();
        
        System.out.print("Masukkan kata kedua :");
        String kata2 =in.nextLine();
        
        System.out.print("Masukkan kata ketiga :");
        String kata3 =in.nextLine();
        
        System.out.print(kata1 + " " + kata2 + " " + kata3);
    }
}
