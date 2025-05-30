import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void manExec(int number, int[] state) {
        for (int i = 0; i < state.length; i++) {
            if ((i + 1) % number == 0) {
                if (state[i] == 1)
                    state[i] = 0;
                else
                    state[i] = 1;
            }
        }
    }

    static void womanExec(int number, int[] stats) {
        int center = number - 1;
        int prev = center - 1;
        int next = center + 1;
        int end = stats.length - 1;

        if (stats[center] == 0)
            stats[center] = 1;
        else
            stats[center] = 0;

        while (prev >= 0 && next <= end && stats[prev] == stats[next]) {
            if (stats[prev] == 0) {
                stats[prev] = 1;
                stats[next] = 1;
            } else {
                stats[prev] = 0;
                stats[next] = 0;
            }

            prev--;
            next++;
        }
    }

    public static void main(String[] args) throws IOException {

        // 1=ON 0=OFF

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int switchCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] state = new int[switchCnt];

        for (int i = 0; i < switchCnt; i++) {
            state[i] = Integer.parseInt(st.nextToken());
        }

        int studentCnt = Integer.parseInt(br.readLine());

        // man=1 woman=2
        for (int i = 0; i < studentCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1)
                manExec(number, state);
            else
                womanExec(number, state);
        }

        for (int i = 0; i < state.length; i++) {
            if (i != 0 && i % 20 == 0) {
                System.out.println();
            }

            System.out.print(state[i] + " ");
        }
    }
}
