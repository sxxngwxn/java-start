package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("첫값을 입력해주세요 (0 : 종료) : ");
            int num1 = scanner.nextInt();

            System.out.print("둘째값을 입력해주세요 (0 : 종료) : ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            } else {
                System.out.println("두 값의 합은 = " + (num1 + num2));
            }
        }
        System.out.println("프로그램을 종료하였습니다.");
    }
}
