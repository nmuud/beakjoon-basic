package step05;

import java.util.Scanner;

public class n_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 T
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            // 반복 횟수 R
            int R = sc.nextInt();

            // 반복할 문자열
            String S = sc.next();

            // 각 문자를 R번 반복하여 출력
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println(); // 각 테스트 케이스가 끝날 때 줄 바꿈
        }

        sc.close();
    }
}
