#include <iostream>
using namespace std;

struct Node {
    int data;
    struct Node* next;

    Node(int val) {
        data = val;
        next = NULL;
    }
};

static struct Node* front = NULL;
static struct Node* rear = NULL;

void enqueue(int val) {
    struct Node* newNode = new Node(val);
    if (rear == NULL) {
        front = rear = newNode;
        return;
    }
    rear->next = newNode;
    rear = newNode;
}

int dequeue() {
    if (front == NULL) {
        cout << "Queue Underflow." << endl;
        return -1;
    }
    int temp = front->data;
    front = front->next;
    if (front == NULL) {
        rear = NULL;
    }
    return temp;
}

bool empty() {
    return front == NULL;
}

int frontValue() {
    if (front == NULL) {
        cout << "Queue is Empty." << endl;
        return -1;
    }
    return front->data;
}

void Display() {
    struct Node* temp = front;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
}

int main() {
    enqueue(5);
    enqueue(6);
    dequeue();
    cout << frontValue() << endl;
    Display();
    return 0;
}
