package com.java.learnings.userInputs;

import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main(String[] args){
        double area = 0;
        double radius = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius:");
        radius = sc.nextDouble();
        // use the formula to calculate the Area of circle using ==> pie*r*r
        area=3.14*radius*radius;
        // entering the area in cm2 use number lock on+alt+0178==> to get as cm²
        System.out.println("the calculated cricle is :"+area+"cm²");
    }
}
