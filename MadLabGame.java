package com.java.learnings.userInputs;

import java.util.Scanner;

public class MadLabGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("enter the adjective(description:)");
        adjective1=sc.nextLine();
        System.out.print("enter a noun1:(animal name:)");
        noun1=sc.nextLine();
        System.out.print("enter the adjective(description about how it was:)");
        adjective2=sc.nextLine();
        System.out.print("enter a verb(ing,what it is doing: )");
        verb1=sc.nextLine();
        System.out.print("enter the adjective(description,how you felt:)");
        adjective3=sc.nextLine();

        System.out.println("Today i went to a: "+adjective1);
        System.out.println("in an exhibition I saw a:"+" "+ noun1+" ");
        System.out.println(noun1+ " "+"and " +adjective2+" " +verb1+"!");
        System.out.println("I have seen " +" "+adjective3+"!!");
    }
}
