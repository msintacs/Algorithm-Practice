import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    N = int(input())

    arr = [tuple(map(int, input().split())) for _ in range(N)]
    sorted_arr = sorted(arr, key=lambda x: (x[0], x[1]))

    write("\n".join(f"{x} {y}" for x, y in sorted_arr) + "\n")


if __name__ == "__main__":
    main()
