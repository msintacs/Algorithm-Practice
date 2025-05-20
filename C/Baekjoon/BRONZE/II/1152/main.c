#include <stdio.h>

int main()
{
    char sInput[1000001];
    int i;
    int nCount = 0;

    scanf("%[^\n]s", sInput);

    i = 0;
    while (sInput[i] != '\0')
    {
        if (i == 0 && sInput[i] == ' ')
        {
            i++;
            continue;
        }

        if (sInput[i] == ' ')
        {
            nCount++;
        }
        i++;
    }

    if (sInput[i - 1] == ' ')
    {
        nCount--;
    }

    printf("%d\n", nCount + 1);

    return 0;
}