package step06;

import java.util.Scanner;

public class n_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 알파벳을 하나의 문자로 치환
        for (String alphabet : croatiaAlphabets) {
            word = word.replace(alphabet, "*");
        }

        // 치환된 문자열의 길이 = 크로아티아 알파벳 수
        System.out.println(word.length());
    }
}
