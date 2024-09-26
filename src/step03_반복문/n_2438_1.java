package step03_반복문;

import java.io.*;

public class n_2438_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // readLine() 을 사용할 경우 IOException 을 발생시킬 수 있어 throws 처리함
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n"); // 줄바꿈 bw.newLine()과 같음
            // bw.newLine() : 플랫폼에 맞는 줄바꿈을 처리해줌 (Windows 는 \r\n, 유닉스 계열은 \n)
        }

        // 버퍼에 남아있는 데이터를 모두 출력 (flush 는 반드시 호출해야 함)
        // 만약 flush()를 호출하지 않으면, 출력이 완료되지 않을 수 있음
        bw.flush();

        // 사용한 자원을 닫아줌 (I/O 자원은 반드시 close() 필요)
        br.close();
        bw.close();
    }
}
