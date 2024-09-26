package step04_1차원배열;

import java.util.Scanner;

public class n_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        // 최댓값 및 인덱스의 변수 초기화
        int max = 0;
        int index = 0;

        // 배열에 값을 입력받고 동시에 최댓값을 찾기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            // 최댓값 갱신 및 인덱스 저장
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);

        // 인덱스는 1부터 시작해야 하므로 +1 처리
        System.out.println(index + 1);

        sc.close();
    }
}
