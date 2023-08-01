// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true


//row wise sorted and column wise sorted


public class SearchATwoDMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length;
        int col=matrix[0].length;

        int rowIndex=0;
        int colIndex=col-1;

        while(rowIndex < row && colIndex >= 0){

            int element =matrix[rowIndex][colIndex];

            if(element == target){
                return true;
            }

            else if(element < target){
                rowIndex++;

            }
            else{
                colIndex--;

            }

        }

        return false;
        
    }

    public static void main(String[] args) {
        int matrix[][] = { {-1,4,7,11,15},
                           {2,5,8,12,19},
                           {3,6,9,16,22},
                           {10,13,14,17,24},
                           {18,21,23,26,30}}; 

        int target=-1;

        System.out.println(searchMatrix(matrix,target));





    };
        
    
    
}
