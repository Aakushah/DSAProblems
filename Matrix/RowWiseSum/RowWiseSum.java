
public class RowWiseSum {

    public static void RowWiseSumFun(int arr[][]){

        

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];

            }
            System.out.print(sum+" ");
            

            
        }


    }

    public static void main(String[] args) {
        int array[][] = { {1, 1, 1, 1}, 
                       {2, 2, 2, 2}, 
                       {3, 3, 3, 3}, 
                       {4, 4, 4, 4}};


        RowWiseSumFun(array);



    }

    
}
