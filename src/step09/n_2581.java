package step09;

import java.util.Scanner;

public class n_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // 시작 값
        int N = sc.nextInt(); // 끝 값

        // 소수 여부를 저장할 배열, true 면 소수
        boolean[] isPrime = new boolean[N + 1];

        // 모든 수를 일단 소수로 가정
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int min = -1;

        // M부터 N까지 소수를 찾고 합과 최솟값을 구함
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                sum += i;
                if (min == -1) {
                    min = i;
                }
            }
        }

        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}
