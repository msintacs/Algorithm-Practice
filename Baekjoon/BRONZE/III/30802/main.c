#include <stdio.h>

int main()
{
    int i;
    int N;
    int nSize[6];
    int T, P;
    int nTResult;

    scanf("%d", &N);

    for (i = 0; i < 6; i++)
    {
        scanf("%d", &nSize[i]);
    }

    scanf("%d %d", &T, &P);

    nTResult = 0;
    for (i = 0; i < 6; i++)
    {
        nTResult += (nSize[i] + T - 1) / T;
    }

    printf("%d\n", nTResult);
    printf("%d %d\n", N / P, N % P);

    return 0;
}