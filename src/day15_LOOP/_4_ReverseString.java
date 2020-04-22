package day15_LOOP;

public class _4_ReverseString {


    public static void main(String[] args) {

        String str="yucel bark";
        int lastIndexnumber = str.length()-1;

        String reverse2="";
        for (int i=lastIndexnumber; i>=0;i--){
            System.out.print(str.charAt(i));
            reverse2 += str.charAt(i);
        }
        System.out.println();
        System.out.println(reverse2);


    }
}
