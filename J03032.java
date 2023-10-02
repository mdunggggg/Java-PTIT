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
public class J03032 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String[] s = scanner.nextLine().trim().split("\\s+");
        
        for(int i = 0 ; i < s.length ; ++i){
            s[i] = new StringBuilder(s[i]).reverse().toString();
        }
        System.out.println(String.join(" ", s));
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
