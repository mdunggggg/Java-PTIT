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
public class J01018 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        long n = scanner.nextLong();
        int sum = (int)(n % 10);
        int cur = sum;
        n /= 10;
        while(n > 0){
            if(Math.abs(n % 10 - cur) != 2){
                System.out.println("NO");
                return;
            }
            cur = (int)(n % 10);
            n /= 10;
            sum += cur;
        }
        if(sum % 10 != 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
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
