package day13_StringClass;

public class stringManupilation {
    public static void main(String[] args) {
        String str ="Cybertek"; //it has index number starting 0
        //           01234567
        // charAt(index number)

        char ch1 = str.charAt(5);
        System.out.println(ch1);
        System.out.println(ch1=='t');

        //lenght() uzunluk

        int totalLenght = str.length();

        System.out.println(totalLenght);
        System.out.println(totalLenght>250);

        String str2 = "today is great day' Java is Fun";
        int maxnumber = str2.length();
        System.out.println(maxnumber);
        System.out.println("index number" + (maxnumber-1));

        String s1 = "Cybertek";
        s1= s1.concat(" School");  // school kelimesi eklendi eger yeni kelime d
                                // egiskene atanmaz ise original degisken etkilenmez
        System.out.println(s1);

        String s2 = "java";
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1="Java is fun";
        r1=r1.concat(", and its easy");
        System.out.println(r1);

        //===========toLowerCase() =========

        String l1= "CYBERTEK";
        l1= l1.toLowerCase();
        System.out.println(l1);

        //=========toUpperCase() ======
        String l2 = "happy new year";
        l2= l2.toUpperCase();
        System.out.println(l2);

        //============ trim() ======== gereksiz bosluklari siler

        String A1 = "           Today is great day.      ";
        System.out.println(A1);
        System.out.println(A1.trim());
        System.out.println(A1);
        A1= A1.trim();
        System.out.println(A1);








    }


}
