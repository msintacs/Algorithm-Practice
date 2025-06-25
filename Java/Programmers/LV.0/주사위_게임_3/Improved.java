import java.util.*;

public class Improved {
    public int solution(int a, int b, int c, int d) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : new int[] { a, b, c, d }) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int max = Collections.max(map.values());
        int p = 0;
        int q = 0;

        if (max == 4) {
            return 1111 * a;

        } else if (max == 3) {
            for (int key : map.keySet()) {
                if (map.get(key) == 3)
                    p = key;
                else
                    q = key;
            }
            return (int) Math.pow(10 * p + q, 2);
        } else if (max == 2) {
            if (map.size() == 2) {
                List<Integer> keys = new ArrayList<>(map.keySet());
                p = keys.get(0);
                q = keys.get(0);
                return (p + q) * Math.abs(p - q);
            } else {
                List<Integer> singles = new ArrayList<>();
                for (int key : map.keySet()) {
                    if (map.get(key) == 1)
                        singles.add(key);
                }

                return singles.get(0) * singles.get(1);
            }
        } else {
            return Collections.min(map.keySet());
        }
    }
}
