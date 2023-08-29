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
public class J03004 {
    public static Scanner scanner = new Scanner(System.in);
    public static String convert(String s){
        s = s.toLowerCase();
        if(s.length() == 1)
            return s.toUpperCase();
        else{
            return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
        }
    }
    public static void Process() {
        String s = scanner.nextLine().trim();
        String[] arr = s.split("\\s+");
        for (int i = 0 ; i < arr.length ; ++i){
            arr[i] = convert(arr[i]);
        }
        System.out.println(String.join(" ", arr));
        
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
