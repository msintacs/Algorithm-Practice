#include <stdio.h>

int main()
{
    int i, j;
    int nCount;
    int nInput;
    int nCheck;
    int nResult[10];

    for (i = 0; i < 10; i++)
    {
        scanf("%d", &nInput);
        nResult[i] = nInput % 42;
    }

    nCount = 10;
    for (i = 0; i < 10; i++)
    {
        nCheck = 0;
        for (j = i + 1; j < 10; j++)
        {
            if (nResult[i] == nResult[j])
            {
                nCheck++;
            }
        }

        if (nCheck > 0)
        {
            nCount--;
        }
    }

    printf("%d\n", nCount == 0 ? 1 : nCount);

    return 0;
}