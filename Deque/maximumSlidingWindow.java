import java.util.*;

public class maximumSlidingWindow {

    //priority queue

    public static void maximumSlidingWindowUsingPriorityQueue(int arr[],int k){
            ArrayList<Integer> ans=new ArrayList<>();

            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

            int n=arr.length;
            int i=0;
            for(;i<k;i++){
                pq.add(arr[i]);


            }
            ans.add(pq.peek());

            for(;i<n;i++){
                pq.add(arr[i]);

                ans.add(pq.peek());


                pq.remove(arr[i-k+1]);

            }


            System.out.println(ans);

    }


    //Array dequeu

    public static void maximumSlidingWindowUsingArrayDeque(int arr[],int k){


        Deque<Integer> ad=new ArrayDeque<>();

        int n=arr.length;

        int i;
        for(i=0;i<k;i++){
            //remove the useless element from the window
            //shadow    source of light->     1 2 3    
            //not shadow   source of light->  3 2 1  
            while(!ad.isEmpty() && arr[i] >= arr[ad.peekLast()]){
                ad.removeLast();

            }
            ad.addLast(i);
        }

        for(;i<n;i++){
            System.out.print(arr[ad.peek()]+" ");


            //check and remove the element which are out of this window

            while(! ad.isEmpty() && ad.peek() <= i-k){
                 ad.removeFirst();
            }

            while(!ad.isEmpty() && arr[i] >= arr[ad.peekLast()]){
                ad.removeLast();

            }
            ad.addLast(i);


        }


        //print the elemnt of the last window

        System.out.print(arr[ad.peek()]+" ");

    }



    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };

        int k=3;

        maximumSlidingWindowUsingArrayDeque(arr,k);

        //ans=[4,5,5,5,3,3,3,2,5]

        // maximumSlidingWindowUsingPriorityQueue(arr,k);



        //brutforce approach

        // System.out.println();

        // for(int i=0;i<=arr.length-k;i++){
        //     int max=Integer.MIN_VALUE;

        //     for(int j=i;j<i+k;j++){

        //         if(arr[j]> max){
        //             max=arr[j];
        //         }

        //     }
        //     System.out.print(max+" ");
        // }

        
    }
    
}
