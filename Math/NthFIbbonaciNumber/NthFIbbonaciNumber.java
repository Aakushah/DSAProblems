// Given a positive integer n, find the nth fibonacci number. Since the answer
// can be very large, return the answer modulo 1000000007.

// Example 1:

// Input: 
// n = 2
// Output: 
// 1 
// Explanation: 
// 1 is the 2nd number of fibonacci series.

public class NthFIbbonaciNumber {
    public static int findNthFibboNaciNumber(int n){

        int m=1000000007;
        int a=0;
        int b=1;
        int ans=a+b;

        for(int i=2;i<=n;i++){

            ans=(a+b)%m;
            a=b;
            b=ans;
        }

        return ans;

    }
    public static void main(String[] args) {

        int n=5;

        int ans=findNthFibboNaciNumber(n);
        System.out.println(ans);


        
    }
    
}
