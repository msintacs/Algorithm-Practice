import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean Matched(char[] input, char[] target, boolean isPrefix) {

        boolean isMatched = false;
        int inputSize = input.length;

        if (isPrefix) {
            for (int i = 0; i < target.length; i++) {
                if (input[i] != target[i]) {
                    isMatched = false;
                    break;
                }

                isMatched = true;
            }
        } else {
            int targetSize = target.length;
            int nLoop = 0;

            for (int i = inputSize - targetSize; i < inputSize; i++) {
                if (input[i] != target[nLoop]) {
                    isMatched = false;
                    break;
                }

                nLoop++;
                isMatched = true;
            }
        }

        return isMatched;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] pattern = br.readLine().split("\\*");

        char[] prefix = pattern[0].toCharArray();
        char[] suffix = pattern[1].toCharArray();

        StringBuilder sb = new StringBuilder();
        boolean[] isMatched = new boolean[2];
        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();

            if (input.length < prefix.length + suffix.length) {
                sb.append("NE").append("\n");
                continue;
            }

            isMatched[0] = Matched(input, prefix, true);
            isMatched[1] = Matched(input, suffix, false);

            if (isMatched[0] && isMatched[1]) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb);
    }
}
