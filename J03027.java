/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03027 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        String s = scanner.next();
        Stack<Character>st = new Stack<>();
        for(int i = 0 ; i < s.length(); ++i){
            if(!st.empty() && st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        String ans = "";
        while(!st.empty()){
            ans += st.pop();
        }
        if(ans.equals("")){
            System.out.println("Empty String");
            return;
        }
        for(int i = ans.length() - 1 ; i >= 0 ; --i){
            System.out.print(ans.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = 1;
      // int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
