// Largest Sum Contiguous Subarray (Kadane’s Algorithm)


// – the subarray with negative sum is discarded (by assigning max_ending_here = 0 in code).

// – we carry subarray till it gives positive sum.


public class KadensAlgo {
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};

        int n=arr.length;

        
        int currentSum=0;
        int maxSum=0;

        for(int i=0;i<n;i++){

            currentSum+=arr[i];
            if(currentSum > maxSum){
                maxSum=currentSum;
            }



            if(currentSum < 0){
                currentSum=0;
            }
        }


        System.out.println(maxSum);
        
    }
    
}
