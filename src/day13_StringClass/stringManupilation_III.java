package day13_StringClass;

public class stringManupilation_III {
    public static void main(String[] args) {

        //=============indekOf(Value)==============
        // returns you the index number of the first occured character as an int
        // sadece ilk karakterin indeks numarasini verir.

        String str = "I like Java Programming John";
        int num1 = str.indexOf("J");
        System.out.println(num1);

        int num2 = str.indexOf("John");
        System.out.println(num2);
        System.out.println("----------------");

        String s1= "Cybertek school is owsome";
        //          0123456789012345678901234
        int firstS = s1.indexOf("s");
        int secondS = s1.indexOf("is")+1;
        int maxIndNum = s1.length();

        System.out.println("first s indeks number is :" + firstS);
        System.out.println("second s indeks number is :"+ secondS);
        System.out.println("max indeks number" + (maxIndNum-1) );




    }
}
