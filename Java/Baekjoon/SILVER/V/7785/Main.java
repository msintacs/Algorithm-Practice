import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            Map<String, Boolean> enterMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String sInput = br.readLine();
                String sData[] = sInput.split(" ");
                Boolean isEntered = false;

                if (sData[1].equals("enter")) {
                    isEntered = true;
                } else {
                    isEntered = false;
                }

                enterMap.put(sData[0], isEntered);
            }

            Map<String, Boolean> sortedMap = new TreeMap<>(Comparator.reverseOrder());
            sortedMap.putAll(enterMap);

            for (Map.Entry<String, Boolean> entry : sortedMap.entrySet()) {
                if (entry.getValue()) {
                    System.out.println(entry.getKey());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
