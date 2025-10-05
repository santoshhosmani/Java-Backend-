package com.java.learnings.userInputs;

import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the width: ");
        width = sc.nextDouble();
        System.out.println("enter the height: ");
        height = sc.nextDouble();
        area=width*height;
        // entering the area in cm2 use number lock on+alt+0178==> to get as cm²
        System.out.println("the calculated area is:"+area+"cm²");


    }
}
