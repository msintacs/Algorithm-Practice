import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 })));
        System.out.println(
                Arrays.toString(s.solution(new int[] { 95, 90, 99, 99, 80, 99 }, new int[] { 1, 1, 1, 1, 1, 1 })));
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();

        int pointer = 0;
        while (pointer < progresses.length) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] = progresses[i] + speeds[i];
            }

            int cnt = 0;
            if (progresses[pointer] >= 100) {
                while (progresses[pointer] >= 100) {
                    cnt++;
                    pointer++;
                    if (pointer == progresses.length)
                        break;
                }

                answer.add(cnt);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
