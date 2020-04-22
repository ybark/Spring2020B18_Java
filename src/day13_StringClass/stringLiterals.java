package day13_StringClass;

public class stringLiterals {
    public static void main(String[] args) {
        String str1 = "cat"; // String literal
        String str2 = new String("car");

        System.out.println(str1 + " : " + str2);

        String str3 ="cat";
        String str4 = new String("cat");

        System.out.println( str1 == str2); //2 different object
        System.out.println(str1==str3);
        System.out.println(str2== str4);

    }
}
