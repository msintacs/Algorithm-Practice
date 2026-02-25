import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
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
            String reporter = parts[0];
            String reported = parts[1];
            reportMap.get(reported).add(reporter);
        }

        Map<String, Integer> mailCount = new HashMap<>();
        for (String id : id_list)
            mailCount.put(id, 0);

        for (Map.Entry<String, Set<String>> entry : reportMap.entrySet()) {
            if (entry.getValue().size() >= k) {
                for (String reporter : entry.getValue()) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }

        return answer;
    }
}