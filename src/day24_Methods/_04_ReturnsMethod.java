package day24_Methods;






public class _04_ReturnsMethod {

    public static void main(String[] args) {

        int result = addition(10,30);
        int result2=result+30;
        System.out.println(result2);
    }
//                Void yerine INT yazinca retur yapip main clasa yollayinca return deki degeri geri yollamis oluyoruz
    public static int addition (int a, int b  ) {

        System.out.println( a+b);

        int result = a+b;

       return result;


    }
    }



