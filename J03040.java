/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03040 {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean check(int a, int b, int c, int d, int e){
        return (a < b && b < c && c < d && d < e) ||
                (a == b && b == c && c == d && d == e) ||
                ((a == b && b == c) && (d == e)) ||
                ((a == 6 || a == 8) && (b == 6 || b == 8) && (c == 6 || c == 8) && (d == 6 || d == 8) && (e == 6 || e == 8));
    }
    public static void Process() {
        String s = scanner.next();
        if(check(s.charAt(5) - '0', s.charAt(6)- '0', s.charAt(7)- '0', s.charAt(9)- '0', s.charAt(10)- '0')){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
