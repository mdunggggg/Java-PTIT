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
public class J02008 {
    public static Scanner scanner = new Scanner(System.in);
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        else 
            return gcd(b, a % b);
    }
    public static void Process() {
        int n = scanner.nextInt();
        long res = 1;
        for(int i = 1 ; i <= n ; ++i){
            res = res * i / gcd(res, i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
