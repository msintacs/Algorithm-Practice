#include <stdio.h>
#include <string.h>

int main()
{
    int A, B, C;
    int i;
    int nResult;
    char sResult[11];
    int nCount[10] = {0};

    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%d", &C);

    nResult = A * B * C;

    sprintf(sResult, "%d", nResult);

    for (i = 0; i < strlen(sResult); i++)
    {
        nCount[sResult[i] - '0']++;
    }

    for (i = 0; i < 10; i++)
    {
        printf("%d\n", nCount[i]);
    }

    return 0;
}