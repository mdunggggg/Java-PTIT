/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03013 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        BigInteger c = a.subtract(b).abs();
        int Max = Integer.max(a.toString().length(), b.toString().length());
        String ans = c.toString();
        while(ans.length() < Max){
            ans = "0" + ans;
        }
         System.out.println(ans);
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.next());
        while (t-- > 0) {
            Process();
        }
    }
}
