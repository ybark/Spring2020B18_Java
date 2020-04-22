package day25_Methods;


import java.util.Scanner;

public class _01_WarmUpTest_NonDublicate_Frequency_str2Instr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str2 = sc.next();

        System.out.println(removeDublicates(str));
        System.out.println(frequences(str));
        System.out.println(Number(str,str2));


    }



        // -------------------REMOVE DUBLICATES --------------------
        public static String removeDublicates(String string) {

        String result ="";
        /*for (int i=0;i<string.length();i++) {
            if(result.contains(""+string.charAt(i))) {
                continue;
            }
            result+=""+string.charAt(i);
        }
        return result;

        */
            for (int i=0; i<string.length();i++) {
                char ch= string.charAt(i);
                if ( !result.contains(""+ch)){
                    result+=ch;
                }
            }
            return result;
        }


        //---------------FREQUENCY OF FIRST SECOND STR IN FIRST STR -----------


        public static <str2> int Number (String str1, String str2) {

        int result =0;

        for (int i=0; i<str1.length();i++) {
            //if ((str1.charAt(i) + "").equals(str2)) {  //1. cozum
            if ( str1.contains(str2) ){                 // 2. cozum
                str1=str1.replaceFirst(str2,"");
                result++;
            }
        }
        return result;

        }



        //------------------ FREQUENCIES -----------------------
        public static String frequences (String str) {

        String nondublicate="";
        String result="";
        int count =0;
        char ch =' ';

        for (int j=0;j<str.length();j++) {

            for (int i=0;i<str.length();i++) {

                if (nondublicate.contains(""+ str.charAt(i)) ) {
                    continue;
                }
                nondublicate+=str.charAt(i);

            }

        }

        for (int j=0;j<nondublicate.length();j++) {
            ch=nondublicate.charAt(j);
            for (int i=0;i<str.length();i++) {
                if(ch==str.charAt(i)) {
                    count++;
                }
            }
            result+=ch+""+count;
            count=0;
        }


        return result;
        }


        }



