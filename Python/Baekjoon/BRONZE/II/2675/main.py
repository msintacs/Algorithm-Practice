import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    T = int(input())

    for _ in range(T):
        R, S = input().split()
        R = int(R)

        for c in S:
            for _ in range(R):
                write(f"{c}")

        write("\n")


if __name__ == "__main__":
    main()
