package step05_문자열;
/*
StringBuilder 를 사용해 문자열 뒤집기
*/
import java.util.Scanner;

public class n_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 숫자 입력받기
        String A = sc.next();
        String B = sc.next();

        // 문자열 뒤집기
        int reversedA = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(B).reverse().toString());

        // 더 큰 수 출력
        if (reversedA > reversedB) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }

        sc.close();
    }
}
