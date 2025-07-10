import java.util.Arrays;

public class Improved {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] { 1, 2, 3, 100, 99, 98 }));
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] prev = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(prev, arr)) {
                break;
            }

            answer++;
        }

        return answer;
    }
}