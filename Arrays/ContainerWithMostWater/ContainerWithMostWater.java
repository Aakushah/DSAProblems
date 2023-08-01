public class ContainerWithMostWater {
    
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 5};

        int n=arr.length;


        int s=0;
        int e=n-1;
        int res=0;

        while(s < e){
           

            res= Math.max(res,Math.min(arr[s],arr[e])* (e-s));

            if(arr[s] < arr[e]){
                s++;
            }
            else{
                e--;
            }

        }

        System.out.println(res);


    }
    
}
