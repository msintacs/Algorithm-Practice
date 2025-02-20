#include <stdio.h>
#include <string.h>

int main()
{
    int i, j;
    int nLoop;
    int nTemp;
    int nPlus;
    int nScore;
    char sInput[81];

    scanf("%d", &nLoop);

    for (i = 0; i < nLoop; i++)
    {
        scanf("%s", sInput);

        nTemp = 0;
        nScore = 0;
        nPlus = 0;
        for (j = 0; j < strlen(sInput); j++)
        {
            if (j == 0)
            {
                if (sInput[j] == 'O')
                {
                    nScore++;
                }
                continue;
            }

            nTemp = sInput[j - 1];

            if (sInput[j] == 'O')
            {
                nScore++;
                if (sInput[j] == nTemp)
                {
                    nPlus++;
                }
            }
            else
            {
                nPlus = 0;
            }

            nScore = nScore + nPlus;
        }

        printf("%d\n", nScore);
    }

    return 0;
}