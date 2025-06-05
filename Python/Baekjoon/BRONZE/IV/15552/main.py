import sys

input = sys.stdin.readline
write = sys.stdout.write

T = int(input())
result = []

for _ in range(T):
    A, B = map(int, input().split())
    result.append(f"{A+B}")

write("\n".join(result) + "\n")
