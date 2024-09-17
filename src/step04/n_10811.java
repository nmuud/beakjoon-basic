package step04;

import java.util.Scanner;

public class n_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 1번부터 N 번까지 바구니 세팅 [1, 2, 3, 4, 5]
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // M 번만큼 바구니 순서를 역순으로 변경
        for (int i = 0; i < M; i++) {
            int aa = sc.nextInt() - 1; // 시작인덱스 (0 기반으로 맞추기 위해 -1)
            int bb = sc.nextInt() - 1; // 끝 인덱스

            // aa 부터 bb 까지의 범위를 역순으로 바꾸기
            while (aa < bb) {
                // aa 번째와 bb 번째 요소를 교환
                int tmp = baskets[aa];
                baskets[aa] = baskets[bb];
                baskets[bb] = tmp;
                aa++;
                bb--;
            }
        }

        // 결과 출력
        for (int num : baskets) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
