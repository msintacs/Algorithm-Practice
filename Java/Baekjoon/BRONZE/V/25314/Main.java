import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = N / 4;
        for (int i = 0; i < cnt; i++) {
            sb.append("long").append(" ");
        }

        System.out.println(sb + "int");

    }
}
