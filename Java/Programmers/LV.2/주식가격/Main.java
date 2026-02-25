import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new int[] { 1, 2, 3, 2, 3 })));
    }
}

class Solution {
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {

            while (!deque.isEmpty() && prices[deque.peek()] > prices[i]) {

                int idx = deque.poll();
                answer[idx] = i - idx;
            }

            deque.push(i);
        }

        while (!deque.isEmpty()) {
            int idx = deque.poll();
            answer[idx] = prices.length - 1 - idx;
        }

        return answer;
    }
}
