package day09_NestedIf_Ternary;

public class Ternary_practice2 {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 200;
        int min = (num1<num2) ? num1 : num2;

        System.out.println(min);
        System.out.println("--------------------------------------");

        int hour =14;
        String message = (hour<=12) ? "good morning" : (hour>12 && hour <18) ? "good afternoon" : "good evening";
        System.out.println(message);

        System.out.println("-------------------------------------------");

        int number = 12005;
        boolean divisibleBy3And5 = (number % 3 ==0 && number %5 ==0) ? true : false;
        System.out.println(divisibleBy3And5);

        System.out.println("----------------------");


    }
}
