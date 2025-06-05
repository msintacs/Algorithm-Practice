import sys


def add(a, b):
    return a + b


input = sys.stdin.readline
write = sys.stdout.write


def main():

    write("Hello World!\n")
    a, b = map(int, input().split())
    write(f"{add(a, b)}\n")


if __name__ == "__main__":
    main()
