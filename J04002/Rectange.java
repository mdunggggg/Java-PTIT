/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaptit.J04002;

/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class Rectange {
    private double height;
    private double width;
    private String color;

    public Rectange() {
    }

    public Rectange(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = convert(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return this.width * this.height;
    }
    public double findPerimeter(){
        return (this.width + this.height) * 2;
    }
    private String convert(String s){
        if(s.length() == 1){
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
