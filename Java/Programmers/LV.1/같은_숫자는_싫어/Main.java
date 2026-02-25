import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[] { 1, 1, 3, 3, 0, 1, 1 })));
        System.out.println(Arrays.toString(s.solution(new int[] { 4, 4, 4, 3, 3 })));
    }
}

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();
        int prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (prev != arr[i]) {
                answer.add(arr[i]);
            }

            prev = arr[i];
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}