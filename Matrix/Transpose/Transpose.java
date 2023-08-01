import java.util.ArrayList;
import java.util.List;

public class Transpose {

    public static void main(String[] args) {
        int arr[]={ 2, 3, 7, 9, 11, 2, 3, 11 };
    
        
        ArrayList<List<Integer>> matrix=new ArrayList<>();
        
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        
        System.out.println(matrix);
        int n=matrix.size();
        



        System.out.println("matrix before transpose");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.print(matrix.get(i).get(j)+" ");
  
            }
                System.out.println("");
            
        }
        


    //    //loop to transpose a matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                int temp=matrix.get(i).get(j);
                matrix.get(i).set(j,matrix.get(j).get(i));
                matrix.get(j).set(i,temp);
  
            }
                System.out.println("");
            
        }
        


        System.out.println("matrix after transpose");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.print(matrix.get(i).get(j)+" ");
  
            }
                System.out.println("");
            
        }
     
        
        
        //loop for swaping the first and the last rows
        
         for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){

                int temp=matrix.get(i).get(j);
                matrix.get(i).set(j,matrix.get(n-i-1).get(j));
                matrix.get(n-i-1).set(j,temp);
  
            }
                System.out.println("");
            
        }
        
       
        
    }
    
}
