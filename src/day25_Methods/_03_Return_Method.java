package day25_Methods;

public class _03_Return_Method {


    public static void main(String[] args) {

        /*if(10>9) {      // 10 9 dan buyuk oldugundan return konutu ile main metoddan return yapip programdan cikti
            return;
        }
        System.out.println("hello World");

         */

        method1();
        System.out.println("hello Cybertek");

        method2();
        System.out.println("Hello Yucel");  // bu satira hic gelmez zira method2 de system.exit komutu ile programdan cikildi.

    }

    public static void method1() {
        if (10>9) {
            return;   // void ile geri dondurulebilir ancak deger yollayamazsin.sadece methoddan cikarsin
        }
        System.out.println("Hello Cybertek"); // bu satira hic gelmez zira return ile geri donderildi.
    }

    public static void method2() {
        if (10>9) {
            System.exit(0);   // void ile geri dondurulebilir ancak deger yollayamazsin.sadece methoddan cikarsin
        }
        System.out.println("Hello Cybertek"); // bu satira hic gelmez zira return ile geri donderildi.

    }
}
