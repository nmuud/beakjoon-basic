package step04;

import java.util.Scanner;

public class n_10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수의 개수 n 입력
        int n = sc.nextInt();

        // n개의 정수 배열 입력
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 찾으려는 정수 v 입력
        int v = sc.nextInt();

        // v의 개수 세기
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
