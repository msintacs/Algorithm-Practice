#include <stdio.h>

int main()
{
    int i, n;
    int nSum = 0;

    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        nSum += i;
    }

    printf("%d\n", nSum);

    return 0;
}