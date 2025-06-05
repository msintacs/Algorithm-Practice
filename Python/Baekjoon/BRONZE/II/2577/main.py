import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    A = int(input())
    B = int(input())
    C = int(input())

    result = str(A * B * C)

    num_list = [0] * 10

    for num in result:
        num_list[int(num)] += 1

    for num in num_list:
        write(f"{num}\n")


if __name__ == "__main__":
    main()
