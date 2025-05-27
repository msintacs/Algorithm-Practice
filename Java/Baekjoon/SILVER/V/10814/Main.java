import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Info implements Comparable<Info> {
        int index;
        int age;
        String name;

        Info(int index, int age, String name) {
            this.index = index;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Info o) {
            if (this.age != o.age)
                return this.age - o.age;

            return this.index - o.index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Info> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Info(i, age, name));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Info data : list) {
            sb.append(data.age + " " + data.name).append("\n");
        }

        System.out.println(sb);
    }
}
