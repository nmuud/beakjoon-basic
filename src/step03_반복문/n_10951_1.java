package step03_반복문;

import java.io.*;

public class n_10951_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while ((str = br.readLine()) != null) {
            String[] input = str.split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bw.write((A + B) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
