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
public class J03024 {
    public static Scanner scanner = new Scanner(System.in);
    public static int solve(String s){
        if (s.charAt(0) == '0') {
            return -1;
        }
        int even = 0, odd = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return -1;
            }
            if ((s.charAt(i) - '0') % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if ((s.length() % 2 == 0 && even > odd) || (s.length() % 2 == 1 && odd > even)) {
            return 1;
        }
        return 0;
    }
    public static void Process() {
        String s = scanner.next();
        if (solve(s) == -1) {
            System.out.println("INVALID");
        } else if (solve(s) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
