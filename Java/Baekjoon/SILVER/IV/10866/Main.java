import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int deque[];
    static int front;
    static int back;

    static void push_front(int argv) {
        deque[--front] = argv;
    }

    static void push_back(int argv) {
        deque[back++] = argv;
    }

    static void pop_front() {
        if (front == back) {
            System.out.println(-1);
        } else {
            System.out.println(deque[front]);
            deque[front] = 0;
            front++;
        }
    }

    static void pop_back() {
        if (front == back) {
            System.out.println(-1);
        } else {
            back--;
            System.out.println(deque[back]);
            deque[back] = 0;
        }
    }

    static void size() {
        System.out.println(back - front);
    }

    static void empty() {
        if (front == back) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void front() {
        if (front == back) {
            System.out.println(-1);
        } else {
            System.out.println(deque[front]);
        }
    }

    static void back() {
        if (front == back) {
            System.out.println(-1);
        } else {
            System.out.println(deque[back - 1]);
        }
    }

    // static void printfDeque(int[] deque) {
    // for (int i = 0; i < deque.length; i++) {
    // System.out.println("index: " + i + " / " + "value: " + deque[i]);
    // }
    // }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        deque = new int[n * 2];
        front = n;
        back = n;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int argv;

            switch (st.nextToken()) {
                case "push_front":
                    argv = Integer.parseInt(st.nextToken());
                    push_front(argv);
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "push_back":
                    argv = Integer.parseInt(st.nextToken());
                    push_back(argv);
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "pop_front":
                    pop_front();
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "pop_back":
                    pop_back();
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "size":
                    size();
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "empty":
                    empty();
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "front":
                    front();
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                case "back":
                    back();
                    // System.out.println("front: " + front + " / " + "back: " + back);
                    // printfDeque(deque);
                    break;
                default:
                    break;
            }
        }
    }
}
