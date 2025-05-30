import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Failed {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        int appleCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < appleCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            board[y][x] = 1;
        }

        int rotateCnt = Integer.parseInt(br.readLine());
        Map<Integer, Character> turnMap = new HashMap<>();
        for (int i = 0; i < rotateCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            turnMap.put(time, dir);
        }

        // [0] = RIGHT, [1] = DOWN, [2] = LEFT, [3] = UP;
        int[] dy = { 0, 1, 0, -1 };
        int[] dx = { 1, 0, -1, 0 };
        int dir = 0;

        // snake init
        Deque<int[]> snake = new ArrayDeque<>();
        snake.add(new int[] { 0, 0 });
        board[0][0] = 2;

        int time = 0;
        while (true) {
            time++;

            // move
            int[] head = snake.peekFirst();
            int ny = head[0] + dy[dir];
            int nx = head[1] + dx[dir];

            if (ny < 0 || nx < 0 || ny >= N || nx >= N || board[ny][nx] == 2) {
                break;
            }

            if (board[ny][nx] == 1) {
                board[ny][nx] = 2;
                snake.addFirst(new int[] { ny, nx });
            } else {
                board[ny][nx] = 2;
                snake.addFirst(new int[] { ny, nx });
                int[] tail = snake.removeLast();
                board[tail[0]][tail[1]] = 0;
            }

            // turn
            if (turnMap.containsKey(time)) {
                char c = turnMap.get(time);
                if (c == 'D') {
                    dir = (dir + 1) % 4;
                } else {
                    dir = (dir + 3) % 4;
                }
            }
        }

        System.out.println(time);
    }
}
