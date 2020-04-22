package day12_JavaRecap;

import java.util.Scanner;

public class TernaryPractice{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Status code");
        int statusCode = input.nextInt();
        String result ="";

        if ( statusCode==200){
            result = "Ok";
        } else if (statusCode==201) {
            result = "Created";
        }
            else if (statusCode==202) {
                result ="Accepted";
            } else {
            result = "Invalid Status Code";
        }
        System.out.println(result);
        System.out.println("Enter 2nd Status Code");
        int statusCode2 = input.nextInt();

        String result2 = (statusCode2==200) ? "Ok": (statusCode2==201)? "Created": (statusCode2==202)? "Accepted"
                : "Invalid Status Code";
        System.out.println(result2);
    }

}
