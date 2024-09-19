package step07;
/*
문제:
정사각형 모양의 흰색 도화지 100*100 위에 색종이 n장을 붙인후, 색종이 영역의 넓이를 구하는 문제
첫째 줄에 색종이의 수 n 이 주어짐 (색종이의 크기는 10*10)
둘째 줄부터: 한줄에 하나씩 색종이를 붙인 위치가 주어진다 (x, y)
*/

import java.util.Scanner;

public class n_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 도화지 크기 100*100
        boolean[][] paper = new boolean[100][100];
        int n = sc.nextInt(); // 색종이의 수

        // 색종이 붙이기
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이 거리
            int y = sc.nextInt(); // 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이 거리

            // 색종이의 크기는 10*10, 해당 영역을 true 로 표시
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true; // 색종이가 덮인 영역 표시
                }
            }
        }

        // 검은 영역의 넓이 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);

        sc.close();
    }
}
