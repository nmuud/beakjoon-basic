package step06;
/*
입력 : 5
출력 :
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;

public class n_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 위쪽 절반 (1~N번째 줄)
        for (int i = 1; i <= N; i++) {

            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 절반 (N+1 ~ nN-1번째 줄)
        for (int i = N - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
