
public class PrintAToThePowerB {

    public static int PrintAToThePowerBFun(int a,int b){

        if( b == 0 ){
            return 1;
        }




        return a*PrintAToThePowerBFun(a, b-1);


    }
    public static void main(String[] args) {
        int a=10;
        int b=2;

        int ans=PrintAToThePowerBFun(a,b);
        System.out.println(ans);
    }
    
}
