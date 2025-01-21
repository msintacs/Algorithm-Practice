#include <stdio.h>

int main()
{
    int nCoinCount, nPrice;

    scanf("%d %d", &nCoinCount, &nPrice);

    nCoinCount = nCoinCount * 100;
    printf("%s\n", (nCoinCount >= nPrice) ? "Yes" : "No");

    return 0;
}