package step05_문자열;

import java.util.Scanner;

public class n_2675_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 반복 횟수 입력
            String S = sc.next(); // 문자열 입력

            StringBuilder result = new StringBuilder(); // 결과를 담을 StringBuilder

            // 문자열 s의 각 문자를 R번씩 반복하여 새로운 문자열을 만듦
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j); // 문자열 S의 j번째 문자

                // 해당 문자를 R번 반복하여 결과에 추가
                for (int k = 0; k < R; k++) {
                    result.append(c);
                }
            }

            // 결과 출력
            System.out.println(result.toString());
        }
        sc.close();
    }
}
