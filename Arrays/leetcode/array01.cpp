#include <iostream>
using namespace std;
int arr[5];// If the array is declared outside the main function, then it will be initialized with 0 values.
// The maximum size of the array, you can define is 10^7 if array is declared outside the int main() function
int main(){
    int arr[5]; // if the array is declared within the int main() function, then the array will be initialized with some random values
    // The maximum size of the array, you can define is 10^6 if array is declared within the int main() function because in C++, when you declare an array within a function, such as int main(), it is stored in the stack memory. The stack is a limited region of memory, and its size is typically smaller compared to the heap memory (where arrays declared outside functions are stored). The stack is used to store local variables, function call information, and other temporary data during the execution of a program.
    for(int i=0; i<5; i++){
        cout << arr[i] << endl; //It will print some random integers.
    }
}