import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(new int[] { 1, 4, 2 }, new int[] { 5, 4, 4 }));
        System.out.println(s.solution(new int[] { 1, 2 }, new int[] { 3, 4 }));
    }
}

class Solution {
    public int solution(int[] A, int[] B) {

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}