package step04;

import java.util.Scanner;

public class n_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N개의 바구니와 M번의 작업
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니 번호를 저장할 배열 (1번부터 N 번까지 사용)
        int[] baskets = new int[N];

        // M번의 공 넣기 작업
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 시작 바구니
            int j = sc.nextInt(); // 끝 바구니
            int k = sc.nextInt(); // 공 번호

            // i 번부터 j 번 바구니까지 k 번 번호의 공을 넣는다
            for (int b = i -1; b < j; b++) { // 1-based -> 0-based 인덱스
                baskets[b] = k;
            }
        }

        // 결과 출력 (각 바구니에 있는 공 번호 출력)
        for (int b = 0; b < N; b++) {
            System.out.print(baskets[b] + " ");
        }

        sc.close();
    }
}
