package step02;

import java.util.Scanner;

public class n_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        // M + C가 60보다 크면 시(H)에 더해줄 시간 계산
        if (M + C >= 60) {
            H = H + (M + C) / 60;  // 시에 더해질 시간
            M = (M + C) % 60;      // 분에 남은 시간
        } else {
            M = M + C;             // 60분이 넘지 않으면 분만 더함
        }

        // 24시간을 초과할 경우 처리
        if (H >= 24) {
            H = H % 24;
        }

        System.out.println(H + " " + M);
        sc.close();
    }
}
