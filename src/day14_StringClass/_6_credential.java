package day14_StringClass;

import java.util.Scanner;
  /*
        userName : cybertek
        PassWord : cybertekschool
         */


public class _6_credential {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ValidUserName ="cybertek";
        String ValidPassWord ="cybertekschool";

        System.out.println("Enter your username :");
        String inputUserName = input.next();

        System.out.println("Enter your password:");
        String inputPassWord = input.next();
        boolean validCredential = inputUserName.equals(ValidUserName) &&
                inputPassWord.equals(ValidPassWord);


            if (validCredential){
            //if (inputUserName.equals(ValidUserName) && inputPassWord.equals(ValidPassWord)){
            System.out.println("log in successfully");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
