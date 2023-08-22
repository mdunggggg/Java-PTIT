package com.mycompany.javaptit;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J02103 {
    public static Scanner scanner = new Scanner(System.in);
    public static int test = 1;
    public static void Process() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < m ; ++j){
                a[i][j] = scanner.nextInt();
                b[j][i] = a[i][j];
            }
        }
        System.out.println("Test " + test++ + ":");
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n ; ++j){
                int sum = 0;
                for(int k = 0; k < m ; ++k){
                    sum += a[i][k] * b[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
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
