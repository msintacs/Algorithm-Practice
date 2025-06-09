import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    S = input().strip()

    alphabet = [-1] * 26

    count = 0
    for c in S:
        if alphabet[ord(c) - ord("a")] == -1:
            alphabet[ord(c) - ord("a")] = count

        count += 1

    for num in alphabet:
        write(f"{num} ")


if __name__ == "__main__":
    main()
