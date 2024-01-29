#include <iostream>
const int MAX_SIZE = 100;
using namespace std;

class heap{
    public:
        int arr[MAX_SIZE];
        int size;

        heap(){
            arr[0]=-1;
            size = 0;
        }
    void insertion(int val){
        size++;
        int index = size;
        arr[size] = val;
        while(index>1){
            int parent = index/2;
            if(arr[index]>arr[parent]){
                swap(arr[parent],arr[index]);
                index = parent;
            }
            else{
                return;
            }
        }
    }
    void deletefromheap(){
        if(size==0){
            cout<<"Nothing to delete";
            return;
        }
        arr[1] = arr[size];
        size--;

        //take root node to it's correct position
        int i=1;
        while(i<size){
            int leftind = 2*i;
            int rightind = 2*i+1;
            if(leftind<size && arr[i]<arr[leftind]){
                swap(arr[i],arr[leftind]);
                i=leftind;
            }
            else if(rightind<size && arr[i]<arr[rightind]){
                swap(arr[i],arr[rightind]);
                i = rightind;
            }
            else{
                return;
            }
        }
    }
    void heapify(int arr[],int n,int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;
        if(left<n && arr[largest]<arr[left]){
            largest = left;
        }
        if(right<n && arr[largest]<arr[right]){
            largest = right;
        }
        if(largest!=i){
            swap(arr[largest],arr[i]);
            heapify(arr,n,largest);
        }
    }
    void print(){
        for(int i=1;i<=size;i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
};
int main(){
    heap h;
    h.insertion(50);
    h.insertion(55);
    h.insertion(53);
    h.insertion(52);
    h.insertion(54);
    h.deletefromheap();
    h.print();
    return 0;
}