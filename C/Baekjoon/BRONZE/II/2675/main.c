#include <stdio.h>
#include <string.h>

int main()
{
    int i, j, k;
    int nCase;
    int nLoop;
    char sInput[21];

    scanf("%d", &nCase);

    for (i = 0; i < nCase; i++)
    {
        scanf("%d %s", &nLoop, sInput);

        for (j = 0; j < strlen(sInput); j++)
        {
            for (k = 0; k < nLoop; k++)
            {
                printf("%c", sInput[j]);
            }
        }

        printf("\n");
    }

    return 0;
}