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
public class J01013 {
    static int[] Prime = new int[2000000 + 5];
    public static Scanner scanner = new Scanner(System.in);
    public static void sieve(){
        Prime[0] = 1;
        Prime[1] = 1;
        for(int i = 2 ; i <= Math.sqrt(2000000) ; ++i){
            if(Prime[i] == 0){
                for(int j = i ; j <= 2000000 ; j += i){
                    if(Prime[j] == 0){
                        Prime[j] = i;
                    }
                }
            }
        }
        for(int i = 2 ; i <= 2000000; ++i){
            if(Prime[i] == 0){
                Prime[i] = i;
            }
        }
    }
   
    
    public static long ans = 0;
    public static void Process() {
        int n = scanner.nextInt();
        while(n != 1){
            ans += Prime[n];
            n /= Prime[n];
        }
    }

    public static void main(String[] args) {
        sieve();
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
        System.out.println(ans);
    }
}
