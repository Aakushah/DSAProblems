
public class PivotInAnArray {

    public static int findPivotIndex(int arr[],int n){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;

        while(s < e){
            if(arr[mid] > arr[0]){
                //pivot is in the right half
                s=mid+1;
            }
            else{
                e=mid;
            }


            mid=s+(e-s)/2;
        }


        return s;

    }

    public static void main(String[] args) {

   /*       
        9 /
       8 /
      7 /
THIS IS FIRST LINE

                  3 /
                 2 /
                1 /

                THIS IS SECOND LINE

    */
        int arr[]={7,9,1,2,3};

        int n=arr.length;
        System.out.println("pivot index: "+findPivotIndex(arr,n));


        
    }
    
}
