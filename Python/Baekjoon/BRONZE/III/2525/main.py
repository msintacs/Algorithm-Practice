H, M = map(int, input().split())
setTime = int(input())

if M + setTime >= 60:
    H = (H + ((M + setTime) // 60)) % 24
    M = (M + setTime) % 60

    if M % 60 == 0:
        M = 0

else:
    M = M + setTime

print(H, M)
