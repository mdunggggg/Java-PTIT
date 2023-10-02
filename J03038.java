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
public class J03038 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.nextLine();
        int[] dd = new int[26];
        for(int i = 0 ; i < s.length() ; ++i){
            dd[s.charAt(i) - 'a'] = 1;
        }
        int ans = 0;
        for(int i : dd){
            ans += i;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
