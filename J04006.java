/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien{
    private String name, birth, lop;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, String lop, String birth, double gpa) {
        this.name = name;
        this.birth = birth;
        this.lop = lop;
        this.gpa = gpa;
    }
    private String format() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = format.parse(birth);
             return format.format(date);
        }
        catch(ParseException e){
            
        }
        return "";
    }

    @Override
    public String toString() {
        return "B20DCCN001 " +  name + " " + lop + " " + format() +  " " + String.format("%.2f", gpa);
    }
}
public class J04006 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
         String name = scanner.nextLine();
         String lop = scanner.nextLine();
         String birth = scanner.nextLine();
         double gpa = scanner.nextDouble();
         SinhVien sv = new SinhVien(name, lop, birth, gpa);
         System.out.println(sv);
    }

    public static void main(String[] args) {
        int t = 1;
       // int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
