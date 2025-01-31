#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int A, B, C;
    char sTemp[10];

    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%d", &C);

    printf("%d\n", A + B - C);
    sprintf(sTemp, "%d%d", A, B);
    printf("%d\n", atoi(sTemp) - C);

    return 0;
}