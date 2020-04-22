package REPLIT;

import java.util.Scanner;

public class _035_GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        String usb = "USB cable";


        int price = 500;
        int wallet = 100;
        int remain = 100;
        int exist=0;

        String thanks="Thank you for your purchase!";
        String sorry ="Sorry, not enough funds on your gift card!";
        String balance = "Your current balance is: ";


            if (item.equals("Smartphone")) {
                price = 300; exist=1;
            } else if (item.equals("Laptop")) {
                price = 400; exist=1;
            } else if (item.equals("Charger")) {
                price = 15; exist=1;
            } else if (item.equals("USB cable")) {
                price = 10; exist=1;
            } else if (item.equals("Headphones")) {
                price = 30; exist=1;
            } else if (item.equals("Pants")) {
                price = 50; exist=1;
            } else if (item.equals("Hat")) {
                price = 25; exist=1;
            } else if (item.equals("Blanket")) {
                price = 60; exist=1;
            } else if (item.equals( "Pillow")) {
                price = 40; exist = 1;
            } else if (item.equals( "Socks")) {
                price = 40; exist = 1;

            } else {
                System.out.println("Invalid item!");
            }
            if (exist==1 && price>wallet) {
                        System.out.println(sorry);
            } else if (exist==1) {

                System.out.println(thanks);
                System.out.println(balance + (wallet - price));
            }

        System.out.println(usb);
        System.out.println(item);


        }

    }

