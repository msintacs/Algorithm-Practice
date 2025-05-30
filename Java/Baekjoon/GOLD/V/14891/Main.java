import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static final int RIGHT = 1;
    static final int LEFT = -1;

    static class Gear {
        int idx;
        LinkedList<Integer> gearList;

        Gear(int idx, LinkedList<Integer> gearList) {
            this.idx = idx;
            this.gearList = gearList;
        }
    }

    // Clock Rotate
    static void spinRight(Gear gear) {
        // back to front
        gear.gearList.addFirst(gear.gearList.pollLast());
    }

    // CounterClock Rotate
    static void spinLeft(Gear gear) {
        // front to back
        gear.gearList.addLast(gear.gearList.pollFirst());
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N=0, S=1
        // 12 Start

        // gear info save
        List<Gear> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String input = br.readLine();
            LinkedList<Integer> gearList = new LinkedList<>();
            for (int j = 0; j < input.length(); j++) {
                gearList.add(input.charAt(j) - '0');
            }

            list.add(new Gear(i, gearList));
        }

        int rotateCount = Integer.parseInt(br.readLine());
        int[] rotateDir = new int[4];

        for (int i = 0; i < rotateCount; i++) {

            Arrays.fill(rotateDir, 0);

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 1=Clock, -1=CounterClock
            int selectGear = Integer.parseInt(st.nextToken()) - 1;
            int rotate = Integer.parseInt(st.nextToken());

            rotateDir[selectGear] = rotate;

            for (int j = selectGear - 1; j >= 0; j--) {
                if (list.get(j).gearList.get(2) != list.get(j + 1).gearList.get(6)) {
                    rotateDir[j] = -rotateDir[j + 1];
                } else {
                    break;
                }
            }

            for (int j = selectGear + 1; j < 4; j++) {
                if (list.get(j - 1).gearList.get(2) != list.get(j).gearList.get(6)) {
                    rotateDir[j] = -rotateDir[j - 1];
                } else {
                    break;
                }
            }

            for (int j = 0; j < rotateDir.length; j++) {
                if (rotateDir[j] == RIGHT)
                    spinRight(list.get(j));
                else if (rotateDir[j] == LEFT)
                    spinLeft(list.get(j));
            }
        }

        int score = 0;
        for (Gear gear : list) {
            score += gear.gearList.peekFirst() * (1 << (gear.idx));
        }

        System.out.println(score);
    }
}
