import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String sInput[] = new String[N + M];

        for (int i = 0; i < sInput.length; i++) {
            sInput[i] = br.readLine();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String entry : sInput) {
            map.put(entry, map.getOrDefault(entry, 0) + 1);
        }

        Map<String, Integer> treeMap = new TreeMap<>(map);

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
                sb.append(entry.getKey()).append("\n");
            }
        }

        System.out.println(count);
        System.out.println(sb);
    }
}
