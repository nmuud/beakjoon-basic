package step07_2차원배열;
/*
문제 : 9*9 격자에서(100보다작은자연수)
첫째줄: 최댓값
둘째줄: 그 최댓값이 위치한 행과 열

*/

import java.util.Scanner;

public class n_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[9][9]; // 9*9 격자 선언

        // 최댓값 저장할 변수(어떤 입력값보다 작게 설정)
        int max = -1;

        // 최댓값의 행과 열 위치를 저장할 변수
        int row = 0;
        int col = 0;

        // 9*9 배열 입력 받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = sc.nextInt(); // 숫자 입력 받기

                // 최댓값 찾기: 만약 현재 위치의 값이 max 보다 크면
                if (grid[i][j] > max) {
                    max = grid[i][j]; // 최댓값 갱신
                    row = i + 1;// 행 위치 저장 (배열의 인덱스가 0부터 시작하므로 +1)
                    col = j + 1;// 열 위치 저장
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);

        sc.close();
    }
}
