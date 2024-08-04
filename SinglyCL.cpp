#include <iostream>
using namespace std;

struct node 
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

class SinglyCL 
{
    private:
        PNODE First;
        PNODE Last;
        int iCount;
    public:
        SinglyCL();

        void Display();
        int Count();

        void InsertFirst(int No);
        void InsertLast(int No);
        void InsertAtPos(int No, int Pos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int Pos);
};

SinglyCL::SinglyCL() 
{
    First = NULL;
    Last = NULL;
    iCount = 0;
}

void SinglyCL::Display()
{
    if (First == NULL && Last == NULL)
    {
        cout << "LL is empty\n";
        return;
    }
    do {
        cout << "|" << First->data << "|->";
        First = First->next;
    } while (First != Last->next);
    cout << endl;
}

int SinglyCL::Count() 
{
    return iCount;
}

void SinglyCL::InsertFirst(int No) 
{
    PNODE newn = new NODE;
    newn->data = No;
    newn->next = NULL;

    if (First == NULL && Last == NULL) 
    {
        First = newn;
        Last = newn;
    } else 
    {
        newn->next = First;
        First = newn;
    }
    Last->next = First;
    iCount++;
}

void SinglyCL::InsertLast(int No) 
{
    PNODE newn = new NODE;
    newn->data = No;
    newn->next = NULL;

    if (First == NULL && Last == NULL)
    {
        First = newn;
        Last = newn;
    } else 
    {
        Last->next = newn;
        Last = newn;
    }
    Last->next = First;
    iCount++;
}

void SinglyCL::InsertAtPos(int No, int Pos) 
{
    if (Pos < 1 || Pos > iCount + 1) {
        cout << "Invalid position\n";
        return;
    }
    if (Pos == 1) 
    {
        InsertFirst(No);
    } else if (Pos == iCount + 1) 
    {
        InsertLast(No);
    } else 
    {
        PNODE newn = new NODE;
        newn->data = No;
        newn->next = NULL;

        PNODE temp = First;
        for (int i = 1; i < Pos - 1; i++) {
            temp = temp->next;
        }
        newn->next = temp->next;
        temp->next = newn;
        iCount++;
    }
}

void SinglyCL::DeleteFirst() 
{
    if (First == NULL && Last == NULL) 
    {
        return;
    } else if (First == Last) 
    {
        delete First;
        First = NULL;
        Last = NULL;
    } else 
    {
        PNODE temp = First;
        First = First->next;
        delete temp;
        Last->next = First;
    }
    iCount--;
}

void SinglyCL::DeleteLast() 
{
    if (First == NULL && Last == NULL) 
    {
        return;
    } else if (First == Last) 
    {
        delete First;
        First = NULL;
        Last = NULL;
    } else 
    {
        PNODE temp = First;
        while (temp->next != Last) 
        {
            temp = temp->next;
        }
        delete Last;
        Last = temp;
        Last->next = First;
    }
    iCount--;
}

void SinglyCL::DeleteAtPos(int Pos) 
{
    if (Pos < 1 || Pos > iCount) {
        cout << "Invalid position\n";
        return;
    }
    if (Pos == 1) 
    {
        DeleteFirst();
    } else if (Pos == iCount) 
    {
        DeleteLast();
    } else 
    {
        PNODE temp1 = First;
        for (int i = 1; i < Pos - 1; i++) 
        {
            temp1 = temp1->next;
        }
        PNODE temp2 = temp1->next;
        temp1->next = temp2->next;
        delete temp2;
        iCount--;
    }
}

int main() 
{
    SinglyCL obj;

    int iRet = 0;

    obj.InsertFirst(51);
    obj.InsertFirst(21);
    obj.InsertFirst(11);

    obj.Display();
    iRet = obj.Count();
    cout << "Number of nodes: " << iRet << endl;

    obj.InsertLast(101);
    obj.InsertLast(151);
    obj.InsertLast(201);

    obj.Display();

    iRet = obj.Count();
    cout << "Number of nodes: " << iRet << endl;

    obj.InsertAtPos(251, 5);

    obj.Display();

    iRet = obj.Count();
    cout << "Number of nodes: " << iRet << endl;

    obj.DeleteAtPos(5);

    obj.Display();

    iRet = obj.Count();
    cout << "Number of nodes: " << iRet << endl;

    return 0;
}
