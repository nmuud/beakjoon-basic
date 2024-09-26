package step08_일반수학1;

import java.util.Scanner;

public class n_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        /*
        Integer.parseInt(N, B)
        문자열 N을 B진법 수로 해석하여, 10진법으로 변환해줌
        */
        int result = Integer.parseInt(N, B);


        System.out.println(result);

        sc.close();
    }
}
