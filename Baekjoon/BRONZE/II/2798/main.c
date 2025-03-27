#include <stdio.h>
#include <stdlib.h>

int main()
{
    int N, M;
    int nLoopOne;
    int nLoopTwo;
    int nLoopThree;

    int *naCards;

    int nRes = 0;
    int nTemp = 0;

    scanf("%d %d", &N, &M);

    naCards = (int *)malloc(sizeof(int) * N);
    for (nLoopOne = 0; nLoopOne < N; nLoopOne++)
    {
        scanf("%d", &naCards[nLoopOne]);
    }

    for (nLoopOne = 0; nLoopOne < N; nLoopOne++)
    {
        for (nLoopTwo = nLoopOne + 1; nLoopTwo < N; nLoopTwo++)
        {
            for (nLoopThree = nLoopTwo + 1; nLoopThree < N; nLoopThree++)
            {
                nTemp = naCards[nLoopOne] + naCards[nLoopTwo] + naCards[nLoopThree];

                if (nTemp == M)
                {
                    printf("%d\n", nTemp);
                    return 0;
                }

                if (nTemp < M && nRes < nTemp)
                {
                    nRes = nTemp;
                }
            }
        }
    }

    printf("%d\n", nRes);

    free(naCards);

    return 0;
}