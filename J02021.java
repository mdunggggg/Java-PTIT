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
public class J02021 {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] a= new int[15];
    public static int n , k;
    public static int sum = 0;
    public static void Try(int i){
        for(int j = a[i - 1] + 1 ; j <= n ; ++j){
            a[i] = j;
            if(i == k){
                for(int t = 1 ; t <= k ; ++t){
                    System.out.print(a[t]);
                }
                System.out.print(" ");
                sum += 1;
            }
            else{
                Try(i + 1);
            }
        }
    }
    public static void Process() {
        n = scanner.nextInt();
        k = scanner.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + sum + " to hop");
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
