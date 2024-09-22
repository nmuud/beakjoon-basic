package step09;

import java.util.Scanner;

public class n_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N 값
        int K = sc.nextInt(); // K 번째로 작은 약수

        int cnt = 0; // 약수의 개수를 셀 변수

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt++;
                if (cnt == K) {
                    System.out.println(i);
                    return;
                }
            }
        }

        // K번째 약수가 존재하지 않으면 0 출력
        System.out.println(0);
        sc.close();
    }
}
