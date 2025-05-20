#include "stdio.h"

void numToArr(int nTarget, int *nSize, int *naTarget)
{
    int naTemp[7];
    int nTempSize = 0;
    int nLoop;

    while (nTarget > 0)
    {
        naTemp[nTempSize++] = nTarget % 10;
        nTarget /= 10;
    }

    *nSize = nTempSize;

    for (nLoop = 0; nLoop < nTempSize; nLoop++)
    {
        naTarget[nLoop] = naTemp[nTempSize - nLoop - 1];
    }
}

int main()
{
    int N;
    int nTarget;
    int naTarget[7];
    int nSize;
    int nLoop;
    int nSum;

    scanf("%d", &N);

    nTarget = 1;
    for (nTarget; nTarget < N; nTarget++)
    {
        numToArr(nTarget, &nSize, naTarget);

        nSum = nTarget;
        for (nLoop = 0; nLoop < nSize; nLoop++)
        {
            nSum += naTarget[nLoop];
        }

        if (nSum == N)
        {
            break;
        }
    }

    if (nTarget >= N)
        printf("0\n");
    else
        printf("%d\n", nTarget);

    return 0;
}
