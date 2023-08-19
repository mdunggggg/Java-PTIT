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
public class J01024 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.next();
        int cnt = 0;
        for(int i = 0 ; i < s.length(); ++i){
            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2'){
                ++cnt;
            }
        }
        if(cnt == s.length()){
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
