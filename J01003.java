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
public class J01003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a == 0 && b == 0){
            System.out.println("VSN");
            return;
        }
        if(a == 0 && b != 0){
            System.out.println("VN");
        }
        else{
            System.out.println(String.format("%.2f", -1.0 * b / a));
        }
    }
}
