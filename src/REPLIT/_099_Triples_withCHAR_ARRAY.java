package REPLIT;

import java.util.Scanner;

public class _099_Triples_withCHAR_ARRAY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.concat(" ");
        int count = 0;


        String a = "";
        String a2 = "";
        String a3 = "";


        for (int i = 0; i <= str.length() - 3; i++) {
            a = "" + str.charAt(i);
            a2 = "" + str.charAt(i + 1);
            a3 = "" + str.charAt(i + 2);

            if (a.equals(a2) && a.equals(a3)) {
                System.out.print(str.charAt(i) + "\t" + a + "\t" + a2 + "\t" + a2 + "\n");
                count++;

            }

        }
        System.out.println(count);

    }
}
        /*char [] ch = str.toCharArray();
        for (int i =0; i < ch.length-2; i++){
            if (ch[i]== ch[i+1] && ch[i] == ch[i+2]){
                count++;
            }
        }
        System.out.println(count);
   }
}

         */


