package casting;

public class Casting4 {
    public static void main(String[] args) {

        /**
         * 같은 타입이면 같은 타입에 결과가 나온다
         * 서로 다른 타입이면 더 큰 타입으로 자동형변환이 이루어진다
         */
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); //1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); //1.5

    }
}
