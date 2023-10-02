/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03009 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String[] s1 = scanner.nextLine().split("\\s++");
        String s2 = scanner.nextLine();
        Set<String>s = new HashSet<>();
        for (String x : s1){
            if(!s2.contains(x)){
                s.add(x);
            }
        }
        for(String x : s){
            System.out.print(x + " ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
