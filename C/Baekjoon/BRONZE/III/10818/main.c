#include <stdio.h>

int main()
{
    int i;
    int N;
    int nInput;
    int nMax = -1000000, nMin = 1000000;

    scanf("%d", &N);

    for (i = 0; i < N; i++)
    {
        scanf("%d", &nInput);

        if (nInput < nMin)
        {
            nMin = nInput;
        }

        if (nInput > nMax)
        {
            nMax = nInput;
        }
    }

    printf("%d %d\n", nMin, nMax);

    return 0;
}