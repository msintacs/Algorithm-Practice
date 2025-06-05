import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'c' && i + 1 < input.length()) {
                if (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (c == 'd' && i + 1 < input.length()) {
                if (input.charAt(i + 1) == '-') {
                    i++;
                } else if (input.charAt(i + 1) == 'z' && i + 2 < input.length() && input.charAt(i + 2) == '=') {
                    i += 2;
                }
            } else if ((c == 'l' || c == 'n') && i + 1 < input.length()) {
                if (input.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i + 1 < input.length()) {
                if (input.charAt(i + 1) == '=') {
                    i++;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
