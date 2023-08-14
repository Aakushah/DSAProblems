
public class PrintFactorialOfN {

    public static int PrintFactorialOfNFun(int n){

        if( n == 1 ){
            return 1;
        }

        return n*PrintFactorialOfNFun(n-1);

    }

    public static void main(String[] args) {

        int n=5;

        int ans=PrintFactorialOfNFun(n);

        System.out.println("The factorial of "+n+" is: " +ans );
        
    }
    
}
