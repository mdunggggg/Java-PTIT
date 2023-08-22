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
public class J02005 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] dda = new int[1005];
        int[] ddb = new int[1005];
        for(int i =0 ; i < n ; ++i){
            int x = scanner.nextInt();
            dda[x] = 1;
        }
        for(int i =0 ; i < m ; ++i){
            int x = scanner.nextInt();
            ddb[x] = 1;
        }
        for(int i = 0; i <= 1000 ; ++i){
            if(dda[i] == 1 && ddb[i] == 1){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
