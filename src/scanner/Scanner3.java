package scanner;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first num : ");
        int num1 = scanner.nextInt();

        System.out.print("second num : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 값은 : " + num1);
        } else if (num1 < num2) {
            System.out.println("더 큰 값은 : " + num2);
        } else {
            System.out.println("두 값은 같습니다.");
        }
    }
}
