/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03020 {
    public static Scanner scanner = new Scanner(System.in);
     private static boolean  checkdx(String s){
        StringBuilder sc = new StringBuilder(s);
        String reverse = sc.reverse().toString();
        return s.equals(reverse);
    }
    public static void Process() {
         LinkedHashMap<String,Integer> mp = new LinkedHashMap<>();
        int len = 0;
        while (scanner.hasNext()){
            String store = scanner.nextLine();
            String[] s = store.split("\\s+");
             for (String item : s) {
                 if (J03020.checkdx(item) == true) {
                     if (mp.containsKey(item)) {
                         mp.put(item, mp.get(item) + 1);
                     } else {
                         mp.put(item, 1);
                     }
                     len = Math.max(item.length(), len); 
                 }
             }
        } 
        for (Map.Entry<String,Integer> tmp : mp.entrySet()){
           if (tmp.getKey().length()==len ){
               System.out.println(tmp.getKey()+" "+tmp.getValue()+" ");
           } 
        }
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
