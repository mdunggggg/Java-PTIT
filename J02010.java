package com.mycompany.javaptit;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J02010 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void Process() {
        int n = scanner.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            list.add(scanner.nextInt());
        }
        int step = 1;

        for(int i = 0 ; i < n ; ++i){ 
            boolean isSort = true;
            for(int j = i + 1 ; j < n ; ++j){
                if(list.get(i) > list.get(j)){
                    Collections.swap(list, i, j);
                    isSort = false;
                }
            }
            if(isSort == false){
                System.out.print("Buoc " + step++ + ": ");
                for(Integer integer : list){
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
            
            
            
        }
        
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = scanner.nextInt();
        while (t-- > 0) {
            Process();
        }
    }
}
