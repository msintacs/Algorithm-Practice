import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Improved {

    static void remove(int[][] board, int target) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (board[y][x] == target) {
                    board[y][x] = 0;
                    return;
                }
            }
        }
    }

    static int bingoCheck(int[][] board) {
        int bingoCnt = 0;

        // row
        for (int y = 0; y < 5; y++) {
            boolean isBingo = true;
            for (int x = 0; x < 5; x++) {
                if (board[y][x] != 0) {
                    isBingo = false;
                    break;
                }
            }

            if (isBingo)
                bingoCnt++;
        }

        // col
        for (int x = 0; x < 5; x++) {
            boolean isBingo = true;
            for (int y = 0; y < 5; y++) {
                if (board[y][x] != 0) {
                    isBingo = false;
                    break;
                }
            }

            if (isBingo)
                bingoCnt++;
        }

        // diagLR
        boolean isDiagLR = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] != 0) {
                isDiagLR = false;
                break;
            }
        }

        if (isDiagLR)
            bingoCnt++;

        // diagRL
        boolean isDiagRL = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] != 0) {
                isDiagRL = false;
                break;
            }
        }

        if (isDiagRL)
            bingoCnt++;

        return bingoCnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[5][5];

        for (int y = 0; y < 5; y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int x = 0; x < 5; x++) {
                board[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int callCnt = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int number = Integer.parseInt(st.nextToken());
                callCnt++;
                remove(board, number);
                if (bingoCheck(board) >= 3) {
                    System.out.println(callCnt);
                    return;
                }
            }
        }
    }
}
