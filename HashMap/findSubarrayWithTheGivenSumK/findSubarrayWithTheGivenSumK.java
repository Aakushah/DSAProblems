
// Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
// Output: Sum found between indexes 1 and 4
// Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

// Input: arr[] = {1, 4}, sum = 0
// Output: No subarray found
// Explanation: There is no subarray with 0 sum


import java.util.HashMap;

public class findSubarrayWithTheGivenSumK {
    //brutforce approach
    // public static void findSubarrayWithTheGivenSumKFun(int arr[],int sum){
    //     int n=arr.length;
    //     int s=0;
    //     int e=-1;
    //     for(int i=0;i<n;i++){ 
    //         for(int j=i;j<n;j++){
    //             int ans=0;
    //             for(int k=i;k<=j;k++){
    //                 ans+=arr[k];
    //             }
    //             if(ans == sum){
    //                     s=i;
    //                     e=j;
    //                     break;
    //             }
    //         }
    //     }
    //     if(e==-1){
    //         System.out.println("no subarray found");
    //     }
    //     else{
    //         System.out.println("subarray with sum found between: "+s +" to "+e);
    //     }

    // }


    public static void findSubarrayWithTheGivenSumKFun(int arr[],int sum){
        int n=arr.length;
        int s=0;
        int e=-1;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int currentSum=0;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            //corner case chances of getting the sum from the index subarry.
            if(currentSum == sum){
                s=0;
                e=i;
                break;
            }
            while(hmap.containsKey(currentSum - sum)){
                s=hmap.get(currentSum - sum)+1;
                e=i;
                break;
            }
            hmap.put(currentSum,i);
        }

        if(e == -1){
            System.out.println("subarray not found");
        }
        else{
            System.out.println("subarray found between index:"+s +" to "+e);

        }

    }


    public static void main(String[] args) {

        int arr[]={1,4,0,0,3,10,5};
        int sum=15;

        findSubarrayWithTheGivenSumKFun(arr,sum);

        
        
    }
    
}
