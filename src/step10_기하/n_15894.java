package step10_기하;

import java.util.Scanner;

public class n_15894 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n의 입력범위는 1 <= n <= 10^9 이므로 long 타입 사용
        long n = sc.nextLong();
        System.out.println(n * 4);
    }
}
