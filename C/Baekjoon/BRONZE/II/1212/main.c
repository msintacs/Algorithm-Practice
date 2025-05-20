#include <stdio.h>
#include <string.h>

#define MAX_LENGTH 333335

#define SUCCESS 0
#define FAIL_1 -1

/**d
 * @brief 10진수 수를 2진수로 변환한다.
 *
 * @param nDecimal 0 ~ 9 범위의 10진수
 * @param naBinary 8진수를 2진수로 변환하여 담을 배열
 * @param nStartFlag
 *
 * @details 인수로 받은 10진수의 수를 2진수로 변환합니다.
 *          값을 2로 나눈 나머지를 배열에 저장하고 해당 수를 2로 나눈 몫을 구한다. (0 이 될때까지 반복)
 *
 * @return int 결과 성공시 SUCCESS 반환, 결과 실패시 FAIL_1 반환
 */
int decimalToBinary(int nDecimal, int *naBinary, int nStartFlag)
{
    // 0 ~ 7 범위이므로 최대 3비트 안에서 해결 가능 (인덱스로 활용하기위해 i 는 2 부터 시작 [0, 1, 2])
    int i = 0;
    int j;
    int nPrinted = 0;

    memset(naBinary, 0, sizeof(int) * 3);

    while (nDecimal > 0)
    {
        naBinary[2 - i] = nDecimal % 2;
        nDecimal = nDecimal / 2;
        i++;
    }

    if (nStartFlag == 1)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d", naBinary[j]);
        }
    }
    else
    {
        for (j = 0; j < 3; j++)
        {
            if (nPrinted == 0 && naBinary[j] == 0)
            {
                continue;
            }
            printf("%d", naBinary[j]);
            nPrinted = 1;
        }
    }

    return SUCCESS;
}

/**
 * @brief 8진수를 2진수로 변환한다.
 *
 * @param sInput 사용자로부터 입력받은 값
 * @param naBinary 8진수를 2진수로 변환하여 담을 배열
 *
 * @details sInput 값을 자리수별로 분리하여 개별로 2진수 변환한다.
 *          이때, 0으로 시작할 시 0이 아닌 1로 시작할 수 있도록 startFlag 를 파라미터로 전달하여 구분짓게 한다.
 *
 * @return int 결과 성공시 SUCCESS 반환, 결과 실패시 FAIL_1 반환
 */
int octalToBinary(char *sInput, int *naBinary)
{
    int i;
    int nLength = strlen(sInput);
    int nStartFlag = 0;

    for (i = 0; i < nLength; i++)
    {
        if (sInput[i] < '0' || sInput[i] > '7')
        {
            return FAIL_1;
        }
    }

    for (i = 0; i < nLength; i++)
    {
        decimalToBinary(sInput[i] - '0', naBinary, nStartFlag);
        nStartFlag = 1;
    }

    printf("\n");

    return SUCCESS;
}

int main()
{
    char sInput[MAX_LENGTH];
    int naBinary[3];
    int nCode;

    scanf("%s", sInput);

    if (strlen(sInput) == 1 && sInput[0] == '0')
    {
        printf("0\n");
        return SUCCESS;
    }

    nCode = octalToBinary(sInput, naBinary);
    if (nCode < 0)
    {
        printf("0\n");
        return FAIL_1;
    }

    return SUCCESS;
}