/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit.J04002;

import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J04002 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String z = scanner.next();
        if(x <= 0 || y <= 0){
            System.out.println("INVALID");
            return;
        }
        Rectange t = new Rectange(x, y, z);
         System.out.printf("%.0f %.0f %s", t.findPerimeter(), t.findArea(), t.getColor());
              
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
