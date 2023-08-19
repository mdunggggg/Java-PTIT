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
public class J01026 {
    public static Scanner scanner = new Scanner(System.in);
    public static Boolean square(int n){
        int x = (int)Math.sqrt(n);
        return x * x == n;
    }
    public static void Process() {
        int n = scanner.nextInt();
        if(square(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
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
