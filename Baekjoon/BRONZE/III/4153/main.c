#include <stdio.h>

int main()
{
    long a, b, c;

    while (1)
    {
        scanf("%d %d %d", &a, &b, &c);

        if (a == 0 && b == 0 && c == 0)
        {
            break;
        }

        a = a * a;
        b = b * b;
        c = c * c;

        if ((a + b) == c || (b + c) == a || (a + c) == b)
        {
            printf("right\n");
        }
        else
        {
            printf("wrong\n");
        }
    }

    return 0;
}