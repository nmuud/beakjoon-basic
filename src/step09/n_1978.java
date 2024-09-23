package step09;

import java.util.Scanner;

public class n_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false; // 1은 소수가 아님
            } else {
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) { // 나누어 떨어지면 소수가 아님
                        isPrime = false;
                        break; // 소수가 아니면 더 이상 검사할 필요 없음
                    }
                }
            }

            if (isPrime) { // 소수일 경우 카운트 증가
                count++;
            }
        }
        System.out.println(count);
    }
}
