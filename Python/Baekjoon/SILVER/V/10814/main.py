import sys

input = sys.stdin.readline
write = sys.stdout.write


def main():

    N = int(input())

    members = [tuple(input().split()) for _ in range(N)]
    sorted_members = sorted(members, key=lambda x: int(x[0]))

    write("\n".join(f"{x} {y}" for x, y in sorted_members) + "\n")


if __name__ == "__main__":
    main()
