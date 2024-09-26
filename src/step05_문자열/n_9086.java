package step05_문자열;

import java.util.Scanner;

public class n_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        sc.nextLine(); // 개행 문자 제거 (nextInt() 후에 nextLine()을 쓸 때 필요)

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine(); // 문자열 입력

            // 첫 글자와 마지막 글자를 추출하여 출력
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length() - 1);

            System.out.println(firstChar + "" + lastChar);

        }
        sc.close();
    }
}
