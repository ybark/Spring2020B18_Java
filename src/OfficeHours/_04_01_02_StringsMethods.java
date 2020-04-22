package OfficeHours;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class _04_01_02_StringsMethods {
    public static void main(String[] args) {
        // charAt(indekxNumber :) returns the char at given index , char primitive

        String str1 = "Java";
        //             0123

        char ch1 = str1.charAt(3);
        System.out.println(ch1);

        // char ch2 = str1.charAt(4); // 4 index numarali karakter olmadigindan -1 olarak doner
        // System.out.println(ch2);

        System.out.println("=================================");



        // -----------------------------------------------------------------

        // lenght(): string icerisinde bulunan toplam karakter sayisini verir.ve sonucu int olarak donderir.

        String str2 = "Cybertek School";

        int total = str2.length();
        System.out.println(total);
        int maxIndex = str2.length() -1;
        System.out.println(maxIndex);
        System.out.println(str2.charAt(14));

        char ch3 = str2.charAt(14);
        System.out.println(ch3);
        System.out.println("================================");

        //--------------------------------------------------------

        //concat(str) : concatenation, returns new String

        String str3 = "Cybertek";
                str3= str3.concat(" School");

        System.out.println(str3);

        String str4 = "Java";

        str4.concat(" is fun"); // Java is fun oldu ama degiskene atanmadigi icin degisken degismedi.
        System.out.println(str4.concat(" is fun"));
        System.out.println(str4);
        str4 = str4.concat(" is fun");
        System.out.println(str4);

        //---------------------------------------

        // toLowerCase() & toUpperCase() : degiskenin tamamini buyuk veya kucuk harflere cevirir.

        String str5 = "CYBERTEKSCHOOL";

        System.out.println(str5.toLowerCase()); // degiskene atanmadi
        System.out.println(str5); // eski hali degismedi
        str5 = str5.toLowerCase(); // artik kucuk harf olarak degistirildi
        System.out.println(str5);

        String str6 = "yucel";
        System.out.println(str6.toUpperCase());
        str6= str6.toUpperCase();
        System.out.println(str6);
        System.out.println("============================");


        //--------------------------------------------------
        // trim() : removes unused (white)  spaces from the string.

        String str7 = "             Cybertek        ";
        System.out.println(str7.length());
        System.out.println(str7.trim());
        str7=str7.trim(); // str7 ye yeni hali ile atama yapildi
        System.out.println(str7);
        System.out.println(str7.length());

        System.out.println("============================");

        //-----------------------------------------------------

        //substring(begening index, ending index); iki index numara arasinda bulunan kelimekleri cikrtir ending index numarasi dahil degildir.

        // substring(begenning index): verilen begening index numarasindan sonrasini cikartir

        String sentence1 = "I like Java";
        //                  01234567890
        System.out.println(sentence1.substring(7,11)); //"Java
        System.out.println(sentence1);

        String word1 = sentence1.substring(7,11);
        System.out.println(word1);
        word1 = sentence1.substring(7,sentence1.length()-1+1);
        System.out.println(word1);

        String word2 = sentence1.substring(2,6);
        System.out.println(word2);

        //likeJava
        String word3 = sentence1.substring(2,6)+ sentence1.substring(7,11);
        System.out.println(word3);

        // substring(begenning index)
        String  sentence2 = "I like to learn Java";
        //                   012345678901234567890
        System.out.println(sentence2.length());
        System.out.println(sentence2.substring(10));
        String r1 = sentence2.substring(10);
        System.out.println(r1);

        String r2 = "Java"; //JaVa;
        //       0123
        String r3 = r2.substring(0, 2);   //Ja

        String r4 = r2.substring(2,3) ;  // v
        r4 = r4.toUpperCase(); //V

        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; // JaVa

        System.out.println(result);


        System.out.println("=============================================");


        System.out.println("=============================================");

        //replace(old str, new str): replaces all the matching ones, returns new string
        String str = "I like C#, C# is cool";
        str =   str.replace("C#" , "Java" ); // "I like Java, Java is cool"

        System.out.println(str);

        //replaceFirst(old str, new str): replace the firast matching one, returns new string
        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst(", Java", ", C#");
        System.out.println(t1);

        System.out.println("=============================================");
        // indexOf(str): returns the index of first matching character, as an int
        String y1 = "Today W is Wednesday";
        int a1 =  y1.indexOf("W");  // first W' index num
        int a2 = y1.indexOf("Wednesday");  // second W' index num
        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf(str): returns the index of last matching character, as an int
        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); // last S' index number
        System.out.println(a3);



    }
}
