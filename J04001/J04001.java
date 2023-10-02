/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit.J04001;

import java.util.Scanner;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class J04001 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double t = scanner.nextDouble();
        Point p1 = new Point(x, y);
        Point p2 = new Point(z, t);
        Double ans =  p1.distance(p2);
        System.out.printf("%.4f", ans);
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
