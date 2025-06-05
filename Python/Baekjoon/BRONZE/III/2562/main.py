import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():
    max_value = 0
    max_value_idx = 0
    count = 0

    while count < 9:
        input_value = int(input())

        if input_value > max_value:
            max_value = input_value
            max_value_idx = count

        count += 1

    write(f"{max_value}\n")
    write(f"{max_value_idx+1}\n")


if __name__ == "__main__":
    main()
