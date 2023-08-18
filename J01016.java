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
public class J01016 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        long n = scanner.nextLong();
        int ans = 0;
        while(n > 0){
            int cur = (int)(n % 10);
            if(cur == 4 || cur == 7) ++ ans;
            n /= 10;
        }
        if(ans == 4 || ans == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
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
