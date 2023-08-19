package com.mycompany.javaptit;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J01025 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int max1 = Math.max(a, Math.max(c, Math.max(e, g)));
        int min1 = Math.min(a, Math.min(c, Math.min(e, g)));
        
        int max2 = Math.max(b, Math.max(d, Math.max(f, h)));
        int min2 = Math.min(b, Math.min(d, Math.min(f, h)));
        
        int len = Math.max(max1 - min1, max2 - min2);
        System.out.println(len * len);
        
        
        
    }

    public static void main(String[] args) {
       int t = 1;
        //int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
