import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" please enter User name :");
        String name =sc.nextLine();
        System.out.println("please enter ur age:");
        int age=sc.nextInt();
        System.out.println(" please enter your email:");
        String emailID=sc.next();
        System.out.println("the your a working person?(true/false)");
        boolean isWorking=sc.nextBoolean();
        System.out.println("enter your currency details:");
        double value=sc.nextDouble();
        System.out.println("Hello Man:"+name);
        System.out.println("your age is:"+age);
        System.out.println("your email provided as:"+emailID);
        System.out.println("The entered currency amount is:"+value);
        if(isWorking){
            System.out.println("yess is working person");
        }
        else{
            System.out.println("currently he is not working");
        }

        sc.close();
    }
}
