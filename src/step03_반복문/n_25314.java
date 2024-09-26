package step03_반복문;

import java.util.Scanner;

public class n_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = N/4;
        for (int i = 1; i < a; i++) {
            System.out.print("long ");
        }

        System.out.println("long int");

        sc.close();
    }
}
