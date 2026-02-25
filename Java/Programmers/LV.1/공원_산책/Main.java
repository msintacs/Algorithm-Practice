import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(
                s.solution(new String[] { "SOO", "OOO", "OOO" }, new String[] { "E 2", "S 2", "W 1" })));

        System.out.println(Arrays.toString(
                s.solution(new String[] { "SOO", "OXX", "OOO" }, new String[] { "E 2", "S 2", "W 1" })));

        System.out.println(Arrays.toString(
                s.solution(new String[] { "OSO", "OOO", "OXO", "OOO" }, new String[] { "E 2", "S 3", "W 1" })));
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {

        int[] currPoint = new int[2];
        int rows = park.length;
        int cols = park[0].length();

        for (int i = 0; i < rows; i++) {
            if (park[i].contains("S")) {
                currPoint[0] = i;
                currPoint[1] = park[i].indexOf("S");
            }
        }

        int[] dr = { 0, 0, 1, -1 };
        int[] dc = { 1, -1, 0, 0 };
        String[] dirs = { "E", "W", "S", "N" };

        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);

            int d = 0;
            for (int j = 0; j < dirs.length; j++) {
                if (dirs[j].equals(dir)) {
                    d = j;
                    break;
                }
            }

            int[] tmp = currPoint.clone();
            boolean possible = true;
            for (int step = 0; step < dist; step++) {
                tmp[0] += dr[d];
                tmp[1] += dc[d];

                if (tmp[0] < 0 || tmp[0] >= rows || tmp[1] < 0 | tmp[1] >= cols || park[tmp[0]].charAt(tmp[1]) == 'X') {
                    possible = false;
                    break;
                }
            }

            if (possible)
                currPoint = tmp;
        }

        return currPoint;
    }
}
