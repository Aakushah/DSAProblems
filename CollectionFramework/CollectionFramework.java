

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class CollectionFramework {

    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>(); 
        Map<String,Integer> tm=new TreeMap<>(); 

        hm.put("abc",1);
        hm.put("def",2);
        hm.put("ghi",3);
        hm.put("jkl",5);
        hm.put("mno",6);
        hm.put("pqr",7);
        System.out.println(hm);

        tm.put("abc",1);
        tm.put("def",2);
        tm.put("ghi",3);
        tm.put("jkl",5);
        tm.put("mno",6);
        tm.put("pqr",7);

        System.out.println(tm);


        //iterating over hashmap

        /* 
        for(Map.Entry<String,Integer> e:hm.entrySet()){

            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        for(String e: hm.keySet()){
            System.out.println(e+" ");
        }
        for(Integer e: hm.values()){
            System.out.println(e+" ");
        }

        */

        int arr[]={11,2,3,5,9,12};

        //quick sort
        Arrays.sort(arr);
        Arrays.binarySearch(arr,1);
        Arrays.fill(arr,0);

        for(int i:arr){
            System.out.print(i+" ");
        }



    }
    
}
