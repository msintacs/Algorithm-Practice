#include <stdio.h>

int main()
{
    int N;
    int nCount;
    int nRange;

    scanf("%d", &N);

    nCount = 1;
    nRange = 1;

    while (nRange < N)
    {
        nRange += 6 * nCount;
        nCount++;
    }

    printf("%d\n", nCount);

    return 0;
}