#include <stdio.h>
#include <string.h>

int main()
{
    int i, N;
    char sInput[21];

    scanf("%d", &N);

    for (i = 0; i < N; i++)
    {
        scanf("%s", sInput);
        if (strlen(sInput) >= 6 && strlen(sInput) <= 9)
        {
            printf("yes\n");
        }
        else
        {
            printf("no\n");
        }
    }

    return 0;
}