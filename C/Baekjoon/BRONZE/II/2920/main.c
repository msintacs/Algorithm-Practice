#include <stdio.h>

int main()
{
    int i;
    int nTemp;
    int nInput = 0;
    int isAscending = 1;
    int isDescending = 1;

    for (i = 0; i < 8; i++)
    {
        scanf("%d", &nTemp);

        if (nInput != 0)
        {
            if ((nInput - nTemp) != -1)
            {
                isAscending = 0;
            }

            if ((nInput - nTemp) != 1)
            {
                isDescending = 0;
            }
        }

        nInput = nTemp;
    }

    if (isAscending == 1)
    {
        printf("ascending\n");
    }
    else if (isDescending == 1)
    {
        printf("descending\n");
    }
    else
    {
        printf("mixed\n");
    }

    return 0;
}