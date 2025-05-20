#include <stdio.h>

int main()
{
    int hh, mm;

    scanf("%d %d", &hh, &mm);

    mm = mm - 45;
    if (mm < 0)
    {
        mm = 60 + mm;
        hh--;
    }

    if (hh < 0)
    {
        hh = 24 + hh;
    }

    printf("%d %d\n", hh, mm);

    return 0;
}