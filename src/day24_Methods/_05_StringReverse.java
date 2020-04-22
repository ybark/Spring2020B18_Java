package day24_Methods;

public class _05_StringReverse {
    public static void main(String[] args) {
        reverse("Cybertek");

        String name = "Cybertek";
        reverse(name);
        String reversename = Reverse2("Cybertek school"); // degiskene atadik
        System.out.println(reversename); // dogrudan degisken ekrana yazdirildi.

    }



    public static void reverse(String str) {
        String Reverse="";

        for (int i=str.length()-1;i>=0;i--) {

            Reverse+= str.charAt(i);
        }
        System.out.println(Reverse);
    }

    public static String Reverse2 (String str) {
        String Reverse="";

        for (int i=str.length()-1;i>=0;i--) {

            Reverse+= str.charAt(i);
        }

        return Reverse;
    }




}
