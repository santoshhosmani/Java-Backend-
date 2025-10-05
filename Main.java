package com.java.learnings;

public class Main {
    public static void main(String[] args) {

        // this is my java project
        /*
        welcome to the clubb!!!
         */
        System.out.println("Hello and welcome buddy to the Journey of Java!");
        System.out.println("Hello Dear happy to see you ");
        System.out.println("here is something new ");

        // starting with different Variables such as int,double,char,boolean and String
        // which are primitive and reference variables!!.

        //1.int variable

        int age=25;
        int year=1999;
        int budget=22000;
        System.out.println("the age of the person is:"+ age);
        System.out.println("the born year the person is:"+ year);
        System.out.println("the budget of the person is:"+ budget);

        //2. double variable

        double age1=25.6;
        double year1=199.9;
        double budget1=10000.12;
        System.out.println("the age of the person is:"+ age1);
        System.out.println("the born year the person is:"+ year1);
        System.out.println("the budget of the person is:"+ budget1);

        //3. char variable

        char age2='A';
        char year2='Z';
        char budget2='$';
        System.out.println("the age of the person is:"+ age2);
        System.out.println("the born year the person is:"+ year2);
        System.out.println("the budget of the person is:"+ budget2);

        //4.Boolean variable

        boolean isEmployee=false;
        boolean isWorking=false;
        boolean isSalaried=true;
        if(isEmployee){
            System.out.println("the occupation is an employee :"+ isEmployee);
        } else if (isWorking) {

            System.out.println("does he has job:"+ isWorking);
        }else if(isSalaried){
            System.out.println("yes is a working man ");
        }
        else{
            System.out.println("the employee is getting paid:"+ isSalaried);
        }

        // 5. Strings variable
        String name="Santosh!";
        String email="happy@gmail.com";
        String address="BTM 2nd Stage Banglore";
        System.out.println("The employee name is: " + name);
        System.out.println("The employee emailID  is: " + email);
        System.out.println( "The employee is located at: " + address);
        // lets use each of variable for printing the details in one sout statements
        //output for below is Santosh 25 $ 10000.12 false
        System.out.println("the Name of the candidate: "+ name + " age is :" + age + " "+ "the Budget Symbol is: "+ budget2+ " "+ "The budget is:"+budget1 + " "+"is he working man:" + isWorking);
        System.out.println(" "+ name + " " + age + " "+ budget2+ " "+budget1 +" " + isWorking);

    }
}