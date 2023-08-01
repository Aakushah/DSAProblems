// Find the two non-repeating elements in an array of repeating elements/ Unique Numbers 2

public class FindTwoNonRepeatingNumber {

    public static void FindTwoNonRepeatingNumberFun(int arr[],int n) {
        

        int a=0;
        int b=0;
        int res=0;
        for(int i=0;i<n;i++){
            res ^=arr[i];
        }

        //7^9

        // 7->0111
        // 9->1001
        // 7^9->1110
        
        //this will give the mask that has the right most index as 1
        int digit=res & ~(res-1);

        // digit ->0010

        for(int i=0;i<n;i++){
            if((digit & arr[i])  == 0){
                a^=arr[i];

                //4^9^4
            }
            else{
                b^=arr[i];
                //2^7^2
            }
        }

        System.out.println("Two numbers are "+a +" and "+b);
        
    }

    public static void main(String[] args) {
       int  arr[] = {2, 4, 7, 9, 2, 4};
       int n=arr.length;
       FindTwoNonRepeatingNumberFun(arr,n);
    }
    
}
