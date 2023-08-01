// GCD(10, 15) = 5
// GCD(35, 10) = 5
// GCD(31, 2) = 1



public class EuclidGCD {
    public static int GCD(int a,int b){
        if (b == 0 ){
            return a;
        }
        return GCD(b,a%b);
    }
    public static void main(String[] args) {

        int a=35;
        int b=10;

        System.out.println(GCD(a,b)); 
        
    }
    
}
