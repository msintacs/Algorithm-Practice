import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Improved {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> wordList = new ArrayList<>(countMap.keySet());

        wordList.sort((a, b) -> {
            int countA = countMap.get(a);
            int countB = countMap.get(b);

            if (countA != countB)
                return countB - countA;

            if (a.length() != b.length())
                return b.length() - a.length();

            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String work : wordList) {
            sb.append(work).append("\n");
        }

        System.out.println(sb);
    }
}
