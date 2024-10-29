/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author sypri
 */
public class BMIBERAKSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan anda : " );
        float tinggi = input.nextFloat();
        System.out.print("Masukkan berat badan anda : " );
        float berat = input.nextFloat();
        BMI bmisaya = new BMI(tinggi, berat);
        bmisaya.hasil();
    }
}
