public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aBcDeFg"));
        System.out.println(s.solution("aaa"));
    }
}

class Solution {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}
