import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[] { 56, 24, 14, 6 };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += Integer.parseInt(st.nextToken()) * score[i];
        }

        System.out.println(sum);
    }
}
