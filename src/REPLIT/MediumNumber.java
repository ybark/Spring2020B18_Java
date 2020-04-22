package REPLIT;


public class MediumNumber {
    public static void main(String[] args) {


        int num1 = 150;
        int num2 = 160;
        int num3 = 140;

        String message = "Medium value is: ";
        boolean mednum1 = num1 > num2 && num1 < num3;
        boolean mednum2 = num2 > num1 && num2 < num3;
        boolean mednum3 = num3 > num1 && num3 < num2;

        if (mednum1) {
            System.out.println(message + num1);
        } else if (mednum2) {
            System.out.println(message + num2);
        } else {
            System.out.println(message + num3);
        }


    }
}
