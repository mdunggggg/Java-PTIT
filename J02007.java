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
public class J02007 {
    public static Scanner scanner = new Scanner(System.in);
    public static int numTest = 1;
    public static final int Max = (int)1e6 + 5;
    public static void Process() {
        int n = scanner.nextInt();
        int[] dd = new int[Max];
        int[] a = new int[n];
        for(int i =0 ; i < n ; ++i){
            a[i] = scanner.nextInt();
            dd[a[i]]++;
        }
        System.out.println("Test " + numTest++ + ":");
        for(int i = 0 ; i < n ; ++i){
            if(dd[a[i]] != 0){
                System.out.println(a[i] + " xuat hien " + dd[a[i]] + " lan");
                dd[a[i]] = 0;
            } 
        }
       
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
