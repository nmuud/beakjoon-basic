package step09_약수배수소수;

import java.util.Scanner;

public class n_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            if (first == 0 && second == 0) {
                break;
            }

            // 약수(factor) 판단
            if (second % first == 0) {
                System.out.println("factor");
            }
            // 배수(multiple) 판단
            else if (first % second == 0) {
                System.out.println("multiple");
            }
            // 둘 다 아닌 경우
            else {
                System.out.println("neither");
            }
        }

        sc.close();
    }
}
