import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.solution(new int[][] { { 0, 3 }, { 1, 9 }, { 3, 5 } }));
    }
}

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] visited = new boolean[jobs.length];
        int time = 0;
        int total = 0;
        int count = 0;

        while (count < jobs.length) {
            int minJobIdx = -1;
            int minDuration = Integer.MAX_VALUE;

            for (int i = 0; i < jobs.length; i++) {
                if (!visited[i] && jobs[i][0] <= time) {
                    if (jobs[i][1] < minDuration) {
                        minDuration = jobs[i][1];
                        minJobIdx = i;
                    }
                }
            }

            if (minJobIdx == -1) {
                time++;
                continue;
            }

            visited[minJobIdx] = true;
            time += jobs[minJobIdx][1];
            total += time - jobs[minJobIdx][0];
            count++;
        }

        return total / jobs.length;
    }
}