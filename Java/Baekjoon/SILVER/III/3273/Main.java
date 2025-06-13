import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] na = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            na[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        Arrays.sort(na);

        int left = 0;
        int right = N - 1;
        int count = 0;

        while (left < right) {

            int sum = na[left] + na[right];

            if (sum == X) {
                count++;
                left++;
                right--;
            } else if (sum < X) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);
    }
}
