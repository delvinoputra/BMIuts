/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author sypri
 */
public class BMI {
    float tinggi;
    float berat;
    public BMI(float tinggi, float berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public void hasil() {
        float m = tinggi / 100;
        float bmi = berat / (m * m);
        System.out.printf("bmi anda : %.1f%n" , bmi);
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("obesitas");
        }
    }

}

