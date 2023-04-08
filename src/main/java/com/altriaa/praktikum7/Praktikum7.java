/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum7;

import java.util.Scanner;
/**
 *
 * @author Altriaa
 */
public class Praktikum7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of Triangle");
        String color = input.next();

        System.out.println("Is the Triangle filled? Reply with 'true' or 'false' ");
        Boolean filled = input.nextBoolean();
        
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(filled);
        triangle.setColor(color);
        System.out.println(triangle.toString());
        System.out.println("The Triangle Area is " + triangle.getArea());
        System.out.println("The Triangle Perimeter is " + triangle. getPerimeter());
        System.out.println("The Triangle Color is " + triangle.getColor());
        if(filled == true){
            System.out.println("Is the Triangle filled? Yes");
        }else{
            System.out.println("Is the Triangle filled? No");
        }
    }
}
