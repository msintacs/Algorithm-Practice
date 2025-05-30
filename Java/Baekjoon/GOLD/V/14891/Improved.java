import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Improved {

    static final int RIGHT = 1;
    static final int LEFT = -1;

    static void rotate(LinkedList<Integer> gear, int dir) {
        if (dir == RIGHT) {
            gear.addFirst(gear.pollLast());
        } else if (dir == LEFT) {
            gear.addLast(gear.pollFirst());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<LinkedList<Integer>> gears = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            LinkedList<Integer> gear = new LinkedList<>();
            for (char ch : br.readLine().toCharArray()) {
                gear.add(ch - '0');
            }
            gears.add(gear);
        }

        int K = Integer.parseInt(br.readLine());
        int[] rotateDir = new int[4];

        for (int i = 0; i < K; i++) {
            Arrays.fill(rotateDir, 0);
            StringTokenizer st = new StringTokenizer(br.readLine());

            int gearIndex = Integer.parseInt(st.nextToken()) - 1;
            int dir = Integer.parseInt(st.nextToken());

            rotateDir[gearIndex] = dir;

            for (int j = gearIndex - 1; j >= 0; j--) {
                if (gears.get(j).get(2) != gears.get(j + 1).get(6)) {
                    rotateDir[j] = -rotateDir[j + 1];
                } else {
                    break;
                }
            }

            for (int j = gearIndex + 1; j < 4; j++) {
                if (gears.get(j - 1).get(2) != gears.get(j).get(6)) {
                    rotateDir[j] = -rotateDir[j - 1];
                } else {
                    break;
                }
            }

            for (int j = 0; j < 4; j++) {
                rotate(gears.get(j), rotateDir[j]);
            }
        }

        int score = 0;
        for (int i = 0; i < 4; i++) {
            score += gears.get(i).peekFirst() * (1 << i);
        }

        System.out.println(score);
    }
}