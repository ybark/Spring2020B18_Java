package day26_MethodOverloading;

public class _03_Overloading {

    public static void main(String[] args) {
        method(100);
        method(500.00);
    }

    public static void method(int a) {
        System.out.println("Original method");


    }

    public static void method(double a) {
        System.out.println("overloaded method");
    }

}