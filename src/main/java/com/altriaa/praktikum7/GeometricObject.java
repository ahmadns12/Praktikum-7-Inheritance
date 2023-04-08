/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altriaa.praktikum7;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public java.util.Date getDataCreated(){
        return dateCreated;
    }
    
    public String toString(){
        return "Create on " + dateCreated + "\nColor: " +  color + " and filled: "
                + filled;
    }
}
