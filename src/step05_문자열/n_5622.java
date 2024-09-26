package step05_문자열;

import java.util.Scanner;

public class n_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 문자열
        String word = sc.next();

        // 최소 시간 초기화
        int totalTime = 0;

        // 각 문자에 대해 시간을 계산
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            // 다이얼의 규칙에 따라 시간 계산
            if (c >= 'A' && c <= 'C') {
                totalTime += 3;
            } else if (c >= 'D' && c <= 'F') {
                totalTime += 4;
            } else if (c >= 'G' && c <= 'I') {
                totalTime += 5;
            } else if (c >= 'J' && c <= 'L') {
                totalTime += 6;
            } else if (c >= 'M' && c <= 'O') {
                totalTime += 7;
            } else if (c >= 'P' && c <= 'S') {
                totalTime += 8;
            } else if (c >= 'T' && c <= 'V') {
                totalTime += 9;
            } else if (c >= 'W' && c <= 'Z') {
                totalTime += 10;
            }
        }

        System.out.println(totalTime);

        sc.close();
    }
}
