import java.util.*;

public class LargestRectangularInHistogram {

     

    public static int[] getPreviousSmallerIndex(int arr[]){

        int previousSmallerIndex[]=new int[arr.length];

        Stack<Integer> s=new Stack<>();


        for(int i=0;i<arr.length;i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){

                s.pop();

            }


            if(s.isEmpty()){

                previousSmallerIndex[i]=-1;

                
            }
            else{
                previousSmallerIndex[i]=s.peek();
                
            }

            s.push(i);

        }

        s.clear();

        return previousSmallerIndex;


        
    }

    public static int[] getNextSmallerIndex(int arr[]){

          int nextSmallerIndex[]=new int[arr.length];
          Stack<Integer> s=new Stack<>();
          for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){

                s.pop();

            }

            if(s.isEmpty()){

                nextSmallerIndex[i]=arr.length;
           
            }

            else{
                nextSmallerIndex[i]=s.peek();
                
            }

            s.push(i);

        }

        s.clear();

        return nextSmallerIndex;


    }

    public static void main(String[] args) {

        // int arr[]={4,2,1,5,6,3,2,4,2};
        int arr[]={3,4,3,2};

     

        int ns[]=getNextSmallerIndex(arr);

        
        int ps[]=getPreviousSmallerIndex(arr);
        

        int area=0;

        for(int i=0;i<arr.length;i++){

            area=Math.max( (ns[i]-ps[i]-1)* arr[i],area);




        }


        System.out.println(area);
        
    }
    
}
