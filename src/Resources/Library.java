package Resources;

import java.util.Arrays;
import Resources.Library;

public class Library {


    //===================== DESCENDING ORDER ==========================
    public static int[] SortDescending2 (int[] arr) {
        Arrays.sort(arr);
        int[] RevArr = new int[arr.length]; // yeni olusturulacak olan ters dizi
        // KESINLIKLE ILK DIZI ILE AYNI OLCUDE OLMALI
        // SAKIN ARR.LENGTH-1 YAPMAAAAAAAA

        int count =0;
        for (int i=arr.length-1;i>=0;i--) {
            RevArr[count] = arr[i];
            count++;
        }
        return RevArr;

    }


    //================REVERSE STRING ================
    public static String Reverse2 (String str) {
        String Reverse="";

        for (int i=str.length()-1;i>=0;i--) {

            Reverse+= str.charAt(i);
        }

        return Reverse;
    }


    //===================REMOVE DUBLICATES ================
    public static String removeDublicates(String string) {

        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (result.contains("" + string.charAt(i))) {
                continue;
            }
            result += "" + string.charAt(i);
        }
        return result;
    }


    //==================== FREQUENCY OF STR2 IN STR1 ====================
    public static int frequncy_str2_in_str1 (String str1,String str2) {
        int count =0;
        while (str1.contains(str2)) {
            count++;
            str1=str1.replaceFirst(str2,"");

        }
        return count;
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
