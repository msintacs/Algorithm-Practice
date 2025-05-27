import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Improved {
    public static void main(String[] args) throws IOException {

        FastIO io = new FastIO();

        int N = io.nextInt();
        int offset = 1_000_000;
        int[] count = new int[2 * offset + 1];

        for (int i = 0; i < N; i++) {
            int value = io.nextInt();
            count[value + offset]++;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                io.writeInInt(i - offset);
            }
        }

        io.flushAndClose();
    }

    static class FastIO {
        private static final int BUFFER_SIZE = 1 << 16;
        private final DataInputStream in;
        private final DataOutputStream out;
        private final byte[] inBuffer;
        private final byte[] outBuffer;
        private final byte[] numBuffer;

        private int inPtr, byteRead, outPtr;

        FastIO() {
            in = new DataInputStream(System.in);
            out = new DataOutputStream(System.out);
            inBuffer = new byte[BUFFER_SIZE];
            outBuffer = new byte[BUFFER_SIZE];
            numBuffer = new byte[10];
            inPtr = byteRead = outPtr = 0;
        }

        int nextInt() throws IOException {
            byte c;
            do {
                c = read();
            } while (c <= ' ');

            boolean neg = c == '-';
            if (neg)
                c = read();

            int result = 0;
            do {
                result = result * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            return neg ? -result : result;
        }

        private byte read() throws IOException {
            if (inPtr == byteRead)
                fillBuffer();
            return inBuffer[inPtr++];
        }

        private void fillBuffer() throws IOException {
            byteRead = in.read(inBuffer, inPtr = 0, BUFFER_SIZE);
            if (byteRead == -1)
                inBuffer[0] = -1;
        }

        void writeInInt(int x) {
            writeInt(x);
            write((byte) '\n');
        }

        void writeInt(int x) {
            if (x == 0) {
                write((byte) '0');
                return;
            }

            if (x < 0) {
                write((byte) '-');
                x = -x;
            }

            int i = 0;
            while (x > 0) {
                numBuffer[i++] = (byte) ('0' + (x % 10));
                x /= 10;
            }

            while (--i >= 0) {
                write(numBuffer[i]);
            }
        }

        private void write(byte b) {
            if (outPtr == outBuffer.length)
                flushBuffer();
            outBuffer[outPtr++] = b;
        }

        private void flushBuffer() {
            try {
                out.write(outBuffer, 0, outPtr);
            } catch (IOException ignored) {

            }
            outPtr = 0;
        }

        void flushAndClose() throws IOException {
            flushBuffer();
            in.close();
            out.close();
        }
    }
}