///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.javaptit;
//
//import java.util.Scanner;
//
//class PhanSo{
//    public long tu, mau;
//    public PhanSo(long tu, long mau){
//        this.tu = tu;
//        this.mau = mau;
//    }
//    public PhanSo Cong(PhanSo b){
//       long mauu = this.mau/gcd(this.mau, b.mau) * b.mau;
//       long tuu = this.tu * (mauu / this.mau) + b.tu * (mauu / b.mau);
//        long tmp = gcd(mauu, tuu);
//      return new PhanSo(tuu / tmp, mauu / tmp);
//
//    }
//    private long gcd(long a, long b){
//        if(b == 0) return a;
//        return gcd(b, a % b);
//    }
//}
//public class J04004 {
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static void Process() {
//        long a, b, c, d;
//       
//        a = scanner.nextLong();
//        b = scanner.nextLong();
//        c = scanner.nextLong();
//        d = scanner.nextLong();
//        PhanSo ps1 = new PhanSo(a, b);
//        PhanSo ps2 = new PhanSo(c, d);
//        PhanSo ps3 = ps1.Cong(ps2);
//        System.out.println(ps3.tu + "/" + ps3.mau);
//    }
//
//    public static void main(String[] args) {
//        int t = 1;
//        //int t = Integer.parseInt(scanner.nextLine());
//        while (t-- > 0) {
//            Process();
//        }
//    }
//}
