public class Trapping_Rainwater {

    public static void main(String[] args) {

        int height[] = {4,2,0,3,2,5};
        
        // left side maximum
        // 4 4 4 4 4 5 

        // right side maximum
        // 5 5 5 5 5 5

        int n=height.length;


        int left[]=new int[n];
        int right[]=new int[n];

        
        left[0]=height[0];

        for(int i=1;i<n;i++){

            left[i]=Math.max(height[i],left[i-1]);

        }


        System.out.println("left side maximum");

        for(int i:left){
            System.out.print(i+" ");
        }
        System.out.println();

        
        right[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){

            right[i]=Math.max(height[i],right[i+1]);

        }


        System.out.println("right side maximum");

        for(int i:right){
            System.out.print(i+" ");
        }



        System.out.println();
        System.out.println("water it is able to trap after raining is: ");

        int res=0;
        for(int i=0;i<n;i++){

            res+=((Math.min(left[i],right[i]))-height[i]);


        }

        System.out.println(res);


        
    }
    
}
