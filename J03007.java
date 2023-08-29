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
public class J03007 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.next();
        if(s.charAt(0) != '8'){
            System.out.println("NO");
            return;
        }
        int ans = 0;
        for(int i = 0 ; i < s.length(); ++i){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                System.out.println("NO");
                return;
            }
            ans += s.charAt(i) - '0';
        }
        if(ans % 10 != 0){
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
