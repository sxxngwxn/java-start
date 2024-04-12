package scope;

public class Scope2 {
/*
* bad scope
* */
//    public static void main(String[] args) {
//        int m = 10; //m 생존 시작
//        int temp = 0;
//        if(m > 0){
//            temp = m * 2;
//            System.out.println("temp = " + temp);
//        }
//        System.out.println("m = " + m);
//    }

    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if(m > 0){
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

