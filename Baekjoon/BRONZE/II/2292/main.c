#include "stdio.h"

int main()
{
    int N;
    int nRes;
    int nSum;
    int nTemp;
    int nSumValue;

    scanf("%d", &N);

    nRes = 1;
    nSum = 2;
    nTemp = 1;
    nSumValue = 6;

    while (1)
    {
        if (N == 1) break;

        nSum += nSumValue;
        nRes++;
        if (nTemp < N && nSum > N) break;
        nTemp = nSum - 1;
        nSumValue += 6;
    }

    printf("%d\n", nRes);

    return 0;
}