
public class LargestSumProblem {

    public static int  RowWiseSumFun(int arr[][]){

        
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];

            }

            max=Math.max(max,sum);
            
            

            
        }


        return max;


    }

    public static void main(String[] args) {

        int array[][] = { {15, 1, 1, 1}, 
                       {2, 2, 2, 2}, 
                       {3, 3, 3, 3}, 
                       {4, 4, 4, 4}};


        System.out.println(RowWiseSumFun(array));
        
    }
    
}
