package step16_스택_큐_덱;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class n_28279_덱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int order = sc.nextInt();

            switch (order) {

                case 1:  // 정수 x를 덱의 앞에 넣는다
                    int front = sc.nextInt();
                    deque.addFirst(front);
                    break;

                case 2:  // 정수 x를 덱의 뒤에 넣는다
                    int back = sc.nextInt();
                    deque.addLast(back);
                    break;

                case 3:  // 덱에 정수가 있으면 맨 앞의 정수를 빼고 출력. 없으면 -1 출력
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;

                case 4:  // 덱에 정수가 있으면 맨 뒤의 정수를 빼고 출력. 없으면 -1 출력
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;

                case 5:  // 덱에 들어있는 정수의 개수 출력
                    sb.append(deque.size()).append("\n");
                    break;

                case 6:  // 덱이 비어있으면 1, 아니면 0출력
                    if (deque.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;

                case 7:  // 덱에 정수가 있으면 맨 앞의 정수를 출력. 없으면 -1출력
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;

                case 8:  // 덱에 정수가 있으면 맨 뒤의 정수를 출력. 없으면 -1출력
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
