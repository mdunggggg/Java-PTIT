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
public class J03019 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.nextLine();
        int n = s.length();
        char c = s.charAt(n - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for(int i = n - 2 ; i >= 0 ; --i){
            if(s.charAt(i) < c){
                
            }
            else if(s.charAt(i) == c){
                sb.append(c);
            }
            else{
                c = s.charAt(i);
                sb.append(c);
            }
        }
        System.out.println(sb.reverse().toString().trim());
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
