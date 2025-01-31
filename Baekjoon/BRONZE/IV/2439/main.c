#include <stdio.h>

int main()
{
    int i, j, k, N;
    scanf("%d", &N);

    for (i = N; i > 0; i--)
    {
        for (j = i - 1; j > 0; j--)
        {
            printf(" ");
        }

        for (k = i - 1; k < N; k++)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}