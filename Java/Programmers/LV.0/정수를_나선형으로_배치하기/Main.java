public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));
        System.out.println(s.solution(5));
    }
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        int dir = 0;

        int x = -1;
        int y = 0;
        int cnt = 1;

        while (cnt <= n * n) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[ny][nx] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
            answer[y][x] = cnt;
            cnt++;
        }

        return answer;
    }
}
