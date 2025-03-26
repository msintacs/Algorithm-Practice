#include "stdio.h"

int main()
{
    int N;
    int nLoop;
    int nCnt;
    int nValue;
    int nTmp;
    int isPrime;

    scanf("%d", &N);

    nCnt = 0;
    for (nLoop = 0; nLoop < N; nLoop++)
    {
        scanf("%d", &nValue);

        if (nValue == 1)
        {
            continue;
        }

        nTmp = nValue / 2;
        isPrime = 1;
        for (; nTmp > 0; nTmp--)
        {
            if (nTmp != 1 && nValue % nTmp == 0)
            {
                isPrime = 0;
                break;
            }
        }

        if (isPrime == 1)
        {
            nCnt++;
        }
    }

    printf("%d\n", nCnt);

    return 0;
}