package REPLIT;

import java.util.Scanner;

public class _056_LapTop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price =0;
        String  storageType, screenType, cpu = "";
        int ram =0;

        System.out.println("Select screen size: ");
        screenType = scan.next();
        if (screenType.equals("13.3")) {
            price+=200;
        }else if (screenType.equals("15.0")) {
                price+=300;
        } else if (screenType.equals("17.3")) {
            price +=400;
        }


        System.out.println("Select CPU type: ");
        cpu = scan.next();
        if (cpu.equals("i3")){
            price+=150;
        }else if (cpu.equals("i5")){
            price+=250;
        }else if (cpu.equals("i7")){
            price+=350;
        }

        System.out.println("Select RAM size: ");
        ram = scan.nextInt();
         price+= ((ram/4)*50);

        System.out.println("Select storage type: ");
        storageType = scan.next();
        System.out.println("Enter memory size: ");
        int memoSize=scan.nextInt();

        if (storageType.equals("HDD")) {
            price+=((memoSize/500)*50);
        }else if (storageType.equals("SSD")){
            price+=((memoSize/500)*100);
        }

        System.out.println("Enter screen resolution: ");
        String resolution = scan.next();

        if (resolution.equals("FULLHD")) {
            price+=100;
        }else if (resolution.equals("4K")) {
            price += 200;
        }

        System.out.println("Laptop price is: $" + price);
    }
}
