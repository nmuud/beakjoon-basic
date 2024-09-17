package step05;

import java.util.Scanner;

public class n_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim(); // 앞뒤 공백 제거

        // 입력이 빈 문자열일 경우 처리
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = str.split("\\s+"); // 하나 이상의 공ㅂ개을 기준으로 나눈다
            System.out.println(words.length); // 단어 개수 출력
        }

        sc.close();
    }
}
