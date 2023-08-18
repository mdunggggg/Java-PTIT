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
public class J01014 {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean isPrime(long n){
        for(int i = 2 ; i <= Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return n >= 2;
    }
    public static void Process() {
        long n = scanner.nextLong();
        long res = 0;
        for(int i = 1 ; i <= Math.sqrt(n); ++i){
            if(n % i == 0){
                if(isPrime(n / i)){
                    System.out.println(n / i);
                    return;
                }
                if(isPrime(i)){
                    res = i;
                }
            }
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
