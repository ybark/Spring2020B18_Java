package REPLIT;

import java.util.Scanner;

public class _085_ShoppingList2_Loop_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        boolean stop = true;
        while (stop) {
        System.out.println("Enter Item" + count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();




            System.out.println("Add one more item?");
            countinue = scan.next();

            if (countinue.equals("yes")) {
                totalPrice += price;
                shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
                count++;

            } else if (countinue.equals("no")) {
                totalPrice += price;
                shoppingListReport += "Item" + count + ": " + item + " Price: " + price;

                stop = false;
            }

            }
            System.out.println(shoppingListReport);
            System.out.println("Total price: " + totalPrice);

    }
}