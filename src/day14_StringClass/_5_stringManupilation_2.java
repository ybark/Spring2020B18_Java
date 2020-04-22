package day14_StringClass;

public class _5_stringManupilation_2 {
    public static void main(String[] args) {

        String str =" ";
        boolean  bool1 = str.isEmpty();

        System.out.println(bool1);

        String s1= "Cat";
        String s2= new String("Cat");

        System.out.println(s1==s2);
        System.out.println( s1.equals(s2));

        //===================

        String z1="Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";
        String z4 = "tiger";

        System.out.println(z1==z2);
        System.out.println(z2==z3);
        System.out.println(z1==z3);

        //==========
        System.out.println(z1.equals(z2));
        System.out.println(z2.equals(z3));
        System.out.println(z1.equals(z3));
        System.out.println(z4.equals(z3));

        /*
        userName : cybertek
        PassWord : cybertekschool
         */





    }
}
