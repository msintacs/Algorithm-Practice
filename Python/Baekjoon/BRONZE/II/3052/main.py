import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    count = 0
    result = []
    while count < 10:

        count += 1
        input_value = int(input())
        div_value = input_value % 42

        is_exist = False
        for digit in result:
            if digit == div_value:
                is_exist = True
                break

        if is_exist:
            continue

        result.append(div_value)

    write(f"{len(result)}\n")


if __name__ == "__main__":
    main()
