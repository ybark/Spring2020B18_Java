package Z_SELFSTUDY;

import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _03_31_Really {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = input.next();

        if (word.endsWith("ly")) {
            System.out.println("REALLY !!");
        } else {
            System.out.println(" never mind");
        }


    }
}
