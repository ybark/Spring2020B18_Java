package day17_While_Loops;

public class _11_Palindrom_While {
    public static void main(String[] args) {


    String str = "Level";

    String reverseStr = "";
    int index = str.length() - 1; // last index number

    while (index >=0 ){
        reverseStr += str.charAt(index);
        index--;
    }
    boolean paliondrome = reverseStr.equalsIgnoreCase(str);
        System.out.println(paliondrome);

}

}
