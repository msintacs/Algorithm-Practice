import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Improved2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        input = input.replace("c=", "*")
                .replace("c-", "*")
                .replace("dz=", "*")
                .replace("d-", "*")
                .replace("lj", "*")
                .replace("nj", "*")
                .replace("s=", "*")
                .replace("z=", "*");

        System.out.println(input.length());
    }
}
