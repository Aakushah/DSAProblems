
public class ClearBit {

    public static int clearBitFun(int n,int position){
        int m=1;

        int mask=m << position;

        n=~(mask) & n;

        return n;
    }

    public static void main(String[] args) {
        int n = 10;
        int position=3;

        System.out.println(clearBitFun(n,position));
        
    }

    
}
