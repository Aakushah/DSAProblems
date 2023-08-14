// Input: arr[] = {1, 2, 1, 3, 4, 2, 3}, K = 4
// Output: 3 4 4 3
// Explanation: First window is {1, 2, 1, 3}, count of distinct numbers is 3
//                       Second window is {2, 1, 3, 4} count of distinct numbers is 4
//                       Third window is {1, 3, 4, 2} count of distinct numbers is 4
//                       Fourth window is {3, 4, 2, 3} count of distinct numbers is 3

// Input: arr[] = {1, 2, 4, 4}, K = 2
// Output: 2 2 1
// Explanation: First window is {1, 2}, count of distinct numbers is 2
//                       First window is {2, 4}, count of distinct numbers is 2
//                       First window is {4, 4}, count of distinct numbers is 1



public class countDistinctElementInEveryWindowOfSizeK {

    public static void countDistinctElementInEveryWindowOfSizeKFun(int arr[],int k){

        int n=arr.length;
        for(int i=0;i<=n-k;i++){

            int count=0;
            for(int j=i;j<i+k;j++){

                for(int l=j;l<=j;l++){
                    
                    if(arr[j]== arr[l]){

                    }


                }


            }
        }

    }
    public static void main(String[] args) {
        int arr[]={5,1,15,20,25};
        int k=4;

        int i,j,l;
        i=++arr[1];
        j=arr[1]++;
        l=arr[i++];

        System.out.println(i);
        System.out.println(j);
        System.out.println();

        // countDistinctElementInEveryWindowOfSizeKFun(arr,k);

        
    }
    
}
