import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static class Word implements Comparable<Word> {
        int size;
        String text;
        Map<String, Integer> countMap;

        Word(int size, String text, Map<String, Integer> countMap) {
            this.size = size;
            this.text = text;
            this.countMap = countMap;
        }

        @Override
        public int compareTo(Word o) {

            if (this.countMap.get(this.text) != o.countMap.get(o.text))
                return o.countMap.get(o.text) - this.countMap.get(this.text);

            if (this.size != o.size)
                return o.size - this.size;

            return this.text.compareTo(o.text);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Word> list = new ArrayList<>();
        Map<String, Integer> addMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String text = br.readLine();
            if (text.length() >= M) {
                addMap.put(text, addMap.getOrDefault(text, 0) + 1);
                list.add(new Word(text.length(), text, addMap));
            }
        }

        Collections.sort(list);

        Set<String> set = new LinkedHashSet<>();
        for (Word word : list) {
            set.add(word.text);
        }

        StringBuilder sb = new StringBuilder();
        for (String text : set) {
            sb.append(text).append("\n");
        }

        System.out.println(sb);
    }
}
