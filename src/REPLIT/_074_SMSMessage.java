package REPLIT;

import java.util.Scanner;

public class _074_SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        int senderIndex1 = message.indexOf("<");
        int senderIndex2 = message.indexOf(">");
        int phoneIndex1 = message.indexOf("[");
        int phoneIndex2= message.indexOf("]");
        int messageIndex1 = message.indexOf("{");
        int messageIndex2 = message.indexOf("}");

        String Sender = message.substring(senderIndex1+1,senderIndex2);
        String PhoneNumber = message.substring(phoneIndex1+1,phoneIndex2);
        String Message = message.substring(messageIndex1+1,messageIndex2);


        System.out.println ("Sender: " + Sender);
        System.out.println ("Phone Number: " + PhoneNumber);
        System.out.println ("Message body: " + Message);




    }
}
