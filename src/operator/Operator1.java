package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println("sum = " + (a + b));
        System.out.println("diff = " + (a - b));
        System.out.println("multi = " + (a * b));
        System.out.println("div = " + (a / b));
        System.out.println("mod = " + (a % b));

//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        int z = 10 /0;
    }
}
