import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class XYInfo {
        int x, y;

        XYInfo(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<XYInfo> xyList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            XYInfo xyInfo = new XYInfo(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            xyList.add(xyInfo);
        }

        xyList.sort((a, b) -> {
            if (a.x != b.x)
                return Integer.compare(a.x, b.x);

            return Integer.compare(a.y, b.y);
        });

        for (XYInfo item : xyList) {
            sb.append(item.x).append(" ").append(item.y).append("\n");
        }

        System.out.println(sb);
    }
}
