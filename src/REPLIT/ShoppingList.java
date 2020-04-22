package REPLIT;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 =input.nextLine();
        int count1 = input.nextInt();
        double price1 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Item2, count and its price:");
        String item2 =input.nextLine();
        int count2 = input.nextInt();
        double price2 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Item3, count and its price:");
        String item3 =input.nextLine();
        int count3 = input.nextInt();
        double price3 = input.nextDouble();


        boolean zero1 = count1 <=0 && (count2>0 && count3>0);
        boolean zero2 = count2 <=0 && (count1>0 && count3>0);
        boolean zero3 = count3 <=0 && (count1>0 && count2>0);

        double totalPrice = 0;
        String report = "";

        if(zero1){
            totalPrice = (count2*price2)+ (count3*price3);
            System.out.println("Item2: " + item2 + " Price: " + (price2*count2)+
                    ", Item3: " + item3 + " Price: " + (price3*count3));

            report = "Total price: " + totalPrice;


        } else if (zero2) {
            totalPrice = (count1*price1)+ (count3*price3);
            System.out.println("Item1: " + item1 + " Price: " + (price1*count1)+
                    ", Item3: " + item3 + " Price: " + (price3*count3));

            report = "Total price: " + totalPrice;

        }else if (zero3) {
            totalPrice = (count1*price1)+ (count2*price2);
            System.out.println("Item1: " + item1 + " Price: " + (price1*count1)+
                    ", Item2: " + item2 + " Price: " + (price2*count2));

            report = "Total price: " + totalPrice;

        } else {
            System.out.println("Invalid entry");
        }
        System.out.println(report);

    }
}

