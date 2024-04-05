package operator;

public class Operator4 {
    public static void main(String[] args) {

        /*
        * 전위 연산자 (값을 먼저 증가시키고, 그 결과를 b에 대입)
        * */
        int a = 1, b = 0;

        b = ++a;

        a = a + 1;
        b = a;

        System.out.println("a = " + a + ", b = " + b);

        /*
         * 후위 연산자 (a의 현재 값을 b에 대입, 그 후 값을 증가시키고)
         * */
        a = 1;
        b = 0;

        b = a++;

        b = a;
        a = a + 1;

        System.out.println("a = " + a + ", b = " + b);
    }
}
