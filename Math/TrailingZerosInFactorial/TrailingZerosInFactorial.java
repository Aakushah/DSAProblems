// Input: n = 5
// Output: 1 
// Factorial of 5 is 120 which has one trailing 0.

// Input: n = 20
// Output: 4
// Factorial of 20 is 2432902008176640000 which has
// 4 trailing zeroes.



public class TrailingZerosInFactorial {

    public static int TrailingZerosInFactorialFun(int n){

        int ans=0;
        for(int i=5;i<=n;i*=5){
            ans+=n/i;
        }

        return ans;

    }


    public static void main(String[] args) {
        int n=20;
        System.out.println(TrailingZerosInFactorialFun(n));
        
    }
    
}
