package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번째 학생의 점수 : " + students[i]);
        }
    }
}
