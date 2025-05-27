import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> nameMap = new HashMap<>();
        Map<String, String> numMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String poketmon = br.readLine();
            String num = String.valueOf(i + 1);

            nameMap.put(poketmon, num);
            numMap.put(num, poketmon);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String target = br.readLine();
            if (nameMap.containsKey(target)) {
                sb.append(nameMap.get(target)).append("\n");
            } else {
                sb.append(numMap.get(target)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
