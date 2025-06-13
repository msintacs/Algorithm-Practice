import sys


def main():
    input = sys.stdin.readline

    N = int(input())

    words = {input().strip() for _ in range(N)}

    sorted_words = sorted(words, key=lambda x: (len(x), x))

    sys.stdout.write("\n".join(sorted_words) + "\n")


if __name__ == "__main__":
    main()
