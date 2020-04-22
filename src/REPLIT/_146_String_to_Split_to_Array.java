package REPLIT;

import java.util.Scanner;

public class _146_String_to_Split_to_Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {
    String[] arr = info.split(",");
        System.out.println("Person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);

}
}