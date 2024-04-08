package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 10; //사용자의 나이
        int price = 10000;
        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 가격 할인이 되었습니다.");
        }

        if(age <= 10){
            discount += 1000;
            System.out.println("10세 이하 가격 할인이 되었습니다.");
        }

        System.out.println(discount + "원 가격 할인 되었습니다.");
    }
}
