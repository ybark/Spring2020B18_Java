package OfficeHours.Practice_04_08_2020;

public class _02_ForLoop_Task {
    public static void main(String[] args) {
        /*
        print 0~100 all the number that can divisible 3 or 5
         */

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println("============REVERSE Name and Palandrome====================");
        //             12345 Lenght number
        String name = "Anna";
        //             01234 index number
        int lastIndex = name.length() - 1;
        String newName = "";

        for (int i = lastIndex; i >= 0; i--) {

            newName += name.charAt(i);

        }
        System.out.println(newName);
        if (name.equalsIgnoreCase(newName)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }

        System.out.println();
        System.out.println("==========SUBSTRING METHOD =========");

        String name2 = "ey edip adanada pide ye";
        String result = "";
        int lng = name2.length() - 1;
        for (int j = lng; j >= 0; j--) {
            result += name2.substring(j, j + 1);
        }
        if (!name2.equals("")) {
            System.out.println(result);
            if (name2.equalsIgnoreCase(result)) {
                System.out.println(name2 + " is palindrome");
            } else {
                System.out.println(name2 + " is not palindrome");
            }
        } else {
            System.out.println("name can not be empty");
        }
    }
}
