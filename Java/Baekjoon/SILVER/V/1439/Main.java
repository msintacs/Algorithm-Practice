import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        List<Integer> list = new ArrayList<>();
        int prev = -1;
        for (int i = 0; i < S.length(); i++) {

            int target = S.charAt(i) - '0';

            if (prev != target) {
                list.add(target);
                prev = target;
            }
        }

        int zeroCount = 0;
        int oneCount = 0;
        for (Integer value : list) {
            if (value == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }

        if (zeroCount > oneCount) {
            System.out.println(oneCount);
        } else {
            System.out.println(zeroCount);
        }
    }
}
