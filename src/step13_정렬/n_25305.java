package step13_정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class n_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 응시자 수
        int k = sc.nextInt(); // 커트라인 등수

        // 내림차순 정렬을 위해 Integer 타입 배열 사용 (Collections.reverseOrder() 적용)
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. 내림차순 정렬: [100, 98, 93, 85, 76]
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k - 1]);

        // 2. 오름차순 정렬: [76, 85, 93, 98, 100]
        Arrays.sort(arr);
        System.out.println(arr[N - k]);

        sc.close();
    }
}
