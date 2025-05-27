import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int N = Integer.parseInt(br.readLine());
            boolean bNumArray[] = new boolean[2_000_001];

            for (int i = 0; i < N; i++) {
                int nInput = Integer.parseInt(br.readLine());

                bNumArray[nInput + 1_000_000] = true;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < bNumArray.length; i++) {
                if (bNumArray[i]) {
                    sb.append(i - 1_000_000).append("\n");
                }
            }

            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
