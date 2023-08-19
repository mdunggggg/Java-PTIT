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
public class J01022 {
    public static Scanner scanner = new Scanner(System.in);
    public static long[] fibo = new long[93];
    public static void Prepare(){
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3 ; i <= 92 ; ++i){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public static char solve(int n, long k){
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= fibo[n - 2]) return solve(n - 2, k);
        return solve(n - 1, k - fibo[n - 2]);
    }
    public static void Process() {
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        System.out.println(solve(n, k));
    }

    public static void main(String[] args) {
        //int t = 1;
        Prepare();
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
