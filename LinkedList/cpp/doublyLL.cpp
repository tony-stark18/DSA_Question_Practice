#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;

    Node(int val)
    {
        data = val;
        next = NULL;
        prev = NULL;
    }
};
static struct Node *head = NULL;
void insertAtBegining(int val)
{
    struct Node *newNode = new Node(val);
    if (head == NULL)
    {
        head = newNode;
        return;
    }
    head->prev = newNode;
    newNode->next = head;
    head = newNode;
}
void display()
{
    struct Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data;
        if (temp->next != NULL)
        {
            cout << " <-> ";
        }
        temp = temp->next;
    }
    cout << endl;
}

int main()
{
    insertAtBegining(1);
    insertAtBegining(2);
    insertAtBegining(3);
    insertAtBegining(4);
    insertAtBegining(5);
    display();
}