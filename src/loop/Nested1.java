package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            System.out.println("i start: " + i);

            for (int j = 0; j < 3; j++) {
                System.out.println("i - j : " + i + "-" + j);
            }

            System.out.println("i done : " + i);
            System.out.println();
        }
    }
}

