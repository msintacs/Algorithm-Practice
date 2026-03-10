import java.util.Random;

public class CoteRoulette {
    public static void main(String[] args) {
        String[] types = {
                "구현/시뮬레이션",
                "해시",
                "스택/큐",
                "DFS/BFS",
                "그리디",
                "정렬",
                "DP",
                "이진탐색",
                "투포인터/슬라이딩윈도우",
                "완전탐색",
                "문자열"
        };

        Random random = new java.util.Random();
        int idx = random.nextInt(types.length);
        System.out.println("오늘의 코테 유형: " + types[idx]);
    }
}