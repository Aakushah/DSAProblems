
public class PrintSumOfFirstNNaturalNumber {

    public static int PrintSumOfFirstNNaturalNumberFun(int n){


        if(n == 0){
            return 0;
        }

        return n+PrintSumOfFirstNNaturalNumberFun(n-1);


    }

    public static void main(String[] args) {
        int n=5;

        int ans=PrintSumOfFirstNNaturalNumberFun(n);
        System.out.println(ans);
    }
    
}
