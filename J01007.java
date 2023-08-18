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
public class J01007 {
     public static Scanner scanner = new Scanner(System.in);
    public static long[] f = new long[93];
    public static void prepare(){
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for(int i = 3;  i <= 92 ; ++i){
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    public static void Process() {
        long n = scanner.nextLong();
        for (long x : f){
            if(x == n){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        prepare();
        while (t-- > 0) {
            Process();
        }
    }
}
