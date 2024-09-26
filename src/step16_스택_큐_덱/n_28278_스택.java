package step16_스택_큐_덱;

import java.util.Scanner;
import java.util.Stack;

public class n_28278_스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 출력 최적화를 위해 사용
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt(); // 명령의 수
        for (int i = 0; i < N; i++) {
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
        sc.close();
    }
}
