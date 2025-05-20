#include <stdio.h>

int main()
{
    int nMedalCount, nKidsCount;
    scanf("%d %d", &nMedalCount, &nKidsCount);
    printf("%s\n", (nMedalCount % nKidsCount == 0) ? "Yes" : "No");

    return 0;
}