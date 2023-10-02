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
public class J03026 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if(a.equals(b)){
            System.out.println("-1");
        }
        else{
            System.out.println(Integer.max(a.length(), b.length()));
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
