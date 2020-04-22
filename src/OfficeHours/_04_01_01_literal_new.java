package OfficeHours;

public class _04_01_01_literal_new {
    public static void main(String[] args) {
        String s1= "Java"; // String literal in java pool memory
        String s2= "Java"; // String literal in java pool memory

        String s3 = new String("Java"); // in Java heap memory

        String s4 = new String("Java");

        System.out.println(s1==s2); // true
        System.out.println(s3==s2);// false different object different memory
        System.out.println(s3==s4);// false

        System.out.println("--------------------");



    }
}
