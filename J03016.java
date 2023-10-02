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
public class J03016 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        BigInteger a = new BigInteger(scanner.next());
        BigInteger mod = new BigInteger("11");
        BigInteger zero = new BigInteger("0");
        if(a.mod(mod).equals(zero)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
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
