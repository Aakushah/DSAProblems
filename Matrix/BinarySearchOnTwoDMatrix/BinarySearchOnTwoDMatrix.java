
public class BinarySearchOnTwoDMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length;
        int col=matrix[0].length;
        int s=0;
        int e=row*col-1;

        int mid=s+(e-s)/2;

        while( s <= e){

            //use to fetch the element from matrix
            int element=matrix[mid/col][mid%col];
            if(element == target){
                return true;
            }
            else if(element > target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }

        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}
                    };

        int target=11;

        System.out.println(searchMatrix(matrix,target));

    }
    
}
