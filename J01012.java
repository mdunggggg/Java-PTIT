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
public class J01012 {
    public static Scanner scanner = new Scanner(System.in);
  
    public static void Process() {
        int m , ans = 0;
        m = scanner.nextInt();
        for(int i = 1 ; i <= Math.sqrt(m); ++i){
            if(m % i == 0){
                if(i % 2 == 0) ++ans;
                if(i != m / i  && (m / i) % 2 == 0) ++ans; 
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
    
}
