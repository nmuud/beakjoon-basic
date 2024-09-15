package step03;
/*
더 빠른 입출력을 위해
BufferedReader 와 BufferedWriter 사용
*/
import java.io.*;

public class n_11021_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int sum = A + B;

            bw.write("Case #" + i + ": " + sum + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
