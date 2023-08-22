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
public class J02014 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        int[] a = new int[n + 5];
        int sum = 0;
        for(int i = 1 ; i <= n ; ++i){
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        int cur = 0;
        for(int i = 1 ; i <= n ; ++i){
            cur += a[i - 1];
            if(sum - cur - a[i] == cur){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}