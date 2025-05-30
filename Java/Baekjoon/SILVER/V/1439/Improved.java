import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int zeroGroup = 0;
        int oneGroup = 0;
        char prev = ' ';

        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);
            if (current != prev) {
                if (current == '0')
                    zeroGroup++;
                else
                    oneGroup++;

                prev = current;
            }
        }

        System.out.println(Math.min(zeroGroup, oneGroup));
    }
}