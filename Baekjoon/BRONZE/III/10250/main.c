#include <stdio.h>

int main()
{
    int T, H, W, N;
    int i, j, k;
    int nRow, nCol;
    int nTmp;

    scanf("%d", &T);

    for (i = 0; i < T; i++)
    {
        scanf("%d %d %d", &H, &W, &N);

        nRow = N % H;
        if (nRow == 0) nRow = H;

        nCol = (N - 1) / H + 1;
        if (nCol < 10)
        {
            printf("%d0%d\n", nRow, nCol);
        }
        else
        {
            printf("%d%d\n", nRow, nCol);
        }
    }

    return 0;
}