import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
 class Node{
        Node left,right;
        int data;

        Node(int data){
            this.data=data;
            left=right=null;
        }

}

class Pair {
        int hd;
        Node node;

        Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;

        }

    }

public class BuildBinaryTree {
    
    

    static class BinaryTree{

        static int index=-1;
        public static Node createTree(int arr[]){
            index++;

            if(arr[index] == -1){
                return null;
            }

            Node newNode=new Node(arr[index]);
            newNode.left = createTree(arr);
            newNode.right = createTree(arr);

            return newNode;
        }


        public static void preOrder(Node root){

            if(root == null){
                return;
            }
            System.out.print(root.data+" ");

            preOrder(root.left);
            preOrder(root.right);

        }
        public static void inOrder(Node root){

            if(root == null){
                return;
            }

            inOrder(root.left);            
            System.out.print(root.data+" ");
            inOrder(root.right);

        }
        public static void postOrder(Node root){

            if(root == null){
                return;
            }
            
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }

       public static int countOfNodes(Node root){

            if(root == null){
                return 0;
            }

            int leftNode=countOfNodes(root.left);
            int rightNode=countOfNodes(root.right);
        

            return leftNode + rightNode + 1;


       }
        public static int sumOfNodes(Node root){

            if(root == null){
                return 0;
            }

            int leftNode=sumOfNodes(root.left);
            int rightNode=sumOfNodes(root.right);
        

            return leftNode + rightNode + root.data;


       }


       //levelOrder traversal
       public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
                Node curr= q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left != null){
                        q.add(curr.left);   
                    }
                    if(curr.right != null){
                        q.add(curr.right); 
                    }
                }
      
            }
     
        }

       //height of tree

       public static int height(Node root){
           if(root == null){
                return 0;
           }
           
            return Math.max(height(root.left),height(root.right))+1; 
       }


    
       //diameter of tree in 0(n^2)


       //diameter of tree in 0(n)


       //top view of bt
       
       public static ArrayList<Integer> topView(Node root){
       
           ArrayList<Integer> ans=new ArrayList<>();
           if(root == null){
               return ans;
           }
           Queue<Pair> q=new ArrayDeque<>();
           Map<Integer,Integer> map=new TreeMap<>();
           
           q.add(new Pair(0,root));
           
           while(!q.isEmpty()){
               Pair curr=q.remove();
               
               if(! map.containsKey(curr.hd)){
                   map.put(curr.hd,curr.node.data);
               }
               
               if(curr.node.left != null){
                   
                   q.add(new Pair(curr.hd - 1,curr.node.left));
                   
                   
               }
               
               if(curr.node.right !=  null){
                   q.add(new Pair(curr.hd + 1,curr.node.right));
               }
           }
           
           
           
           for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               ans.add(entry.getValue());
           }
           return ans;   
       }

       public static ArrayList<Integer> bottomView(Node root){
       
           ArrayList<Integer> ans=new ArrayList<>();
           if(root == null){
               return ans;
           }
           Queue<Pair> q=new ArrayDeque<>();
           Map<Integer,Integer> map=new TreeMap<>();
           
           q.add(new Pair(0,root));
           
           while(!q.isEmpty()){
               Pair curr=q.remove();
               
               map.put(curr.hd,curr.node.data);
               
               if(curr.node.left != null){
                   
                   q.add(new Pair(curr.hd - 1,curr.node.left));
                   
                   
               }
               
               if(curr.node.right !=  null){
                   q.add(new Pair(curr.hd + 1,curr.node.right));
               }
           }
           
           
           
           for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               ans.add(entry.getValue());
           }
           return ans;   
       }




    }
 

    public static void main(String[] args) {

        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree=new BinaryTree();
        Node root=tree.createTree(arr);

        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();

        System.out.println("count of nodes: "+tree.countOfNodes(root));
        System.out.println("sum of nodes: "+tree.sumOfNodes(root));

        tree.levelOrder(root);

        System.out.println("height of tree is: "+ tree.height(root));

        ArrayList ans=tree.topView(root);
        System.out.println("top view of bt: "+ans);
        ans.clear();
        ans=tree.bottomView(root);
        System.out.println("bottom view of bt: "+ans);




        
    }


    
}
