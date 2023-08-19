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
public class J01021 {
    public static int mod = (int)1e9 + 7;
    public static Scanner scanner = new Scanner(System.in);
    public static long powmod(long a, long b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1){
                res *= a;
                res %= mod;
            }
            a *= a;
            a %= mod;
            b /= 2;
        }
        return res % mod;
    }
    public static void Process(long a, long b) {
        System.out.println(powmod(a, b));
    }

    public static void main(String[] args) {
        
        while (true) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a == 0 && b == 0) return;
            Process(a, b);
        }
    }
}
