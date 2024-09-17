package step04;

import java.util.Scanner;

public class n_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] remainder = new int[42]; // 나머지 값을 저장할 배열
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int mod = num % 42; // 입력된 숫자를 42로 나눈 나머지를 구함
            remainder[mod]++; // 나머지 값에 해당하는 배열 인덱스를 증가
        }

        for (int i = 0; i < 42; i++) {
            if (remainder[i] > 0) { // 나머지 값이 나온 적이 있으면
                count++; // 그 나머지는 서로 다른 값으로 카운트
            }
        }

        System.out.println(count);

        sc.close();
    }
}
