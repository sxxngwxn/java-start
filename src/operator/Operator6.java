package operator;

public class Operator6 {
    public static void main(String[] args) {

        // 문자열 비교는 == 말고 .equals

        String str1 = "hello1", str2 = "hello2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("hello1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); //문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
