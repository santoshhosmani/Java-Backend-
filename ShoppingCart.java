import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String items;
        double price;
        int quantities;
        char Currency='$';
        double count;
        System.out.print("whats your buying from the cart:");
        items=sc.nextLine();
        System.out.print("whats the price of each items:");
        price=sc.nextDouble();
        System.out.print("How many your buying from the cart/mall:");
        quantities=sc.nextInt();
        //System.out.println("the currency of each items in:"+Currency);
        count=price*quantities;
        System.out.println("\n you have bought of "+quantities+" "+items+"!!");
        System.out.print("whats the total count of the details:" + Currency+" "+count);
        sc.close();
    }
}
