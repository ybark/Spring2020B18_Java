package Z_SELFSTUDY;

public class StringPractice {


    public static void main(String[] args) {

        String word = "Yucel";
        word = word.concat(" Bark");
        System.out.println(word);
        System.out.println("------------------");

        String word2=" Dilek";
        word2=word.concat(word2);
        System.out.println(word2);
        System.out.println("----------------");

        word=word.toLowerCase();
        System.out.println(word);
        System.out.println("-----------------");

        word2= word2.toUpperCase();
        System.out.println(word2);
        System.out.println("-----------------");

        word = "        yucel bark      ";
        word=word.trim();
        System.out.println(word);
        System.out.println("-----------------");


        String name = word.substring(0,5);
        String surname = word.substring(6,10);
        System.out.println(name);
        System.out.println(surname);
        System.out.println("-----------------");

        word = "yucel bark member of family";
        word =word.substring(6);
        System.out.println(word);
        System.out.println("------------------");

        word = " I love c# very much";
        System.out.println(word);
        word=word.replace("c#","Java");
        System.out.println(word);
        System.out.println("------------------");

        String fullname = "dilek bark";
        fullname= fullname.replaceFirst("k","r");
        System.out.println(fullname);
        System.out.println("----------------------");

        word = "I like Java Programming John";
        int a1 = word.indexOf("J");
        int a2 = word.indexOf("Jo");
        int a3 = word.lastIndexOf("J");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("-----------------");

        String e1="";
        String e2=" ";
        System.out.println(e1.isEmpty());
        System.out.println(e2.isEmpty());
        System.out.println("-----------------");

        String word1 = "cybertek";
        String word3 = "CYBERTEK";
        System.out.println(word1.equals(word3));
        System.out.println(word1.equalsIgnoreCase(word3));
        System.out.println("---------------------");

        word = " Cybertek School";
        word2 = "School";

        boolean sonuc = word.contains(word2);
        boolean sonuc2 = word.contains("School");

        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(word.contains("school"));
        System.out.println("-------------------");

        word ="www.cybertekschool.com";
        word2 = " www.";
        word3 = ".com";

        sonuc= word.startsWith(word2);
        sonuc2 = word.startsWith("www.");

        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(word.startsWith("www,"));
        System.out.println("-------------------");

        sonuc = word.endsWith(word3);
        sonuc2 = word.endsWith(".com");

        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(word.endsWith(".net"));











    }
}