package Twod_array;
import java.util.*;
public class spiral_matrix {
    public static void spiral_matrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int element=0;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        while(element<m*n){
            //left to right
            for(int i=left;i<=right && element<m*n;i++ ){
                System.out.print(matrix[top][i]+" ");
                element++;
            }
            top++;

            //top to bottom
            for(int i=top;i<=bottom && element<m*n;i++){
                System.out.print(matrix[i][right]+" ");
                element++;
            }
            right--;

            //right to left
            for(int i=right;i>=left && element<m*n;i--){
                System.out.print(matrix[bottom][i]+" ");
                element++;
            }
            bottom--;

            //bottom to top
            for(int i=bottom;i>=top && element<m*n;i--){
                System.out.print(matrix[i][left]+" ");
                element++;
            }
            left++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        spiral_matrix(matrix);
    }
}
