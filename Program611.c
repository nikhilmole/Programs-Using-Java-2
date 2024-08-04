#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void InsertFirst(PPNODE First, int No)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = No;
    newn->next = NULL;

    if(*First == NULL)
    {
        *First = newn;
    }
    else
    {
        newn->next = *First;
        *First = newn;
    }
}   

void Display(PNODE First)
{
    while(First != NULL)
    {
        printf("| %d |->",First->data);
        First = First -> next;
    }
    printf("NULL\n");
} 

int Count(PNODE First)
{
    int iCnt = 0;

    while(First != NULL)
    {
        iCnt++;
        First = First -> next;
    }
    return iCnt;
} 

int Addition(PNODE First)
{
    int iSum = 0;

    while(First != NULL)
    {
        iSum = iSum + (First->data);
        First = First->next;
    }
    return iSum;
}

int EvenCount(PNODE First)
{
    int iCount = 0;

    while(First != NULL)
    {
        if((First->data % 2) == 0)
        {
            iCount++;
        }
        First = First->next;
    }
    return iCount;
}

int OddCount(PNODE First)
{
    int iCount = 0;

    while(First != NULL)
    {
        if((First->data % 2) != 0)
        {
            iCount++;
        }
        First = First->next;
    }
    return iCount;
}

int Frequency(PNODE First, int No)
{
    int iCount = 0;

    while(First != NULL)
    {
        if(First->data == No)
        {
            iCount++;
        }
        First = First->next;
    }
    return iCount;
}

bool Search(PNODE First, int No)
{
   bool bflag = false;

   while(First != NULL)
   {
        if(First->data == No)
        {
            bflag = true;
            break;
        }
        First = First->next;
   }
   return bflag;
}

int SearchFirstOccurance(PNODE First, int No)
{
    int iCount = 1;
    int iPos = -1;

    while(First != NULL)
    {
        if(First->data == No)
        {
            iPos = iCount;
            break;
        }
        iCount++;
        First = First->next;
    }
    return iPos;
}

int SearchLastOccurance(PNODE First, int No)
{
    int iCount = 1;
    int iPos = -1;

    while(First != NULL)
    {
        if(First->data == No)
        {
            iPos = iCount;
        }
        iCount++;
        First = First->next;
    }
    return iPos;
}

void SumDigit(PNODE First)
{
    int iSum = 0;
    int iNo = 0;
    int iDigit = 0;

    while(First != NULL)
    {   
        iNo = First->data;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        printf("Addition is : %d\n",iSum);
        iSum = 0;
        First = First->next;
        
    }
}
void SumFactors(PNODE First)
{
    int iSum = 0;
    int iNo = 0;
    int i = 0;

    while(First != NULL)
    {   
        iNo = First->data;
        for(i = 1; i <= iNo/2; i++)
        {
            if((iNo % i) == 0)
            {
                iSum = iSum + i;
            }
        }
        printf("Sum of factor is : %d\n",iSum);
        iSum = 0;
        First = First->next;
    }
}
bool CheckPerfect(int iNo)
{
    int i = 0;
    int iSum = 0;
    for(i = 1; i <= iNo / 2; i++) 
    {
        if(iNo % i == 0) 
        {
            iSum += i; 
        }
    }
    if(iSum == iNo) 
    {
        return true;
    }
    else
    {
        return false;
    }
}

int MiddleElement(PNODE First)
{
    int iCnt = 0;
    PNODE temp = First;
    int iPos = 0;
    int i = 0;

    while(temp != NULL)
    {
        iCnt++;
        temp = temp->next;
    }

    iPos = iCnt / 2;

    for(i = 1; i <= iPos; i++)
    {
        First = First->next;
    }
    return First->data;
}

int main()
{
    PNODE Head = NULL;
    int iRet = 0;
    bool bRet = false;

    InsertFirst(&Head,42);
    InsertFirst(&Head,10);
    InsertFirst(&Head,50);
    InsertFirst(&Head,21);
    InsertFirst(&Head,10);
    InsertFirst(&Head,21);
    InsertFirst(&Head,11);
    
    Display(Head);

    iRet = Addition(Head);
    printf("Addition of all element is : %d\n",iRet);
    iRet = OddCount(Head);
    printf("Odd number of elements are : %d\n",iRet);
    iRet = EvenCount(Head);
    printf("Even number of element are  : %d\n",iRet);

    iRet = Frequency(Head,21);
    printf("Frequency is : %d\n",iRet);
    
    bRet = Search(Head,50);
    if(bRet == true)
    {
        printf("Number is present in the LL\n");
    }
    else
    {
        printf("Number is not present in the linked list\n");
    }

    iRet = SearchFirstOccurance(Head,21);
    if(iRet == -1)
    {
        printf("There is no such a element");
    }
    else
    {
        printf("First occurance of element is at : %d\n",iRet);
    }

    iRet = SearchLastOccurance(Head,21);
    if(iRet == -1)
    {
        printf("There is no such element\n");
    }
    else
    {
        printf("Last occurance element is :  %d\n",iRet);
    }

    SumDigit(Head);
    SumFactors(Head);
    iRet = MiddleElement(Head);
    printf("Middle element  is : %d",iRet);
    return 0;
}
