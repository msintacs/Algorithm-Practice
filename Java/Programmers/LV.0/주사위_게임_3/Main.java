import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        StringBuilder sb = new StringBuilder();

        int nRes = 0;

        nRes = s.solution(2, 2, 2, 2);
        sb.append(nRes).append("\n");

        nRes = s.solution(4, 1, 4, 4);
        sb.append(nRes).append("\n");

        nRes = s.solution(6, 3, 3, 6);
        sb.append(nRes).append("\n");

        nRes = s.solution(2, 5, 2, 6);
        sb.append(nRes).append("\n");

        nRes = s.solution(6, 4, 2, 5);
        sb.append(nRes).append("\n");

        System.out.println("Result : ");
        System.out.println(sb);
    }

}

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        int max = Collections.max(map.values());
        int p = 0;
        int q = 0;
        int r = 0;

        if (max == 4) {

            answer = 1111 * a;

        } else if (max == 3) {

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 3) {
                    p = entry.getKey();
                } else {
                    q = entry.getKey();
                }
            }

            answer = (10 * p + q) * (10 * p + q);

        } else if (max == 2) {
            if (map.size() == 2) {
                int i = 0;
                for (int key : map.keySet()) {
                    if (i == 0)
                        p = key;
                    else if (i == 1) {
                        q = key;
                    }
                    i++;
                }

                answer = Math.abs((p + q)) * Math.abs((p - q));
            } else {
                int i = 0;
                for (int key : map.keySet()) {
                    if (map.get(key) == 1) {
                        if (i == 0)
                            q = key;
                        else if (i == 1) {
                            r = key;
                        }
                        i++;
                    }
                }

                answer = q * r;
            }
        } else {
            answer = Collections.min(map.keySet());
        }

        return answer;
    }
}