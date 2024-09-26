package step02_조건문;
/* 조건문 없이 풀이 */
import java.util.Scanner;

public class n_2525_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각과 요리 시간 입력 받기
        int H = sc.nextInt(); // 시
        int M = sc.nextInt(); // 분
        int C = sc.nextInt(); // 요리 시간 (분)

        // 모든 시간을 분 단위로 변환
        int min = H * 60 + M + C;

        // 시와 분으로 다시 변환
        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);

        sc.close();
    }
}
