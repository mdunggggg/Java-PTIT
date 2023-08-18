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
public class J01010 {
    public static Scanner scanner = new Scanner(System.in);
    public static long conver(String s){
       long ans = 0;
       for(int i = 0 ; i < s.length(); ++i){
           char c = s.charAt(i);
           if(c == '0' || c == '9' || c == '8'){
               ans = ans * 10;
           }
           else if(c == '1'){
               ans = ans * 10 + 1;
           }
           else return 0;
       }
       return ans;
       
    }
    public static void Process() {
        String n = scanner.next();
        if(conver(n) != 0){
            System.out.println(conver(n));
        }
        else{
            System.out.println("INVALID");
        }
        
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            Process();
        }
    }
}
