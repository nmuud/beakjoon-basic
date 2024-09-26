package step02_조건문;

import java.util.Scanner;

public class n_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int price;


        // 1. 모든 주사위의 눈이 같을 때
        if (A == B && B == C) {
            price = 10000 + A * 1000;
        }
        // 2. 두 개의 주사위 눈이 같을 때
        else if (A == B || A == C) {
            price = 1000 + A * 100;
        } else if (B == C) {
            price = 1000 + B * 100;
        }
        // 3. 셋다 다른 눈이 나올 때
        else {
            price = Math.max(A, Math.max(B, C)) * 100;
        }

        System.out.println(price);

        sc.close();
    }
}
