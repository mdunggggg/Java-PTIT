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
public class J02022 {
    public static Scanner scanner = new Scanner(System.in);
    public static int n;
    public static int[] a;
    public static boolean[] dd;

    public static void check() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (dd[j] == false) {
                dd[j] = true;
                a[i] = j;
                if (i == n) {
                    check();
                } else {
                    Try(i + 1);
                }
                dd[j] = false;
            }
        }
    }
    public static void Process() {
        n = scanner.nextInt();
        a = new int[n + 1];
        dd = new boolean[n + 1];
        Try(1);
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
