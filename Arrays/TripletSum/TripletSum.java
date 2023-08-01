// Given an array and a value, find if there is a triplet in array 
// whose sum is equal to the given value. If there is such a triplet present in array,
//  then print the triplet and return true. Else return false.


import java.util.*;

public class TripletSum {
    public static boolean tripletSumFun(int arr[],int sum,int n){
        Arrays.sort(arr); //sorting the input array
        
        for(int i=0;i<n;i++){
            int x=sum-arr[i];
            int s=i+1;
            int e=n-1;
            while (s < e ){

                if(x == arr[s]+arr[e]){
                    return true;
                }
                else if(x > arr[s]+ arr[e]){
                    s++;
                }
                else{
                    e--;
                }
                

            }
        }

        return false;

    }

    public static void main(String[] args) {

        int arr[]={1, 2, 3, 4, 5};
        int sum = 9; 
        int n=arr.length;

        System.err.println(tripletSumFun(arr,sum,n));

        
    }
    
}
