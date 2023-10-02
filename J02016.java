/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J02016 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; ++i){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
