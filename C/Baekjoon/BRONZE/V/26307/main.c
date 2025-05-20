#include <stdio.h>

int main()
{
    int nHH, nMM;
    int nTotalTime;
    int nStartHH = 9;
    int nStartMM = 0;

    scanf("%d %d", &nHH, &nMM);

    nHH = (nHH - nStartHH) * 60;
    nTotalTime = nHH + nMM;

    printf("%d\n", nTotalTime);

    return 0;
}