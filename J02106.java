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
public class J02106 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        int ans = 0;
        int count = 0;
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0; j < 3 ; ++j){
                int x = scanner.nextInt();
                if(x == 1) ++count;
            }
            if(count >= 2) ++ans;
            count = 0;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t = 1;
      // int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
