import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    S = input().strip()

    alphabet = [-1] * 26

    for i, c in enumerate(S):
        idx = ord(c) - ord("a")
        if alphabet[idx] == -1:
            alphabet[idx] = i

    for num in alphabet:
        write(f"{num} ")


if __name__ == "__main__":
    main()
