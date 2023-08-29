package com.mycompany.javaptit;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J03010 {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, Integer>map = new HashMap<>();
    public static void Process() {
        String[] s = scanner.nextLine().trim().split("\\s+");
        if(map.containsKey(s[s.length - 1].toLowerCase())){
            map.replace(s[s.length - 1].toLowerCase(), map.get(s[s.length - 1].toLowerCase()) + 1);
        }
        else{
            map.put(s[s.length - 1].toLowerCase(), 1);
        }
        System.out.print(s[s.length - 1].toLowerCase());
        for(int i = 0 ; i < s.length - 1 ; ++i){
            System.out.print(s[i].toLowerCase().charAt(0));
        }
        if(map.get(s[s.length - 1].toLowerCase()) == 1){
            System.out.println("@ptit.edu.vn");
        }
        else{
            System.out.println(map.get(s[s.length - 1].toLowerCase()) + "@ptit.edu.vn");
        }   
    }

    public static void main(String[] args) {
        //int t = 1;
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            Process();
        }
    }
}
