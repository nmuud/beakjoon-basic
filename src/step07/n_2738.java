package step07;

import java.util.Scanner;

public class n_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 행의 수
        int M = sc.nextInt(); // 열의 수

        // 두 개의 행렬 A와 B를 선언 및 입력 받기
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 행렬 A 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 행렬 B 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 두 행렬의 합을 계산하고 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
