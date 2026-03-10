import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 10, new int[] { 7, 4, 5, 6 }));
        System.out.println(s.solution(100, 100, new int[] { 10 }));
        System.out.println(s.solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Deque<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++)
            bridge.offer(0);

        int time = 0;
        int pointer = 0;
        int curWeight = 0;
        while (pointer < truck_weights.length) {

            time++;
            curWeight -= bridge.poll();

            int truck = truck_weights[pointer];
            if (curWeight + truck <= weight) {
                bridge.offer(truck);
                curWeight += truck;
                pointer++;
            } else {
                bridge.offer(0);
            }
        }

        return time + bridge_length;
    }
}