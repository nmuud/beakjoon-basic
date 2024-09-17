package step05;

import java.util.Scanner;

public class n_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이후 로직에서 직접 사용하지는 않지만, 문제의 입력 형식에 맞추어 받는다
        int N = sc.nextInt();

        // 공백없이 주어진 숫자를 문자열로 입력받음
        String numbers = sc.next();

        int sum = 0;

        // 문자열의 각 문자를 숫자로 변환하여 합산
        for (int i = 0; i < numbers.length(); i++) {
            // 문자에서 '0' 을 빼면 해당 문자의 정수값이 됨
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);

        sc.close();
    }
}
