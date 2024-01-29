public class set_matrix_zero {
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]!=0 || col[j]!=0){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        printMatrix(matrix);
    }
}
