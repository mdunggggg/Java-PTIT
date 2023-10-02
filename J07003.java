/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J07003 {
   // public static Scanner scanner = new Scanner(new File("DATA.in"));
    public static int sum(String x, String y){
        return Integer.parseInt(x) + Integer.parseInt(y);
    }
    public static void Process() throws Exception{
         Scanner scanner = new Scanner(new File("DATA.in"));
        String s = scanner.nextLine();
        while(s.length() > 1){
            while (s.length() > 1) {
                BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
                BigInteger b = new BigInteger(s.substring(s.length() / 2));
                s = a.add(b).toString();
                 System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        int t = 1;
       // int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            try {
                Process();
            } 
            catch (Exception e) {
                
            }
        }
    }
}
