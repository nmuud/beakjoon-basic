package step16_스택_큐_덱;

import java.util.*;

public class n_11866_요세푸스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        int N = sc.nextInt(); // 인원
        int K = sc.nextInt(); // K번째 사람

        // 인원 배열 만들기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            arr.add(queue.poll()); // K번째 사람을 제거하고 arr 에 추가
        }
        arr.add(queue.poll()); // 마지막 남은 사람 추가

        // 출력형식 맞추기
        System.out.print("<");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1) {   // 마지막에는 쉼표 추가 안함
                System.out.print(", ");
            }
        }
        System.out.println(">");
        sc.close();
    }
}
