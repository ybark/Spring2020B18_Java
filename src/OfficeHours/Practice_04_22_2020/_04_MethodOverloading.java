package OfficeHours.Practice_04_22_2020;

public class _04_MethodOverloading {

    public static void main(String[] args) {
         method1(10,20); // return type is void so nothing can be returned

        int num1 = method1(10); // return type is int so it can return what we  have sent with the return comment
        System.out.println(num1);

        method1(10,20); // return type is void so nothing can be returned

    }

    public static void method1 () {
        System.out.println("Hello world");

    }

    public static int method1 (int a) {
        System.out.println("Hello Cybertek");
        return 123;

    }

    public static void method1 (int a, int b) {
        System.out.println("Hello batch-18");

    }
}
