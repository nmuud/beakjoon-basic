package step04_1차원배열;

import java.util.Scanner;

public class n_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
