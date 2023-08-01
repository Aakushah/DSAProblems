
public class FindSetBit {

    public static int SetBitFun(int n,int position){
        int m=1;
        int mask=m << position;

        n=n | mask;

        return n;

    }
    public static void main(String[] args) {
        int n=5;
        int position=1;

        System.out.println(SetBitFun(n,position));
    }
    
}
