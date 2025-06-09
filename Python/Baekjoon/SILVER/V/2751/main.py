import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    N = int(input())

    list = []
    for _ in range(N):
        list.append(input().strip())

    list.sort()

    for num in list:
        write(f"{num}\n")


if __name__ == "__main__":
    main()
