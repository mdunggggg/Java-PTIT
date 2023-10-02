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
public class J03025 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.nextLine();
        int count = 0;
        for(int i = 0 ; i < s.length() / 2 ; ++i){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) ++ count;
            if (count > 1){
                System.out.println("NO");
                return;
            }
        }
        if(count == 0){
            if(s.length() % 2 == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else{
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
