package step02;

import java.util.Scanner;

public class n_1330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        // 같은 코드, 삼항연산자 중첩
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
    }
}
