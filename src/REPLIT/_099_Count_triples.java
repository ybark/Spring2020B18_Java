package REPLIT;

import java.util.Scanner;

public class _099_Count_triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str=str.concat(" ");
        int counter = 0 ;
        String newstr="";
        int result = 0;
        int count=0;

        for (int i= 0;i<=str.length()-1;i++) {
            if(newstr.contains(""+str.charAt(i))) {
                continue;
            }
            newstr+=""+str.charAt(i);
        }
        System.out.println(newstr);

        for (int i=0;i<newstr.length();i++) {

            for (int j=0;j<str.length();j++) {
                if ( newstr.charAt(i)== str.charAt(j) ) {
                    counter++;
                    System.out.println(newstr.charAt(i) + "     "   + str.charAt(j)+ "     " + counter +" " +count);
                    continue;
                }
                if (counter ==3){count++;}
                if (counter ==4) {count+=2;}
                if (counter ==5) {count+=3;}
                counter = 0;
                System.out.println(newstr.charAt(i) + "     "   + str.charAt(j)+ "     " + counter +" " +count);




            }
            result = result+count;
            System.out.println("=======");
            System.out.println(result);
            count=0;



        }
        System.out.println(result);


    }
}


