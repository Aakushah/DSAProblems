public class FindBit {

    public static int FindBitFun(int n,int position){
        int m=1;

        int mask=m << position;

        if((n & mask) != 0){
            return 1;
        }
        else{
            return 0;
        }

    }
    
    public static void main(String[] args) {
        int n=5;
        int position=5;

        System.out.println(FindBitFun(n,position));

    }

    
}
