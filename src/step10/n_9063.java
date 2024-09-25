package step10;

import java.util.Scanner;

public class n_9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        if (n == 1) {
            System.out.println(0);
        } else {
            // 넓이 계산
            int width = maxX - minX;
            int height = maxY - minY;
            System.out.println(width * height);
        }

        sc.close();
    }
}
