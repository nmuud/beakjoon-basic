package step02_조건문;

import java.util.Scanner;

public class n_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            H = H - 1; // 한 시간 감소
            M = M + 15; // 분 조정 (60 - 45 = 15)

            // H가 음수면 23시로 변경
            if (H < 0) {
                H = 23;
            }
        } else {
            M = M - 45;
        }

        System.out.println(H + " " + M);

        sc.close();
    }
}
