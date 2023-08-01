
import java.util.*;

public class NearestSmallerElementOnLAndRSideOfAnArray {
    static Stack<Integer> s=new Stack<>();
    

    public static void previousSmallerElement(int arr[]){

        ArrayList<Integer> pS=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();


            }
            if(s.isEmpty()){
                pS.add(-1);
            }
            else{
                pS.add(s.peek());
            }


            s.push(arr[i]);


        }

        System.out.println(pS);

        s.clear();


    }

    public static void NextSmallerElement(int arr[]){


        ArrayList<Integer> nS=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();


            }
            if(s.isEmpty()){
                nS.add(-1);
            }
            else{
                nS.add(s.peek());
            }


            s.push(arr[i]);


        }

        Collections.reverse(nS);

        System.out.println(nS);




        s.clear();


    }

    

    public static void main(String[] args) {

        int arr1[]={4,10,5,8,20,15,3,12};

        // PREVIOUS SMALLER
        // [-1, 4, 4, 5, 8, 8, -1, 3]
        
        // NEXT SMALLER
        // [3, 5, 3, 3, 15, 3, -1, -1]




        // int arr2[]={3,10,5,1,15,10,7,6};
        
        previousSmallerElement(arr1);
        NextSmallerElement(arr1);
        
    }
    
}
