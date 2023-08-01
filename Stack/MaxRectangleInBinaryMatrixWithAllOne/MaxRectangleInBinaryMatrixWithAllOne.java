import java.util.*;

public class MaxRectangleInBinaryMatrixWithAllOne{

    
    public static int[] getPreviousSmaller(int arr[]){

        Stack<Integer> s=new Stack<>();
        int ps[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){


            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }

            if(s.isEmpty()){
                ps[i]=-1;
            }

            else{
                ps[i]=s.peek();
            }

            s.push(i);


        }
        s.clear();

        return ps;



    }
    public static int[] getNextSmaller(int arr[]){

        Stack<Integer> s=new Stack<>();
        int ns[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){


            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }

            if(s.isEmpty()){
                ns[i]=-1;
            }

            else{
                ns[i]=s.peek();
            }

            s.push(i);

        }

        s.clear();

        return ns;



    }

    
    public static int largestRectangleArea(int[] heights) {

        int pSIndex[]=getPreviousSmaller(heights);
        
        for(int i:pSIndex){
            System.out.print(i+" ");
        }
        System.out.println();


        int nSIndex[]=getNextSmaller(heights);

        for(int i:nSIndex){
            System.out.print(i+" ");
        }
        System.out.println();


        int maxAns=0;
        for(int i=0;i<heights.length;i++){
            int max=(nSIndex[i]-pSIndex[i]-1)*heights[i];
            
            maxAns=Math.max(max,maxAns);
            


        }

        return maxAns;


        
    }
    public static void main(String[] args) {
        int a[]={2,1,5,6,2,3};



        System.out.println(largestRectangleArea(a));
        
    }
}

// import java.util.Stack;

// public class MaxRectangleInBinaryMatrixWithAllOne {

//      public static int[] getPreviousSmallerIndex(int arr[]){

//         int previousSmallerIndex[]=new int[arr.length];

//         Stack<Integer> s=new Stack<>();


//         for(int i=0;i<arr.length;i++){

//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){

//                 s.pop();

//             }


//             if(s.isEmpty()){

//                 previousSmallerIndex[i]=-1;

                
//             }
//             else{
//                 previousSmallerIndex[i]=s.peek();
                
//             }

//             s.push(i);

//         }

//         s.clear();

//         return previousSmallerIndex;


        
//     }
//     public static int[] getNextSmallerIndex(int arr[]){

//         int nextSmallerIndex[]=new int[arr.length];
//         Stack<Integer> s=new Stack<>();
//         for(int i=arr.length-1;i>=0;i--){

//           while(!s.isEmpty() && arr[s.peek()] >= arr[i]){

//               s.pop();

//           }

//           if(s.isEmpty()){

//               nextSmallerIndex[i]=arr.length;
         
//           }

//           else{
//               nextSmallerIndex[i]=s.peek();
              
//           }

//           s.push(i);

//       }

//       s.clear();

//       return nextSmallerIndex;


//   }

//   public static int LargestRectangularInHistogram(int arr[]){

//         int ns[]=getNextSmallerIndex(arr);

        
//         int ps[]=getPreviousSmallerIndex(arr);
        

//         int area=0;

//         for(int i=0;i<arr.length;i++){

//             area=Math.max( (ns[i]-ps[i]-1)* arr[i],area);




//         }

//         return area;

//   }


//     public static int maxRect(int arr[][]){
//         int r=arr.length;
//         int c=arr[0].length;

//         //create a new array .
//         int curCum[]=new int[c];


//         // slice the first row of arr
//         for(int i=0;i<1;i++){
//             for(int j=0;j<c;j++){
//                 curCum[j]=arr[i][j];
//             }
         
//         }

//         int maxAns=LargestRectangularInHistogram(curCum);
       

//         for(int i=1;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(arr[i][j] == 1){
//                     curCum[j]+=1;
//                 }
//                 else{
//                     curCum[j]=0;
//                 }
//             }

//             int curAns=LargestRectangularInHistogram(curCum);
//             for(int k:curCum){
//                 System.out.print(k+" ");
//             }
//             System.out.println(" ");

//             maxAns=Math.max(maxAns,curAns);


//         }


//         return maxAns;

//     }
//     public static void main(String[] args) {

//         int A[][] = {
//             { 0, 1, 1, 0 },
//             { 1, 1, 1, 1 },
//             { 1, 1, 1, 1 },
//             { 1, 1, 0, 0 },
//         };

//         System.out.println(maxRect(A));
        
//     }
    
// }
