package step16_스택_큐_덱;

import java.util.Scanner;
import java.util.Stack;

public class n_4949_균형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            // 종료 조건
            if (str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // 여는 괄호
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                }
                // 닫는 소괄호
                else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
                // 닫는 대괄호
                else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }

            // 스택이 비어있지 않으면 균형이 맞지 않음
            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            // 결과 출력
            if (isBalanced) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
