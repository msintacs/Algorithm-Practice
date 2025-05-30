import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void remove(int[][] bingoBoard, int target) {
        for (int i = 0; i < bingoBoard.length; i++) {
            for (int j = 0; j < bingoBoard.length; j++) {
                if (bingoBoard[i][j] == target) {
                    bingoBoard[i][j] = 0;
                }
            }
        }
    }

    static int bingoCheck(int[][] bingoBoard) {
        int bingoCnt = 0;
        boolean isBingo = false;

        // row
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (bingoBoard[y][x] != 0) {
                    isBingo = false;
                    break;
                }
                isBingo = true;
            }

            if (isBingo)
                bingoCnt++;
        }

        // col
        isBingo = false;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (bingoBoard[y][x] != 0) {
                    isBingo = false;
                    break;
                }
                isBingo = true;
            }

            if (isBingo)
                bingoCnt++;
        }

        // diagR
        isBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingoBoard[i][i] != 0) {
                isBingo = false;
                break;
            }
        }

        if (isBingo)
            bingoCnt++;

        // diagL
        int y = 0;
        int x = 4;
        isBingo = true;
        while (y <= 4 && x >= 0) {
            if (bingoBoard[y++][x--] != 0) {
                isBingo = false;
                break;
            }
        }

        if (isBingo)
            bingoCnt++;

        return bingoCnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] bingoBoard = new int[5][5];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int parse = Integer.parseInt(st.nextToken());
                bingoBoard[i][j] = parse;
            }
        }

        StringBuilder sb = new StringBuilder();
        int nRes = 0;
        int callCnt = 0;
        boolean isBingo = false;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int parse = Integer.parseInt(st.nextToken());
                remove(bingoBoard, parse);

                callCnt++;

                nRes = bingoCheck(bingoBoard);
                if (nRes >= 3) {
                    sb.append(callCnt);
                    isBingo = true;
                    break;
                }
            }

            if (isBingo) {
                break;
            }
        }

        System.out.println(sb);
    }
}
