import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int N = Integer.parseInt(br.readLine());
            int nGroupCount = 0;

            for (int nLoop = 0; nLoop < N; nLoop++) {

                int breakCount = 0;
                char[] sInput = br.readLine().toCharArray();
                main: for (int i = 0; i < sInput.length; i++) {

                    boolean bCheck[] = new boolean[sInput.length];
                    char cTmp = sInput[i];

                    for (int j = 0; j < sInput.length; j++) {
                        if (cTmp == sInput[j]) {
                            bCheck[j] = true;
                        }
                    }

                    boolean bStarted = false;
                    boolean bBroken = false;
                    for (int j = 0; j < bCheck.length; j++) {
                        if (bCheck[j]) {
                            if (!bStarted) {
                                bStarted = true;
                            } else if (bBroken) {
                                breakCount++;
                                break main;
                            }
                        } else {
                            if (bStarted) {
                                bBroken = true;
                            }
                        }
                    }
                }
                if (breakCount == 0)
                    nGroupCount++;
            }

            System.out.println(nGroupCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
