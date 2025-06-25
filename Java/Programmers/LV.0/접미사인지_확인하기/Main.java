class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Result : ");
        System.out.println(s.solution("banana", "ana"));
        System.out.println(s.solution("banana", "nan"));
        System.out.println(s.solution("banana", "wxyz"));
        System.out.println(s.solution("banana", "abanana"));
    }
}

class Solution {
    public int solution(String my_string, String is_suffix) {
        int s = my_string.length() - is_suffix.length();
        if (s < 0)
            return 0;
        int e = my_string.length();
        return my_string.substring(s, e).equals(is_suffix) ? 1 : 0;
    }
}