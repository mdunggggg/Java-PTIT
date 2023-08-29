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
public class J03021 {
    public static Scanner scanner = new Scanner(System.in);
    public static String val(Character c){
        if (c <= 'c')
            return "2";
        else if (c <= 'f')
            return "3";
        else if (c <= 'i')
            return "4";
        else if (c <= 'l')
            return "5";
        else if (c <= 'o')
            return "6";
        else if (c <= 's')
            return "7";
        else if (c <= 'v')
            return "8";
        return "9";
    }
    public static void Process() {
        String s = scanner.nextLine().toLowerCase();
        String a = "";
        for (int i = 0; i < s.length(); ++i)
            a += val(s.charAt(i));
        String rev = new StringBuilder(a).reverse().toString();
        if (a.equals(rev))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
