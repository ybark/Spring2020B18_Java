package day25_Methods;

import Resources.Library;

public class _07_FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "AABBCC";  // A2B2C2
        String NonDub = Library.removeDublicates(str);
        System.out.println(NonDub);
        String result="";
        for (int i=0;i<NonDub.length();i++) {
            String ch = "" + NonDub.charAt(i);
            int num = Library.frequncy_str2_in_str1(str, ch);
            //System.out.print(ch + num);
            result+=ch+num;

        }
        System.out.println(result);

        String str3 = "AAAAAYYYYYBBBBBCCCCCC";
        String result2= Library.FrequencyOfChars(str3);
        System.out.println(result2);
    }




        public static String FrequencyOfChars (String str) {
        String result =""; // contains the frequency of char
            String NonDub = Library.removeDublicates(str);
            for (int i=0;i<NonDub.length();i++) {
                String ch = "" + NonDub.charAt(i);
                int num = Library.frequncy_str2_in_str1(str, ch);
                //System.out.print(ch + num);
                result+=ch+num;

            }
            return result;

        }

}
