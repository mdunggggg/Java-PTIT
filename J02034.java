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
public class J02034 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        int[] dd = new int[205];
        int Max = -1;
        for(int i = 1 ; i <= n ; ++i){
            int x = scanner.nextInt();
            dd[x] = 1;
            Max = Math.max(x, Max);
        }
        int flag = 1;
        for(int i = 1; i <= Max ; ++i){
            if(dd[i] == 0){
                System.out.println(i);
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("Excellent!");
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
