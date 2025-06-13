import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { 1, -1, 0, 0 };
    static int MAX_X;
    static int MAX_Y;

    static boolean isRange(int x, int y) {

        if (x < 0 || x >= MAX_X || y >= MAX_Y || y < 0) {
            return false;
        }

        return true;
    }

    static void dfs(int[][] field, boolean[][] visited, int x, int y) {
        visited[y][x] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (isRange(nx, ny) && !visited[ny][nx] && field[ny][nx] == 1) {
                dfs(field, visited, nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int cabbageCnt = Integer.parseInt(st.nextToken());

            MAX_X = X;
            MAX_Y = Y;

            int[][] field = new int[Y][X];
            boolean[][] visited = new boolean[Y][X];

            for (int i = 0; i < cabbageCnt; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                field[y][x] = 1;
            }

            int wormCount = 0;

            for (int y = 0; y < Y; y++) {
                for (int x = 0; x < X; x++) {
                    if (field[y][x] == 1 && !visited[y][x]) {
                        dfs(field, visited, x, y);
                        wormCount++;
                    }
                }
            }

            sb.append(wormCount).append("\n");
        }

        System.out.println(sb);
    }
}
