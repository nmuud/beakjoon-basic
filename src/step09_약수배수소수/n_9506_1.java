package step09_약수배수소수;

import java.util.Scanner;

public class n_9506_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            int sum = 0; // 약수의 합을 저장할 변수
            StringBuilder divisors = new StringBuilder();

            // 1부터 n/2까지의 숫자를 탐색해 약수 구하기
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) { // i가 n의 약수면
                    sum += i; // 약수의 합에 더하기
                    if (divisors.length() > 0) {
                        divisors.append(" + ");
                    }
                    divisors.append(i); // 약수를 StringBuilder 에 추가
                }
            }

            // 완전수 여부 확인 및 출력
            if (sum == n) {
                System.out.println(n + " = " + divisors.toString()); // 약수들 출력
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}
