#include<stdio.h>
#include<stdbool.h>

bool CheckAnagram(char str1[], char str2[])
{
    int Count1[26] = {0};
    int Count2[26] = {0};
    int i = 0;

    while(*str1 != '\0')
    {
        Count1[*str1 - 'a']++;
        str1++;
    }
    while(*str2 != '\0')
    {
        Count2[*str2 - 'a']++;
        str2++;
    }

    for(i = 0; i < 26; i++)
    {
        if(Count1[i] != Count2[i] )
        {
            break;
        }
    }

    if(i == 26)
    {
        return true;
    }
    else
    {
        return false;
    }
}

void CalculateFrequency(char str[])
{
    int Count[26]  = {0};
    int i = 0;

    while(*str != '\0')
    {
        Count[*str - 'a']++;
        str++;
    }
    while(*str != '\0')
    {
        Count[*str - 'a']++;
        str++;
    }

    for(i = 0; i < 26; i++)
    {
        if(Count[i] != 0)
        {
            printf("Frequency of %c is %d\n",'a'+i,Count[i]);
        }
    }
}
int main()
{
    char Arr[30];
    char Brr[30];
    bool bRet = false;
    printf("Enter the 1st String : \n");
    scanf("%s",Arr);

    printf("Enter the 2nd String : \n");
    scanf("%s",Brr);

    bRet = CheckAnagram(Arr,Brr);

    if(bRet == true)
    {
        printf("Strings are anagram\n");
    }
    else
    {
        printf("string are not anagram\n");
    }
    return 0;
}