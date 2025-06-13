import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    N = int(input())

    data = []
    for _ in range(N):
        data.append(input().strip())

    set_data = set(data)
    input_list = list(set_data)
    input_list.sort(key=lambda x: (len(x), x))

    for obj in input_list:
        write(f"{obj}\n")


if __name__ == "__main__":
    main()
