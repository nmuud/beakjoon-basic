package step04_1차원배열;

import java.util.Scanner;

public class n_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니 개수, M: 교환 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니 세팅
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;  // 1번 바구니에 1, 2번 바구니에 2...
        }

        // M번의 교환 작업
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
