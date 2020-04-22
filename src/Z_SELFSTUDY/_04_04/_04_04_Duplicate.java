package Z_SELFSTUDY._04_04;

import java.util.Scanner;

public class _04_04_Duplicate {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
    String str = sc.nextLine();
    String result ="";

    for(int i= 0;i<= str.length()-1; i++){

        if (result.contains(""+str.charAt(i))) {
            continue;
        }
        result+=str.charAt(i);
        }

        System.out.println(result);
    }


}

