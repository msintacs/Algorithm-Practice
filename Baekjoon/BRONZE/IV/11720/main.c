#include <stdio.h>

int main()
{
    int i, N;
    int nSum = 0;
    char sInput[101];

    scanf("%d", &N);
    scanf("%s", sInput);

    for (i = 0; sInput[i] != '\0'; i++)
    {
        nSum += (sInput[i] - '0');
    }

    printf("%d\n", nSum);

    return 0;
}