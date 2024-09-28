package step13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class n_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        int answer = sum / 5;

        Arrays.sort(arr);
        int mid = arr.length / 2;


        System.out.println(answer);
        System.out.println(arr[mid]);

        sc.close();
    }
}
