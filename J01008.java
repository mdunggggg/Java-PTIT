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
public class J01008 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process(int test) {
        int n = scanner.nextInt();
        System.out.printf("Test %d: ", test);
        for(int i = 2 ; i <= Math.sqrt(n); ++i){
            if(n % i == 0){
                int count = 0;
                while(n % i == 0){
                    ++count;
                    n /= i;
                }
                System.out.printf("%d(%d) ", i, count);
            }
        }
        if(n > 1){
            System.out.printf("%d(%d)", n , 1);
        }
        
        System.out.println();
        
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for(int i = 1 ; i <= t ; ++i){
            Process(i);
        }
    }
}
