package method;

public class Method1 {
    public static void main(String[] args) {
        checkAge(20);
    }

    public static void checkAge(int age){
        if(age < 18){
            System.out.println(age + "살, 미성년자는 출입 불가능합니다.");
        } else {
            System.out.println(age + "살, 성인 출입 가능합니다.");
        }
    }
}
