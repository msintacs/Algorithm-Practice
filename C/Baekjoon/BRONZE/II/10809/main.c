#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i;
    int nAlphabet[26];
    char sInput[101];

    memset(nAlphabet, -1, sizeof(nAlphabet));

    scanf("%s", sInput);

    for (i = 0; i < strlen(sInput); i++)
    {
        if (nAlphabet[sInput[i] - 'a'] == -1)
        {
            nAlphabet[sInput[i] - 'a'] = i;
        }
    }

    for (i = 0; i < 26; i++)
    {
        printf("%d ", nAlphabet[i]);
    }

    printf("\n");

    return 0;
}