package step04_1차원배열;

import java.util.Scanner;

public class n_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번부터 30번까지 번호를 기록할 배열(인덱스 0은 사용안함)
        boolean[] students = new boolean[31];

        // 제출한 학생의 번호를 입력받아 해당 번호를 true로 표시
        for (int i = 0; i < 28; i++) {
            int studentNumber = sc.nextInt();
            students[studentNumber] = true;
        }

        // 제출하지 않은 학생 찾기
        for (int i = 1; i <= 30; i++) {
            if (!students[i]) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
