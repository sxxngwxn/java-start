package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

//         ;;는 while true와 같다
        for (int i = 1;;i++){
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크명 종료 : i = " + i + ", sum = " + sum);
                break;
            }
        }
    }
}
