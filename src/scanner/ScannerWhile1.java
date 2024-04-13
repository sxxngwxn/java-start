package scanner;

import java.util.Objects;
import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("값을 입력해주세요 (exit : 종료) : ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            } else {
                System.out.println("str = " + str);
            }
        }
        System.out.println("프로그램을 종료하였습니다.");
    }
}
