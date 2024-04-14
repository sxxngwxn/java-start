package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1 : " + add(3, 5));
        System.out.println("2 : " + add(3, 5, 8));
    }

    /**
     * 같은 이름 파라미터 개수 다르게
     */
    public static int add(int a, int b) {
        System.out.println("call 1");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("call 2");
        return a + b + c;
    }

    /**
     *파라미터 순서 다르게
     */
    public static double add(double a, int b){
        System.out.println("d-i");
        return a + b;
    }

    public static double add(int a, double b){
        System.out.println("i-d");
        return a + b;
    }

    /**
     * 인수로 int를 넣어도 자동 형변환
     */
    public static double add(double a, double b){
        System.out.println("d-d");
        return a + b;
    }
}
