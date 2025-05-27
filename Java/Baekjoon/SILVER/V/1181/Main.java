import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    static class InputText implements Comparable<InputText> {
        public String text;

        InputText(String text) {
            this.text = text;
        }

        @Override
        public int compareTo(InputText o) {
            if (this.text.length() != o.text.length()) {
                return this.text.length() - o.text.length();
            }
            return this.text.compareTo(o.text);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<InputText> list = new ArrayList<>();
        for (String s : set) {
            list.add(new InputText(s));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (InputText item : list) {
            sb.append(item.text).append("\n");
        }

        System.out.println(sb);
    }
}
