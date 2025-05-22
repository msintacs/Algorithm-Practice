import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            int nGroupWordCount = 0;

            for (int i = 0; i < N; i++) {
                String word = br.readLine();
                boolean[] bVisited = new boolean[26]; // a ~ z
                boolean bIsGroupWord = true;
                char cPrevChar = 0;

                for (int j = 0; j < word.length(); j++) {
                    char cCurrentChar = word.charAt(j);

                    if (cCurrentChar != cPrevChar) {
                        if (bVisited[cCurrentChar - 'a']) {
                            bIsGroupWord = false;
                            break;
                        }

                        bVisited[cCurrentChar - 'a'] = true;
                        cPrevChar = cCurrentChar;
                    }
                }
                if (bIsGroupWord) {
                    nGroupWordCount++;
                }
            }

            System.out.println(nGroupWordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
