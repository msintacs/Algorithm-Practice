public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] { 1, 2, 3, 100, 99, 98 }));
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean flagA = true;
        boolean flagB = true;

        while (true) {

            flagA = false;
            flagB = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                    flagA = true;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    flagB = true;
                }
            }

            answer++;

            if (!flagA && !flagB) {
                break;
            }
        }

        return answer - 1;
    }
}