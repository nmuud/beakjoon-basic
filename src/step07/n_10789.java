package step07;

import java.util.Scanner;

public class n_10789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5개의 문자열 입력을 저장할 배열
        String[] words = new String[5];

        // 각 단어 입력받기
        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }

        // 결과를 저장할 빈 문자열
        String result = "";

        // 최대 길이 15까지 세로로 읽기
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                // 각 단어의 i번째 문자가 존재하면 추가
                if (i < words[j].length()) {
                    result += words[j].charAt(i);
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}
