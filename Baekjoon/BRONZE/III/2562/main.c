#include <stdio.h>

int main()
{
    int i;
    int nTemp;
    int nMax = 0;
    int nIndex = 0;

    for (i = 0; i < 9; i++)
    {
        scanf("%d", &nTemp);
        if (nMax < nTemp)
        {
            nMax = nTemp;
            nIndex = i + 1;
        }
    }

    printf("%d\n", nMax);
    printf("%d\n", nIndex);

    return 0;
}