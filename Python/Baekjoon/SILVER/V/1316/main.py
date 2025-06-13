import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    N = int(input())

    groupWordCnt = 0

    for _ in range(N):
        input_value = input().strip()
        isGroupWord = True
        isChecked = [False] * 26
        prevChar = ""

        for c in input_value:

            if c != prevChar:
                if isChecked[ord(c) - ord("a")]:
                    isGroupWord = False
                    break

            isChecked[ord(c) - ord("a")] = True
            prevChar = c

        if isGroupWord:
            groupWordCnt += 1

    write(f"{groupWordCnt}\n")


if __name__ == "__main__":
    main()
