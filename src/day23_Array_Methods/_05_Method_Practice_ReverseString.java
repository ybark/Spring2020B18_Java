package day23_Array_Methods;

public class _05_Method_Practice_ReverseString {
    public static void main(String[] args) {

        String name = "Yucel";
        reverse_String(name);
        System.out.println("hello");
        String name2 = "Cybertek";
        reverse_String(name2);



    }

    public static void reverse_String(String reverse) {

        for (int i=reverse.length()-1;i>=0;i--) {
            System.out.print(reverse.charAt(i));
        }
        System.out.println();



    }
}
