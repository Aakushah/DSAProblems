
import java.util.*;


public class BinaryToDecimal{

    public static int BtoD(int n){
        int m=n;

        int rem;
        int ans=0;
        int i=0;
        while(m != 0){

            rem=m%10;

            ans+=rem*Math.pow(2,i);
            i++;

            m=m/10;

            // System.out.println(m);

            
        }

        

        return ans;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(BtoD(n));
    }
}