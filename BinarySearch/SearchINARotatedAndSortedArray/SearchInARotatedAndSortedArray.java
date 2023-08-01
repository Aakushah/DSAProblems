// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4


public class SearchInARotatedAndSortedArray {

    public static int binarySearch(int arr[],int s,int e,int target){

        int mid=s+(e-s)/2;

        while(s <= e){
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
                
            }
            mid=s+(e-s)/2;
        }

        return -1;

    }

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
    public static int searchRotatedArr(int arr[],int target){


        //pivot index
        int pI=findPivotIndex(arr,arr.length);
        

        int s=0;

        int e=arr.length-1;

        if(arr[pI] <= target && arr[e] >= target){
     
            return binarySearch(arr,pI,e,target);
        }
        
        else{
            return binarySearch(arr,0,pI-1,target);
        }

    }

    public static void main(String[] args) {


        //0,1,2,4,5,6,7
    
        int arr[]={4,5,6,7,0,1,2};

        int target=16;
        System.out.println("Index of the element is "+searchRotatedArr(arr,target));
        
    }
    
}
