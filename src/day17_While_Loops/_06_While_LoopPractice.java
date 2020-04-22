package day17_While_Loops;

import java.util.Scanner;

public class _06_While_LoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String world = scan.next();

        boolean valid = world.equalsIgnoreCase("yes") || world.equalsIgnoreCase("no");

        while (!valid) {
            System.out.println("please re-enter:");
            world= scan.next();
            if (world.equalsIgnoreCase("yes") || world.equalsIgnoreCase("no")) {
              break;
            }
        }
        if(world.equalsIgnoreCase("yes")) {
            System.out.println("Entered YES");
        }
        if (world.equalsIgnoreCase("no")) {
            System.out.println("Entered NO");
        }
    }
}
