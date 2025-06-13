import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] na = new int[N];
        for (int i = 0; i < na.length; i++) {
            na[i] = Integer.parseInt(st.nextToken());
        }

        int[] naSum = new int[N + 1];
        for (int i = 1; i < naSum.length; i++) {
            naSum[i] = naSum[i - 1] + na[i - 1];
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            sb.append(naSum[j] - naSum[i - 1]).append("\n");
        }

        System.out.println(sb);
    }
}
