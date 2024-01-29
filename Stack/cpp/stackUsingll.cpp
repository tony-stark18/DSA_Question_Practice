#include <iostream>
using namespace std;
struct Node{
    int data;
    struct Node* next;
    //constructor

    Node(int val){
        data = val;
        next = NULL;
    }
};
static struct Node* head = NULL;
void push(int val){
    struct Node* newNode = new Node(val);
    if(head==NULL){
        head = newNode;
        return;
    }
    newNode->next = head;
    head = newNode;
}
int pop(){
    if(head==NULL){
        cout<<"Stack Underflow.";
        return -1;
    }
    int temp = head->data;
    head = head->next;
    return temp;
}
bool empty(){
    return head==NULL;
}
int top(){
    if(head==NULL) {
        cout<<"Stack is Empty.";
        return -1;
    }
    return head->data;
}
void Display(){
    struct Node* temp = head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp= temp->next;
    }
}
int main(){
    push(5);
    push(6);
    pop();
    cout<<top()<<endl;
    Display();
}