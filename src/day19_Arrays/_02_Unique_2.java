package day19_Arrays;

public class _02_Unique_2 {
    public static void main(String[] args) {

        String str = "AZBAZBCDERTYQA";
        String result ="";  // tek olan harflaeri tutacak olan degisken

        for (int j=0;j<=str.length()-1;j++) {
            int count = 0; // str icerisindeki harflerin kac tane oldugunu kontrol edecek

            char ch2 = str.charAt(j);
            for (int i = 0; i <= str.length() - 1; i++) {
                char ch = str.charAt(i);
                if (ch == ch2) {
                    count++;
                }
            }
            if (count == 1) {
                result +=ch2;
            }



        }

        System.out.println(result);
    }
}
