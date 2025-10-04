import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main(String[] args){
        double area = 0;
        double radius = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius:");
        radius = sc.nextDouble();
        area=2*3.14*radius*radius;
        // entering the area in cm2 use number lock on+alt+0178==> to get as cm²
        System.out.println("the calculated cricle is :"+area+"cm²");
    }
}
