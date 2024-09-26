package step05_문자열;

import java.util.Scanner;

public class n_2908_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        // A 숫자 뒤집기
        String reversedA = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            reversedA += A.charAt(i);
        }

        // B 숫자 뒤집기
        String reversedB = "";
        for (int i = B.length() - 1; i >= 0; i--) {
            reversedB += B.charAt(i);

        }

        // 뒤집힌 문자열을 정수로 변환
        int intA = Integer.parseInt(reversedA);
        int intB = Integer.parseInt(reversedB);

        // 더 큰 수 출력
        if (intA > intB) {
            System.out.println(intA);
        } else {
            System.out.println(intB);
        }

        sc.close();
    }
}
