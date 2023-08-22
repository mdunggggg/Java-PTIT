/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J02017 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int n = scanner.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; ++i){
            int x = scanner.nextInt();
            if (!st.isEmpty()){
                int k = st.pop();
                if((k + x) % 2 == 1){
                    st.push(k);
                    st.push(x);
                }
            }   
            else
                st.push(x);
        }
        System.out.println(st.size());
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
