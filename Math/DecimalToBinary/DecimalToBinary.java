
public class DecimalToBinary {

    public static int  DToB(int n){

        int m=n;
        int ans=0;
        int i=0;
        while(m != 0){
            
            int Lbit=m & 1;

            ans=Lbit*(int)Math.pow(10,i)+ans;
            i++;

            m=m>>1;



        }

        return ans;

    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(DToB(n));
        
    }
    
}
