public class Improved {

    public int solution(int n, int w, int num) {
        int totalRow = (n + w - 1) / w;
        int row = (num - 1) / w;
        int col;

        if (row % 2 == 0) {
            col = (num - 1) % w;
        } else {
            col = w - 1 - (num - 1) % w;
        }

        int answer = 1;

        for (int i = -row + 1; i < totalRow; i++) {
            int boxNum;
            if (i % 2 == 0) {
                boxNum = i * w + col + 1;
            } else {
                boxNum = (i + 1) * w - col;
            }

            if (boxNum <= n) {
                answer++;
            }
        }

        return answer;
    }
}
