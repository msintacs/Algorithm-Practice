import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            char tmp = input[i];

            if (tmp == 'c') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == '=' || input[i + 1] == '-') {
                        count--;
                    }
                }
            } else if (tmp == 'd') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == 'z') {
                        if (i + 2 == input.length) {
                            count++;
                            continue;
                        } else {
                            if (input[i + 2] == '=') {
                                count--;
                            }
                        }
                    } else if (input[i + 1] == '-') {
                        count--;
                    }
                }
            } else if (tmp == 'l') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == 'j') {
                        count--;
                    }
                }
            } else if (tmp == 'n') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == 'j') {
                        count--;
                    }
                }
            } else if (tmp == 's') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == '=') {
                        count--;
                    }
                }
            } else if (tmp == 'z') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == '=') {
                        count--;
                    }
                }
            } else if (tmp == 'z') {
                if (i + 1 == input.length) {
                    count++;
                    continue;
                } else if (input[i - 1] == 'd') {
                    count++;
                    continue;
                } else {
                    if (input[i + 1] == 'z') {
                        count--;
                    }
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
