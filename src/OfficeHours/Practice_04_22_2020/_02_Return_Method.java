package OfficeHours.Practice_04_22_2020;


public class _02_Return_Method {
    public static void main(String[] args) {
        // int a = sum(10,20); // degiskene atayamazsin zira return type void
        sum(10, 20);
        int a = sum2(500, 600);
        System.out.println(a);


        System.out.println("=================================");

        String str = "Cybertek";

        // Asagidaki grubu class halinde yapabiliirz

        String result = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        System.out.println(result);

         String name ="level";

         String name2 = reverse(name);
        System.out.println(name2);
        System.out.println(name.equals(name2));


    }




    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }


    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum2(int a, int b) {
        int result = a + b;
        return result;
    }


}
