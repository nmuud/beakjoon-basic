package step09;

import java.util.Scanner;

public class n_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            int sum = 0; // 약수의 합을 저장할 변수
            int[] divisors = new int[n]; // 약수를 저장할 배열
            int index = 0; // 약수를 저장할 배열의 인덱스

            // 1부터 n/2까지의 숫자를 탐색하여 약수 구하기
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i; // 약수의 합에 더하기
                    divisors[index++] = i; // 약수를 배열에 저장
                }
            }

            // 완전수 여부 확인 및 출력
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < index; i++) {
                    if (i > 0) {
                        System.out.print(" + ");
                    }
                    System.out.print(divisors[i]);
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}
