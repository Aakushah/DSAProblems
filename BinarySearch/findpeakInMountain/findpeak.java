// Find a peak element which is not smaller than its neighbours

// Input: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.


public class findpeak {

    public static int findPeakInMountainFun(int arr[],int n){

        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;

        while(s < e){




                //   peak 
                //   /\
                //  /  \
                // /

            //if first line me ha hum 

           if(arr[mid] < arr[mid+1]){
            //go right
            s = mid+1;
           }

           else{
            // go left
            e=mid;
           }

           mid=s+(e-s)/2;


        }

        return e;

    }


    public static void main(String[] args) {
        int arr[] = new int[]{5, 10, 20, 15};
        int n=arr.length;

        System.out.println(findPeakInMountainFun(arr,n));
        
    }
    
}
