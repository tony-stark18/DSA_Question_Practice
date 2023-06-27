class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int temp[]=new int[r-l+1];
         int lt=l;
         int rt=m+1;
         int k=0;
         while(lt<=m && rt<=r){
             if(arr[lt]<arr[rt]){
                 temp[k]=arr[lt];
                 lt++;
             }
             else{
                 temp[k]=arr[rt];
                 rt++;
             }
             k++;
         }
         while(lt<=m){
             temp[k]=arr[lt];
             lt++;
             k++;
         }
         while(rt<=r){
             temp[k]=arr[rt];
             rt++;
             k++;
         }
         for(int i=l;i<=r;i++){
             arr[i]=temp[i-l];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l==r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
