#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void reverse(char *naInput, int *naCalc, int nLeng)
{
    int nLoop;

    for (nLoop = 0; nLoop < nLeng; nLoop++)
    {
        naCalc[nLoop] = naInput[nLeng - 1 - nLoop] - '0';
    }
}

int main()
{
    int nLoop;
    char naInputA[10001];
    char naInputB[10001];

    scanf("%s %s", naInputA, naInputB);

    int nLengA = strlen(naInputA);
    int nLengB = strlen(naInputB);

    int *naCalcA = (int *)malloc(sizeof(int) * nLengA);
    int *naCalcB = (int *)malloc(sizeof(int) * nLengB);

    reverse(naInputA, naCalcA, nLengA);
    reverse(naInputB, naCalcB, nLengB);

    free(naCalcA);
    free(naCalcB);

    return 0;
}