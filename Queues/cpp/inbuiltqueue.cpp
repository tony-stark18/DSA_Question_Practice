#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q; // Declaration of a queue
    q.push(1); // Enqueue 1
    q.push(2); // Enqueue 2
    q.push(3); // Enqueue 3

    cout << "Front of the queue: " << q.front() << endl; // Get the front element, which is 1
    cout << "Size of the queue: " << q.size() << endl; // Get the size of the queue, which is 3
    cout << "Is the queue empty? " << q.empty() << endl; // Check if the queue is empty, which is not

    cout << "Elements in the queue are: ";
    while (!q.empty()) {
        cout << q.front() << " "; // Print the front element
        q.pop(); // Dequeue the front element
    }
    return 0;
}
