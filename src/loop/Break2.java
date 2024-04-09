package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

//         ;;는 while true와 같다
        for (;;){
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크명 종료 : i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
