package REPLIT;

import java.util.Scanner;

public class _Assesment_1_4_Calorie_Burn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double weight = 0;
        double cal = 0;

        System.out.println("Enter weight in pounds:");
        weight = scan.nextDouble();
        weight =  weight/2.2;

        double runs = (0.0175 * (6*60) * weight);

        double basket =  (0.0175 * (8*60) * weight);
        double sleep =  (0.0175 * 60 * weight);
        int result = (int) (runs + basket + sleep);
        System.out.println("Calories Burned: "+result);



    }
}
