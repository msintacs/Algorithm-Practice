#include "stdio.h"

int main()
{
    int N;
    int nTarget;
    int nLoop;
    int nSum;

    scanf("%d", &N);

    nLoop = N - 54 > 1 ? N - 54 : 1;

    for (; nLoop < N; nLoop++)
    {
        nSum = nLoop;
        nTarget = nLoop;

        while (nTarget > 0)
        {
            nSum += nTarget % 10;
            nTarget /= 10;
        }

        if (nSum == N) break;
    }

    if (nLoop >= N)
        printf("0\n");
    else
        printf("%d\n", nLoop);

    return 0;
}