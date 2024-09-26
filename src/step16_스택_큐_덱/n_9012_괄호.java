package step16_스택_큐_덱;

import java.util.Scanner;
import java.util.Stack;

public class n_9012_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            Stack<Character> stack = new Stack<>();
            String answer = "YES";

            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.isEmpty()) {
                answer = "NO";
            }
            System.out.println(answer);
        }

        sc.close();
    }
}
