import java.io.IOException;

public class Improved {
    public static void main(String[] args) throws IOException {

        int[] count = new int[10];
        for (byte b : System.in.readAllBytes()) {
            if (b >= '0' && b <= '9') {
                count[b - '0']++;
            }
        }

        count[6] = (count[6] + count[9] + 1) / 2;

        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.min(max, count[i]);
        }

        System.out.println(max);

    }
}
