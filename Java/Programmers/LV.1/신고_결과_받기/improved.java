import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class improved {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(
                new String[] { "muzi", "frodo", "apeach", "neo" },
                new String[] { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" },
                2)));

        System.out.println(Arrays.toString(s.solution(
                new String[] { "con", "ryan" },
                new String[] { "ryan con", "ryan con", "ryan con", "ryan con" },
                3)));
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String id : id_list)
            reportMap.put(id, new HashSet<>());

        for (String r : report) {
            String[] parts = r.split(" ");
            reportMap.get(parts[1]).add(parts[0]);
        }

        Map<String, Long> mailCount = new HashMap<>();
        reportMap.values().stream()
                .filter(set -> set.size() >= k)
                .flatMap(Set::stream)
                .forEach(reporter -> mailCount.merge(reporter, 1L, Long::sum));

        return Arrays.stream(id_list)
                .mapToInt(id -> mailCount.getOrDefault(id, 0L).intValue())
                .toArray();
    }
}