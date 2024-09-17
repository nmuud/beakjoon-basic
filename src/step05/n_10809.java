package step05;

import java.util.Scanner;

public class n_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int[] alpha = new int[26];

        // 배열을 -1로 초기화
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        // 문자열에서 각 알파벳의 첫 등장 위치 저장
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int idx = c - 'a';  // 'a'는 0, 'b'는 1 ... 'z'는 25가 되도록 변환

            // 해당 알파벳이 처음 등장한 경우에만 위치를 저장
            if (alpha[idx] == -1) {
                alpha[idx] = i; // 첫 등장 위치를 기록
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }

        sc.close();
    }
}
