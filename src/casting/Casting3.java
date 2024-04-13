package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long overIntValue = 2147483648L;

        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxintValue = " + intValue); //ㄱㅊㄱㅊ

        intValue = (int) overIntValue;
        System.out.println("overintValue = " + intValue); //오버플로우
    }
}
