import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void printLoad(int[][] load, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(load[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkLoad(int[] row, int L) {
        int N = row.length;
        boolean[] used = new boolean[N];

        for (int i = 0; i < row.length - 1; i++) {
            int diff = row[i] - row[i + 1];

            if (diff == 0) {
                continue;
            } else if (diff == 1) {
                for (int j = i + 1; j <= i + L; j++) {
                    if (j >= N || row[j] != row[i + 1] || used[j]) {
                        return false;
                    }
                    used[j] = true;
                }
            } else if (diff == -1) {
                for (int j = i; j > i - L; j--) {
                    if (j < 0 || row[j] != row[i] || used[j]) {
                        return false;
                    }
                    used[j] = true;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int nRes = 0;

        int[][] load = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int parse = Integer.parseInt(st.nextToken());
                load[i][j] = parse;
            }
        }

        // X Check
        for (int y = 0; y < N; y++) {
            int row[] = new int[N];
            for (int x = 0; x < N; x++) {
                row[x] = load[y][x];
            }

            if (checkLoad(row, L))
                nRes++;

        }

        // Y Check
        for (int x = 0; x < N; x++) {
            int col[] = new int[N];
            for (int y = 0; y < N; y++) {
                col[y] = load[y][x];
            }

            if (checkLoad(col, L))
                nRes++;
        }

        // printLoad(load, N);

        System.out.println(nRes);
    }
}
