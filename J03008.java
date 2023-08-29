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
public class J03008 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.next();
        for(int i = 0 ; i < s.length() / 2; ++i){
            char x =  s.charAt(i);
            char y = s.charAt(s.length() - i - 1);
            if(x != y || (x != '2' && x != '3' && x != '5' && x != '7')){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
