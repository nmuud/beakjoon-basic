package step03_반복문;

import java.util.Scanner;

public class n_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }

        sc.close();
    }
}
