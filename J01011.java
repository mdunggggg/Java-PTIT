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
public class J01011 {
    public static Scanner scanner = new Scanner(System.in);
    public static long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    public static void Process() {
        long n , m;
        n = scanner.nextLong();
        m = scanner.nextLong();
        long _gcd = gcd(n , m);
        long _lcm = n / _gcd * m;
        System.out.println(_lcm + " " + _gcd);
                
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
