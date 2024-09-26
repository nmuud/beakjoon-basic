package step05_문자열;

import java.util.Scanner;

public class n_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어 s 입력받기
        String s = sc.next();

        // 정수 n 입력받기
        int n = sc.nextInt();

        // 단어 s 의 n 번째 글자 출력
        // charAt(int index) : 0부터 시작
        System.out.println(s.charAt(n - 1));

        sc.close();
    }
}
