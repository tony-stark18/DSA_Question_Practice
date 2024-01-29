#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
    Node(int val) : data(val), next(nullptr) {}
};

static struct Node *head = nullptr;

void insertAtBegining(int val)
{
    // Use the constructor to create a new node
    struct Node* newNode = new Node(val);
    newNode->next = head;
    head=newNode;
}

void append(int val)
{
    // Use the constructor to create a new node
    struct Node *newNode = new Node(val);
    if (head == nullptr)
    {
        head = newNode;
        return;
    }

    struct Node *temp = head;
    while (temp->next != nullptr)
    {
        temp = temp->next;
    }
    temp->next = newNode;
}

void removeFirst()
{
    if (head == nullptr)
    {
        cout << "Linkedlist is already empty." << endl;
        return;
    }
    struct Node *temp = head;
    head = head->next;
    delete temp; // Free memory of the removed node
}

void display()
{
    struct Node *temp = head;
    while (temp != nullptr)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

void removeLast()
{
    if (head == nullptr)
    {
        cout << "The linked list is already empty." << endl;
        return;
    }
    if (head->next == nullptr)
    {
        delete head; // Free memory of the only node
        head = nullptr;
        return;
    }
    struct Node *temp = head;
    while (temp->next->next != nullptr)
    {
        temp = temp->next;
    }
    delete temp->next; // Free memory of the last node
    temp->next = nullptr;
}

int main()
{
    insertAtBegining(5);
    insertAtBegining(1);
    insertAtBegining(2);
    insertAtBegining(3);
    insertAtBegining(4);
    append(10);
    display();
    removeFirst();
    removeLast();
    display();
    // cout<<head->data;
    return 0;
}
