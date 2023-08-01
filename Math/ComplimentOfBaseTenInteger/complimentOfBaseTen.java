
public class complimentOfBaseTen {

    public static int complimentOfBaseTenFun(int n){
        int m=n;
        
        int mask=0;

        while(m != 0){
            mask=(mask << 1) | 1;

            m= m >> 1;

        }

        return ~(n) & mask;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("compliment of base ten "+complimentOfBaseTenFun(n));
    }
    
}
