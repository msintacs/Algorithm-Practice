import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    N = int(input())
    input_value = input().strip()

    total = 0
    for num in input_value:
        total += int(num)

    write(f"{total}\n")


if __name__ == "__main__":
    main()
