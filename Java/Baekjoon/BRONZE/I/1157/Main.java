import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char cInput[] = br.readLine().toCharArray();

        // A = 65 , a = 97
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < cInput.length; i++) {
            if (cInput[i] - 'a' < 0) {
                map.put(cInput[i], map.getOrDefault(cInput[i], 0) + 1);
            } else {
                map.put((char) (cInput[i] - ' '), map.getOrDefault((char) (cInput[i] - ' '), 0) + 1);
            }
        }

        int max = Collections.max(map.values());
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        if (list.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(list.get(0));
        }
    }
}
