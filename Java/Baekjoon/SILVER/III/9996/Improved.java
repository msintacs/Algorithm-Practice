import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] pattern = br.readLine().split("\\*");
        String prefix = pattern[0];
        String suffix = pattern[1];

        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String input = br.readLine();

            if (input.length() < prefix.length() + suffix.length()) {
                sb.append("NE").append("\n");
                continue;
            }

            boolean match = true;

            for (int i = 0; i < prefix.length(); i++) {
                if (input.charAt(i) != prefix.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                int offset = input.length() - suffix.length();
                for (int i = 0; i < suffix.length(); i++) {
                    if (input.charAt(offset + i) != suffix.charAt(i)) {
                        match = false;
                        break;
                    }
                }
            }

            sb.append(match ? "DA" : "NE").append("\n");
        }

        System.out.println(sb);
    }
}
