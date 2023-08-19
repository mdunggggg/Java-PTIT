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
public class J01017 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.next();
        for (int i = 0 ; i < s.length() - 1 ; ++i){
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
