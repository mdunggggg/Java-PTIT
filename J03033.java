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
public class J03033 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        BigInteger c = a.gcd(b);
        BigInteger ans = a.multiply(b);
        ans = ans.divide(c);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
