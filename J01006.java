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
public class J01006 {
    public static Scanner scanner = new Scanner(System.in);
    public static long[] f = new long[93];
    public static void prepare(){
        f[1] = 1;
        f[2] = 1;
        for(int i = 3;  i <= 92 ; ++i){
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    public static void Process() {
        int n = scanner.nextInt();
        System.out.println(f[n]);
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        prepare();
        while (t-- > 0) {
            Process();
        }
    }
}
