import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    N = int(input())
    numList = list(map(int, input().split()))

    # minValue = 1000001
    # maxValue = -1000001

    minValue = maxValue = numList[0]

    for num in numList:
        if num > maxValue:
            maxValue = num

        if num < minValue:
            minValue = num

    write(f"{minValue} {maxValue}\n")


if __name__ == "__main__":
    main()
