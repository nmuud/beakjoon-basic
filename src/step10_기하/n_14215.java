package step10_기하;

import java.util.Arrays;
import java.util.Scanner;

public class n_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sides = new int[3];
        sides[0] = sc.nextInt();
        sides[1] = sc.nextInt();
        sides[2] = sc.nextInt();

        // 오름차순 정렬
        Arrays.sort(sides);

        // 삼각형 조건을 만족하지 않으면, 가장 긴 변을 나머지 두합의 합 -1로 만듦
        if (sides[2] >= sides[0] + sides[1]) {
            sides[2] = sides[0] + sides[1] - 1;
        }

        // 최대로 만들 수 있는 삼각형의 둘레를 출력
        int answer = sides[0] + sides[1] + sides[2];
        System.out.println(answer);

        sc.close();
    }
}
