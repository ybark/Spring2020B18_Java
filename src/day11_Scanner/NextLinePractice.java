package day11_Scanner;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter your age :");
        int age = input.nextInt(); // 50 + <Enter>

        System.out.println("your age is :"+ age);

        //--------------------------------

        input.nextLine();  // bu komut ile Nextline komutunun <enter> komutunu
                          // saklamasini engelliyoruz... zira bir sonraki satirda
                         // NextLine komutu var

        System.out.println("Write your full name please");
        String fullname = input.nextLine();
        System.out.println("Your full name is : "+ fullname);



    }

}
