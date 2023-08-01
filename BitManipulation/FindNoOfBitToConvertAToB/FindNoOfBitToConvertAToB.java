
public class FindNoOfBitToConvertAToB {

    public static void FindNoOfBitToConvertAToBFun(int a,int b){
        int m=a^b;

        int ans=0;
        while(m != 0){
            if( (m & 1) != 0 ){
                ans++;
            }

            m=m>>1;

        }


        System.out.println(ans);



        

    }
    public static void main(String[] args) {
        int a=7;
        int b=10;


        FindNoOfBitToConvertAToBFun(a,b);

        
    }
    
}
