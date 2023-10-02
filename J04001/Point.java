/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit.J04001;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point seconPoint){
        return distance(this, seconPoint);
    }
    public double distance(Point p1, Point p2){
        double cur = Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(cur);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
