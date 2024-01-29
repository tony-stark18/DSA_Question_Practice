import java.util.*;
public class union_of_two_arrays {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> ls = new ArrayList<>();
        int i=0;
        int j=0;
        int n1=a.length;
        int n2=b.length;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(ls.size()==0 || ls.get(ls.size()-1)!=a[i]){
                    ls.add(a[i]);
                }
                i++;
            }
            else{
                if(ls.size()==0 || ls.get(ls.size()-1)!=b[j]){
                    ls.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(ls.size()==0 || ls.get(ls.size()-1)!=a[i]){
                    ls.add(a[i]);
            }
            i++;
        }
        while(j<n2){
            if(ls.size()==0 || ls.get(ls.size()-1)!=b[j]){
                    ls.add(b[j]);
            }
            j++;
        }

        return ls;
    }
    public static void main(String[] args) {
        int a[]={3,3,4,5,6,7,8,9,9,9,};
        int b[]={2,4,10,10};
        List<Integer> ls = new ArrayList<Integer>();
        ls=sortedArray(a, b);
        System.out.println(ls);
    }
}
