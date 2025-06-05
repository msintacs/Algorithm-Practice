import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();

        // 0~9 > 6은 9로사용가능 9는 6으로 사용가능
        int[] count = new int[10];

        for (int i = 0; i < N.length; i++) {
            int parse = N[i] - '0';
            count[parse]++;
        }

        int amount = 0;
        for (int i = 0; i < count.length; i++) {

            int value = count[i];

            if (i == 6 || i == 9) {
                value = (count[6] + count[9] + 1) / 2;
            }

            if (value > amount) {
                amount = value;
            }
        }

        System.out.println(amount);
    }
}
