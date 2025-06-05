import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void printSeats(int[][] seats, int C, int R) {

        System.out.println("R: " + R + " C: " + C);

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int waitingNumber = Integer.parseInt(br.readLine());

        if ((C * R) < waitingNumber) {
            System.out.println(0);
            return;
        }

        int[][] seats = new int[R][C];
        int X = 0;
        int Y = R - 1;

        // RIGHT, DOWN, LEFT, UP
        int[] moveX = { 1, 0, -1, 0 };
        int[] moveY = { 0, 1, 0, -1 };
        int dir = 3;

        int count = 1;
        while (true) {

            // 한글테스트
            System.out.println("한글");

            seats[Y][X] = count;

            if (count == waitingNumber) {
                System.out.println((X + 1) + " " + (R - Y));
                break;
            }

            int tmpX = X + moveX[dir];
            int tmpY = Y + moveY[dir];

            if (tmpX < 0 || tmpX >= C || tmpY < 0 || tmpY >= R || seats[tmpY][tmpX] != 0) {
                dir = (dir + 1) % 4;
                tmpX = X + moveX[dir];
                tmpY = Y + moveY[dir];
            }

            X = tmpX;
            Y = tmpY;

            count++;
        }

        // printSeats(seats, C, R);
    }
}