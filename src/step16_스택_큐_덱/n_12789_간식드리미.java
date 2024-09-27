package step16_스택_큐_덱;

import java.util.Scanner;
import java.util.Stack;

public class n_12789_간식드리미 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); // 임시 공간으로 사용

        // 학생 수 입력
        int N = sc.nextInt();

        // 대기열 배열 입력 (앞에서부터 서 있는 학생들의 번호표)
        int[] students = new int[N];
        for (int i = 0; i < N; i++) {
            students[i] = sc.nextInt();
        }

        int current = 1; // 현재 간식을 받을 번호(처음은 1번 학생)
        int index = 0; // students 배열의 인덱스

        // 1. 대기열 학생 처리하기
        while (index < N) {
            // 대기열에서 바로 간식을 받을 수 있는 경우
            if (students[index] == current) {
                current++; // 간식 받을 번호 증가
                index++; // 다음 학생으로 이동
            }
            // 스택에서 간식을 받을 수 있는 경우
            // 스택의 맨 위 학생과 간식 받을 번호가 같을 때
            else if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop(); // 학생 꺼내고 간식줬으니까
                current++; // 간식 받을 번호 증가
            }
            // 바로 못받으면 학생을 스택으로 이동
            else {
                stack.push(students[index]); // 학생 스택에 넣고
                index++; // 다음 학생으로 이동
            }
        }

        // 2. 대기열 배열에서 모두 처리한 후 스택에 남은 학생들이 간식을 받을 수 있는지 확인
        while (!stack.isEmpty()) {
            // 스택의 맨 위 학생과 간식 받을 번호가 같을 때
            if (stack.peek() == current) {
                stack.pop(); // 학생 꺼내고 간식줌
                current++; // 간식 받을 번호 증가
            } else {
                // 순서대로 간식을 받을 수 없는 경우
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
