/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Scanner;

class ThiSinh{
    private String name, birth;
    private double toan, ly, hoa;

    public ThiSinh() {
    }

    public ThiSinh(String name, String birth, double toan, double ly, double hoa) {
        this.name = name;
        this.birth = birth;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    

    @Override
    public String toString() {
        return name + " " + birth + " " + String.format("%.1f", toan + ly + hoa);
    }
    
    
    
}
public class J04005 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
         String name = scanner.nextLine();
         String birth = scanner.nextLine();
         double toan = scanner.nextDouble();
         double ly = scanner.nextDouble();
         double hoa = scanner.nextDouble();
         ThiSinh ts = new ThiSinh(name, birth, toan, ly, hoa);
         System.out.println(ts);
    }

    public static void main(String[] args) {
        int t = 1;
       // int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
