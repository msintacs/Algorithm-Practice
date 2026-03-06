import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new int[] { 1, 2, 3, 4, 5 })));
        System.out.println(Arrays.toString(s.solution(new int[] { 1, 3, 2, 4, 2 })));
    }
}

class Solution {
    public int[] solution(int[] answers) {

        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] C = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            int idxA = i % A.length;
            int idxB = i % B.length;
            int idxC = i % C.length;

            if (answers[i] == A[idxA])
                score[0]++;

            if (answers[i] == B[idxB])
                score[1]++;

            if (answers[i] == C[idxC])
                score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max)
                list.add(i + 1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
