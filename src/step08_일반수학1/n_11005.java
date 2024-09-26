package step08_일반수학1;

import java.util.Scanner;

public class n_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder result = new StringBuilder();

        // N을 B진법으로 변환
        while (N > 0) {
            int remainder = N % B; // N을 B로 나눈 나머지

            if (remainder >= 10) {
                // 나머지가 10 이상이면 A~Z로 변환 (A는 10이므로 55를 더해준다)
                result.append((char) (remainder - 10 + 'A'));
            } else {
                // 나머지가 10 미만이면 그대로 숫자로 저장
                result.append(remainder);
            }

            N /= B; // N을 B로 나눈 몫으로 갱신
        }

        // 결과는 역순이므로, 거꾸로 출력해야함
        System.out.println(result.reverse().toString());

        sc.close();
    }
}
