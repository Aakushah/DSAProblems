public static ArrayList<Integer> topView(Node root){
        
        //     Queue<Pair> q=new ArrayDeque<>();
        //     Map<Integer,Integer> map=new TreeMap<>();
            
        //     q.add(new Pair(0,root));
        //     while(!q.isEmpty()){

        //         Pair curr=q.remove();
                
        //         if(! map.containsKey(curr.hd)){
        //             map.put(curr.hd,curr.node.data);
        //         }
                
        //         if(curr.node.left != null){
                    
        //             q.add(new Pair(curr.hd - 1,root.left));
                    
                    
        //         }
                
        //         if(curr.node.right !=  null){
        //             q.add(new Pair(curr.hd + 1,root.right));
        //         }

        //     }
            
            
        //     ArrayList<Integer> ans=new ArrayList<>();


        //     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //         ans.add(entry.getValue());
        //     }
            
            
        //     return ans;
            
            
            
        // }