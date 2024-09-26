package step06_심화1;
/*
그룹단어: a, abb
같은 문자가 떨어져서 나타나면 그룹단어 아님 : aba, abba
*/
import java.util.Scanner;

public class n_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 단어 개수
        int groupWordCount = 0;  // 그룹 단어 개수

        for (int i = 0; i < n; i++) {
            String word = sc.next(); // 단어 입력
            boolean[] seen = new boolean[26];  // 알파벳 등장 여부
            boolean isGroupWord = true;  // 그룹 단어 여부를 판단하는 변수

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j); // 현재문자

                if (j > 0 && currentChar != word.charAt(j - 1)) { // 현재 문자와 이전 문자가 다르면

                    if (seen[currentChar - 'a']) {
                        // 이미 등장했던 문자라면 그룹 단어가 아님
                        isGroupWord = false;
                        break;
                    }
                }
                seen[currentChar - 'a'] = true;  // 현재 문자를 본 문자로 표시
            }

            if (isGroupWord) {
                groupWordCount++;  // 그룹 단어이면 카운트를 증가
            }
        }

        System.out.println(groupWordCount);  // 그룹 단어 개수 출력
        sc.close();
    }
}
