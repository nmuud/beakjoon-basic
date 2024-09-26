package step06_심화1;

import java.util.Scanner;

public class n_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toUpperCase();

        // 알파벳 빈도수를 저장할 배열 (A ~ Z 26개)
        int[] frequency = new int[26];

        // 각 문자의 빈도수 계산
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            frequency[ch - 'A']++;
        }

        // 가장 많이 사용된 알파벳 찾기
        int maxFreq = -1; // 최대 빈도수
        char maxChar = '?'; // 최대 빈도수 알파벳

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                maxChar = (char) (i + 'A');
            } else if (frequency[i] == maxFreq) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
        sc.close();
    }
}
