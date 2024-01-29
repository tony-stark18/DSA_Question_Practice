#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};

class Linkedlist
{

public:
    Node *head;
    Linkedlist()
    {
        this->head = NULL;
    }

    void append(int data)
    {
        Node *newNode = new Node(data);
        if (this->head == NULL)
        {
            this->head = newNode;
            return;
        }
        Node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
    }

    void addAtStart(int data)
    {
        Node *newNode = new Node(data);
        if (this->head == NULL)
        {
            this->head = newNode;
            return;
        }
        Node *oldHead = head;
        this->head = newNode;
        this->head->next = oldHead;
    }

    void insertAfter(int data1, int data2)
    {
        if (this->head == NULL)
        {
            Node *newNode = new Node(data2);
            cout << "List is Empty! Adding " << data2 << " at the start." << endl;
            this->head = newNode;
            return;
        }

        Node *temp = head;
        while (temp->data != data1 && temp->next != NULL)
        {
            temp = temp->next;
        }
        if (temp->data != data1)
        {
            cout << data1 << " doesn't exist in the LinkedList. Aborting Insertion" << endl;
            return;
        }

        Node *newNode = new Node(data2);
        newNode->next = temp->next;
        temp->next = newNode;
    }

    void deleteFromStart()
    {
        if (this->head == NULL)
        {
            cout << "LinkedList is already Empty. Couldn't delete data" << endl;
            return;
        }
        if (this->head->next == NULL)
        {
            delete (head);
            this->head = NULL;
            return;
        }
        Node *temp = head;
        this->head=this->head->next;
        delete(temp);
    }

    void deleteFromLast(){
        if (this->head == NULL)
        {
            cout << "LinkedList is already Empty. Couldn't delete data" << endl;
            return;
        }
        if (this->head->next == NULL)
        {
            delete (head);
            this->head = NULL;
            return;
        }
        Node* temp = head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        delete(temp->next);
        temp->next=NULL;

    }

    void deleteKey(int data){
        if (this->head == NULL)
        {
            cout << "LinkedList is already Empty. Couldn't delete data" << endl;
            return;
        }
        
    }

    void print()
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};

int main()
{
    Linkedlist *ll = new Linkedlist;
    ll->print();
    return 0;
}