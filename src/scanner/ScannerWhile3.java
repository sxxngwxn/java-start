package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.print("점수를 입력 해주세요 (총점 검사 : 0) : ");
            int intValue = scanner.nextInt();
            if(intValue == 0){
                break;
            } else {
                sum += intValue;
            }
        }
        System.out.println("총점은 : " + sum);
    }
}
