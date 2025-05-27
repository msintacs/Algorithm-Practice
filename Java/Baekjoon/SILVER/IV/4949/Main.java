import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            try {

                String sInput = br.readLine();

                if (sInput.equals(".")) {
                    break;
                }

                boolean isBalanced = true;
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < sInput.length(); i++) {

                    char cWord = sInput.charAt(i);

                    if (cWord == '(' || cWord == '[') {
                        stack.push(cWord);
                    }

                    if (stack.empty() && (cWord == ')' || cWord == ']')) {
                        isBalanced = false;
                        break;
                    } else if (cWord == ')') {
                        if (stack.pop() != '(') {
                            isBalanced = false;
                            break;
                        }
                    } else if (cWord == ']') {
                        if (stack.pop() != '[') {
                            isBalanced = false;
                            break;
                        }
                    }
                }

                if (!stack.empty())
                    isBalanced = false;

                if (isBalanced) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
