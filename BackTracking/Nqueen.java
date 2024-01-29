import java.util.*;
public class Nqueen {
    public static boolean isSafe(int col,int row,int n,List<List<Character>> ans){
        for(int i=col;i>=0;i--){
            if(ans.get(row).get(i)=='Q'){
                return false;
            }
        }
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(ans.get(i).get(j)=='Q'){
                return false;
            }
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i<n && j>-1){
            if(ans.get(i).get(j)=='Q'){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void solveNQueen(int n,int col,List<List<Character>> ans){
        if(col==n){
            // printBoard(ans);
            count++;
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(col,row,n,ans)){
                ans.get(row).set(col,'Q');
                solveNQueen(n, col+1, ans);
                ans.get(row).set(col,'X');
            }
        }
    }
    public static void printBoard(List<List<Character>> ans){
        System.out.println("-------------------Chess Board-----------------");
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        List<Character> ls=new ArrayList<>();
        int n=5;
        for(int i=0;i<n;i++){
            ls.add('X');
        }
        List<List<Character>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>(ls));
        }
        solveNQueen(n, 0, ans);
        System.out.println(count);
    }
}
