package step16_스택_큐_덱;
/*
시간초과
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n_18258_큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt(); // 명령 수
        for (int i = 0; i < N; i++) {
            String order = sc.next();

            switch (order) {
                case "push":
                    int x = sc.nextInt();
                    queue.offer(x);
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int back = 0;
                        for (int aa : queue) {
                            back = aa; // 마지막 요소를 계속 업데이트
                        }
                        System.out.println(back);
                    }
                    break;
            }
        }

        sc.close();
    }
}
