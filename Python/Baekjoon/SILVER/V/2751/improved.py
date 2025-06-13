import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    N = int(input())
    arr = [input().strip() for _ in range(N)]
    arr.sort()
    write("\n".join(arr))


if __name__ == "__main__":
    main()
