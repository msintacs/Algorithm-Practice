import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchCnt = Integer.parseInt(br.readLine());
        int state[] = new int[switchCnt];

        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < switchCnt; i++) {
            state[i] = Integer.parseInt(tokens[i]);
        }

        int studentCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < studentCnt; i++) {
            String[] info = br.readLine().split(" ");
            int gender = Integer.parseInt(info[0]);
            int number = Integer.parseInt(info[1]);

            if (gender == 1) {
                for (int j = number - 1; j < state.length; j += number) {
                    state[j] ^= 1;
                }
            } else {
                int center = number - 1;
                int left = center - 1;
                int right = center + 1;

                state[center] ^= 1;

                while (left >= 0 && right < state.length && state[left] == state[right]) {
                    state[left--] ^= 1;
                    state[right++] ^= 1;
                }
            }
        }

        for (int i = 0; i < state.length; i++) {
            System.out.print(state[i] + " ");
            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }
}
