package step04_1차원배열;

import java.util.Scanner;

public class n_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int N = sc.nextInt(); // 과목 수
        double[] scores = new double[N]; // 성적 배열
        double maxScore = 0; // 최댓값 저장 변수

        // 점수 입력과 동시에 최댓값 찾기
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        // 점수 변환과 변환된 점수의 합 구하기
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = (scores[i] / maxScore) * 100;
            sum += scores[i];
        }

        // 새로운 평균 계산
        double newAverage = sum / N;

        // 결과 출력
        System.out.println(newAverage);

        sc.close();
    }
}
