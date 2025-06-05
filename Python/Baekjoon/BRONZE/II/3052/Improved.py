import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    result = set()

    for _ in range(10):
        input_value = int(input())
        div_value = input_value % 42
        result.add(div_value)

    write(f"{len(result)}\n")


if __name__ == "__main__":
    main()
