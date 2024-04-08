package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급 받은 쿠폰은 " + coupon +"원 입니다.");
    }
}
