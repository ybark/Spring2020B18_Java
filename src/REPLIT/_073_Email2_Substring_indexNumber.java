package REPLIT;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class _073_Email2_Substring_indexNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int nameIndex = email.indexOf("_");
        int surnameIndex = email.indexOf("@");
        int comIndex = email.indexOf(".");
        String name = email.substring(0,nameIndex);
        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        String surname = email.substring((nameIndex+1),surnameIndex);
        surname= surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
        String domain = email.substring((surnameIndex)+1,comIndex);
        String com = email.substring(comIndex+1);

        System.out.println("First name: "+name);
        System.out.println("Last name: "+surname);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+com);



    }


}
