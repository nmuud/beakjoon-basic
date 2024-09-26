package step16_스택_큐_덱;

import java.util.Scanner;
import java.util.Stack;

public class n_10773_제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        // 스택에 남아있는 숫자들의 합 계산하기
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
        sc.close();
    }
}
