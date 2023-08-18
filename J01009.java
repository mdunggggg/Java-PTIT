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
public class J01009 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        long sum = 0, gt = 1;
        for(int i = 1 ; i <= n ; ++i){
            sum += gt * i;
            gt *=  i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int t = 1;
       // int t = scanner.nextInt();
        while (t -- > 0) {
            Process();
        }
    }
}
