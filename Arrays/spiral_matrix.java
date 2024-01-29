import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        
        while (result.size() < m * n) {
            for (int j = left; j <= right && result.size() < m * n; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            
            for (int i = top; i <= bottom && result.size() < m * n; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            for (int j = right; j >= left && result.size() < m * n; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            
            for (int i = bottom; i >= top && result.size() < m * n; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
        
    }
}

