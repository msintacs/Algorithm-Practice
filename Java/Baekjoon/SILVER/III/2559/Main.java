import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] na = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            na[i] = Integer.parseInt(st.nextToken());
        }

        int[] naSum = new int[N + 1];
        for (int i = 1; i < naSum.length; i++) {
            naSum[i] = naSum[i - 1] + na[i - 1];
        }

        int i = 1;
        int j = K;
        int max = Integer.MIN_VALUE;

        while (j <= N) {

            int sum = naSum[j] - naSum[i - 1];

            if (sum > max) {
                max = sum;
            }

            i++;
            j++;
        }

        System.out.println(max);
    }
}
