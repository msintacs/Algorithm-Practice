public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(22, 6, 8));
        System.out.println(s.solution(13, 3, 6));
    }
}

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        int h = (n + w - 1) / w;
        int[][] area = new int[h][w];
        int[] dx = { 1, -1 };
        int dir = 0;
        int x = -1;
        int y = h - 1;
        int cnt = 1;

        while (cnt <= n) {
            int nx = x + dx[dir];

            if (nx >= w || nx < 0 || area[y][nx] != 0) {
                dir = (dir + 1) % 2;
                nx = nx + dx[dir];
                y--;
                if (y < 0) {
                    break;
                }
            }

            x = nx;
            area[y][x] = cnt++;
        }

        int idxX = 0;
        int idxY = 0;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                if (area[i][j] == num) {
                    idxX = j;
                    idxY = i;
                }
            }
        }

        for (int i = 0; i < idxY; i++) {
            if (area[i][idxX] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
