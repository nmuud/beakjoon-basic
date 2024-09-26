package step02_조건문;

import java.util.Scanner;

public class n_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (90 <= n) {
            System.out.println("A");
        } else if (80 <= n) {
            System.out.println("B");
        } else if (70 <= n) {
            System.out.println("C");
        } else if (60 <= n) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 삼항연산자 사용
        System.out.println((90 <= n) ? "A" : (80 <= n) ? "B" : (70 <= n) ? "C" : (60 <= n) ? "D" : "F");
    }
}
