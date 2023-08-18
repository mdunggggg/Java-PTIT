/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Scanner;

/**
 *
 * @author dungm
 */
public class J01005 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        for (double i = 1d; i < n; i++) {
            System.out.printf("%.6f ", Math.sqrt(i / n) * h);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
    
    
  
}
