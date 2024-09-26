package step06_심화1;

import java.util.Scanner;

public class n_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.next(); // 입력 단어 받기

        char[] ch = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;
        int answer = 1; // 초기값을 1로 설정

        while (lt < rt) {
            if (ch[lt] != ch[rt]) {
                answer = 0;
                break;
            }
            lt++;
            rt--;
        }

        System.out.println(answer);
        sc.close();
    }
}
