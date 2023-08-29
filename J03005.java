/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03005 {
    public static Scanner scanner = new Scanner(System.in);
    public static String convert(String s){
        s = s.toLowerCase();
        if(s.length() == 1)
            return s.toUpperCase();
        else{
            return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
        }
    }
    public static void Process() {
        String[] s = scanner.nextLine().trim().split("\\s+");
        for (int i = 1 ; i < s.length; ++i){
            System.out.print(convert(s[i]));
            if(i != s.length - 1){
                System.out.print(" ");
            }
            else
                System.out.print(", ");
        }
        System.out.println(s[0].toUpperCase());
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            Process();
        }
    }
}
