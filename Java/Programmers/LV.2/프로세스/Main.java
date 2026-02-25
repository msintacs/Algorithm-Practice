import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(new int[] { 2, 1, 3, 2 }, 2));
        System.out.println(s.solution(new int[] { 1, 1, 9, 1, 1, 1 }, 0));
    }
}

class Solution {
    public int solution(int[] priorities, int location) {

        int answer = 0;
        PriorityQueue<Integer> pQue = new PriorityQueue<>(Collections.reverseOrder());
        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            pQue.offer(priorities[i]);
            deque.offer(new int[] { i, priorities[i] });
        }

        while (true) {
            int peek = pQue.peek();
            int[] obj = deque.poll();

            if (obj[1] == peek) {
                pQue.poll();
                answer++;

                if (obj[0] == location)
                    break;

            } else {
                deque.offer(obj);
            }
        }

        return answer;
    }
}
