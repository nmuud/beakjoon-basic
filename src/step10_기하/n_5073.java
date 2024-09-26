package step10_기하;

import java.util.Scanner;

public class n_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 삼각형 조건: 가장 긴 변 <= 나머지 두 변의 합
            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;

            // 삼각형 성립 조건을 만족하지 않으면 Invalid
            if (sum - max <= max) {
                System.out.println("Invalid");
            } else {
                // 세 변의 길이가 모두 같은 경우
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                }
                // 두 변의 길이만 같은 경우
                else if (a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                }
                // 세 변의 길이가 모두 다른 경우
                else {
                    System.out.println("Scalene");
                }
            }
        }

        sc.close();
    }
}
