/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit;

import java.util.Scanner;
class PhanSo{
    public long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo RutGon(PhanSo a){
        long tmp = gcd(a.tu, a.mau);
        return new PhanSo(tu / tmp, mau / tmp);
    }
    private long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}

public class J04003 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Process() {
        long a, b;
        a = scanner.nextLong();
        b = scanner.nextLong();
        PhanSo ps1 = new PhanSo(a, b);
        ps1 = ps1.RutGon(ps1);
        System.out.println(ps1.tu + "/" + ps1.mau);
    }

    public static void main(String[] args) {
        int t = 1;
        //int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Process();
        }
    }
}
