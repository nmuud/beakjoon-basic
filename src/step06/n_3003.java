package step06;

import java.util.Scanner;

public class n_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 올바른 체스 세트의 피스 개수
        int[] correctPieces = {1, 1, 2, 2, 2, 8};

        // 현재 발견된 피스 개수 입력받기
        int[] currentPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            currentPieces[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            // 올바른 개수에서 현재 개수를 빼서 몇 개가 더 필요한지 계산
            System.out.print((correctPieces[i] - currentPieces[i]) + " ");
        }

        sc.close();
    }
}
