package step09;

import java.util.Scanner;

public class n_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 2부터 시작해서 N을 나눌 수 있는 소수로 계속 나눔
        for (int i = 2; i * i<= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        if (N > 1) {
            System.out.println(N);
        }
    }
}
