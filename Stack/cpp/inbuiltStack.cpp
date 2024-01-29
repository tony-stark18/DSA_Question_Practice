#include<iostream>
#include<stack>
using namespace std;
int main(){
    stack<int> s;//declaration
    s.push(1);//it will push 1 to the top of the stack.
    s.push(2); //it will push 2 to the top of the stack.
    s.push(3);//order will be 3-2-1
    s.push(4);//order - 4-3-2-1
    s.pop();//it will remove 4 from the top of the stack. so order 3-2-1
    cout<<s.top()<<endl;//top func returns the top most element of the stack. Here 3
    cout<<s.empty()<<endl;//to check whether the stack is empty or not. Here it will return 0(false) as 3-2-1 are already in the stack.
    //to print all elements in array, take another temp stack, copy the original stack into that temporary stack then print the top element and pop from it untill it becomes empty. 
    stack<int> temp = s;
    cout<<"Elements in the stack are: ";
    while(!temp.empty()){
        cout<<temp.top()<<" ";
        temp.pop(); 
    }
    return 0;
}