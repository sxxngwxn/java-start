package method;

public class MethodCasting {
    public static void main(String[] args) {

        /**
         * 명시적 형변환 필요
         * 상위 타입일 경우 자동 형변환 가능
         */
        double num1 = 10.5;
        printNum((int)num1);
    }

    public static void printNum(int n){
        System.out.println("숫자 : " + n);
    }
}
