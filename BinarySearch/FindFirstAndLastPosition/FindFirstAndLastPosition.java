// Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}, x = 5
// Output : First Occurrence = 2
//               Last Occurrence = 5

// Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }, x = 7


public class FindFirstAndLastPosition {
    public static int FindFirstOccurance(int arr[],int x){
        
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        int temp=-1;

        while( s <= e){
            if(arr[mid] == x){
                temp=mid;
                e=mid-1;


            }
            else if(arr[mid] > x){
                e=mid - 1 ;
            }
            else{
                s=mid+1;
            }


            mid=s+(e-s)/2;

        }

        return temp;
    }
    public static int FindLastOccurance(int arr[],int x){
        
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        int temp=-1;

        while( s <= e){
            if(arr[mid] == x){
                temp=mid;
                s=mid+1;


            }
            else if(arr[mid] > x){
                e=mid - 1 ;
            }
            else{
                s=mid+1;
            }


            mid=s+(e-s)/2;

        }

        return temp;
    }

    
   

    public static void main(String[] args) {
        int arr[]={1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x=5;
        System.out.println("the first occurance of :" +x+": "+FindFirstOccurance(arr,x));
        System.out.println();
        System.out.println("the last occurance of :"+x+ ": "+FindLastOccurance(arr,x));
    }
    
}
