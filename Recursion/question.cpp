#include <iostream>
// #include <algorithm>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[100];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int t;
    cin >> t;
    int k;
    cin >> k;
    int ind = 0;
    int mn = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] >= t)
        {
            ind = i;
            mn = abs(arr[i] - t);
            break;
        }
    }
    while(k>0){
        if(ind<n && abs(arr[ind]-t)<=mn){
            cout<<arr[ind];
            k--;
        }
        if(k>0 && (n-ind-2)>-1 && abs(arr[n-ind-2]-t)<=mn){
            cout<<arr[n-ind-2];
            k--;
        }
        mn=min(abs(arr[ind]-t),abs(arr[n-ind-2]-t));
        ind++;
    }

    return 0;
}