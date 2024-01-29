#include <iostream>
using namespace std;

class Node{
    public:
        int data;
        Node* next;

        Node(int data){
            this->data=data;
            this->next=NULL;
        }
};

class LinkedList{
    public:
        Node* head;

        LinkedList(){
            this->head=NULL;
        }

        void addFirst(int data){
            Node* newNode = new Node(data);
            if(this->head==NULL){
                this->head=newNode;
                return;
            }
            Node* oldHead = head;
            this->head=newNode;
            this->head->next=oldHead;
        }
        void addAfterHead(int data){
            Node* newNode = new Node(data);
            Node* temp = this->head->next;
            this->head->next=newNode;
            newNode->next=temp;
        }

        void print(){
            Node* temp = head;
            while(temp!=NULL){
                cout<<temp->data<<" ";
                temp=temp->next;
            }
            cout<<endl;
        }
};

int main(){
    LinkedList ll;
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addFirst(35);
    ll.addFirst(45);
    ll.addFirst(50);
    ll.addAfterHead(25);
    ll.print();
}