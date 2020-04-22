package day13_StringClass;

public class stringManupilations_II {
    public static void main(String[] args) {
        String str = "Cybertek school is the best";

        //================= substring() ============
        //Cybertek school is the best
        //012345678901234567890123456

        System.out.println(str);
        System.out.println(str.substring(0,8)); // degisken degismedi
        System.out.println(str);
        str= str.substring(0,8); // degisken datasi degisti.
        System.out.println(str);

        String fullName = "Yucel Bark";
        // indeks sirasi   0123456789

        String firstName = fullName.substring(0,5);
        String lastName = fullName.substring(6,10);

        System.out.println(firstName);
        System.out.println(lastName);

        // Eger harf sayisindan fazla bir rakam yazarsan compile error verir.
        // son harf "K" 10 da bitiyor 10. sirada "K" var eger fonksiyonda 2. rakjam
        // 10 dan fazla verilirse Compiler error verir.

        // full name = firstname + last name
        // gmail: lastname_firstname@gmail.com

        String yucel = "Yucel Bark";
        //              0123456789

        String firstName2 = yucel.substring(0,5);
        String lastName2 = yucel.substring(6,10);

        String gmail = lastName2.concat("_").concat(firstName2).concat("@gmail.com");
        System.out.println(gmail);

        String gmail2 = lastName2+"_"+firstName2+"@gmail.com";
        System.out.println(gmail2);

        String gmail3 = yucel.substring(6,10).concat("_")+yucel.substring(0,5).concat("@gmail.com");
        System.out.println(gmail3);

        //====================================

        String e1= "I love java Programming Language";
        //          01234567890123456789012345678901
        String ClassName = e1.substring(7);
        System.out.println(ClassName);
        System.out.println("-------------------------");


        //========================replace()===============

        String w2= "I like C# Programming";
        System.out.println(w2);
        w2 = w2.replace("C#","JAVA");
        System.out.println(w2);

        System.out.println("------------------");

        String yy= " COVID 18";
        System.out.println(yy);
        System.out.println(yy.replace("8","9"));
        System.out.println(yy);
        yy= yy.replace("8","9");
        System.out.println(yy);

        //===============replaceFirst()=============

        String g=" I like C# and java is fun";
        g= g.replaceFirst("c#","Java");
        System.out.println(g);













    }
}
