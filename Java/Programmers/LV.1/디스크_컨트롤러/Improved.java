import java.util.Arrays;
import java.util.PriorityQueue;

public class Improved {

    public static void main(String[] args) {
        System.out.println(solution(new int[][] { { 0, 3 }, { 1, 9 }, { 3, 5 } }));
    }

    static public int solution(int[][] jobs) {

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        int time = 0;
        int total = 0;
        int cnt = 0;
        int idx = 0;

        while (cnt < jobs.length) {

            while (idx < jobs.length && jobs[idx][0] <= time) {
                pq.offer(jobs[idx++]);
            }

            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                time += job[1];
                total += time - job[0];
                cnt++;
            } else {
                time = jobs[idx][0];
            }
        }

        return total / jobs.length;
    }
}
