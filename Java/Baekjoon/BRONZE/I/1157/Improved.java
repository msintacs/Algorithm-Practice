import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        int[] count = new int[26];

        for (char c : input.toCharArray()) {
            count[c - 'A']++;
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
