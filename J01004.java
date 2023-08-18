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
public class J01004 {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            if(isPrime(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }   
    
    }
}
