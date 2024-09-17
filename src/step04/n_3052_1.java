package step04;

import java.util.HashSet;
import java.util.Scanner;

public class n_3052_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainderSet = new HashSet<>(); // 나머지를 저장할 HashSet

        // 10개의 숫자 입력
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            remainderSet.add(num % 42); // 42로 나눈 나머지를 HashSet 에 추가
        }

        // 서로 다른 나머지 개수 출력
        System.out.println(remainderSet.size());

        sc.close();
    }
}
