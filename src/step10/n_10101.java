package step10;

import java.util.Scanner;

public class n_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 세 각의 합 계산
        int sum = a + b + c;


        if (sum != 180) {
            System.out.println("Error");
        } else {
            if (a == 60 && b == 60 && c == 60) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        sc.close();
    }
}
