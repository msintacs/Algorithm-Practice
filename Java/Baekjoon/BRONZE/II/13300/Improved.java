import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Improved {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] count = new int[2][7]; // [성별][학년], genter: 0(여), 1(남), grade: 1~6

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            count[gender][grade]++;
        }

        int roomCnt = 0;
        for (int gender = 0; gender <= 1; gender++) {
            for (int grade = 1; grade <= 6; grade++) {
                int student = count[gender][grade];
                roomCnt += (student + K - 1) / K;
            }
        }

        System.out.println(roomCnt);
    }
}
