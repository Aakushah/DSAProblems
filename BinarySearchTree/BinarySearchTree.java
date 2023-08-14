

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

public class BinarySearchTree {

    static class BST{

        //inoder sucessor of some data in bst
        public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          
          
              Node ans=null;
              
              while(root != null){
                  if(root.data <= x.data){
                      //we will seek for the inorder sucessor of x so we move to the right path of bst
                      root=root.right;
                  }
                  else{
                      ans=root;
                      root=root.left;
                  }
              }
              
              return ans;
          
          
         }


        public static Node CreateInBst(int data,Node root){


            //create new node 
            if(root == null){
                return new Node(data);
            }

            else{
                if(data < root.data){
                    root.left=CreateInBst(data, root.left);
                }
                else{
                    root.right=CreateInBst(data, root.right);
                }
            }


            return root;
        }

        public static boolean SearchInBst(Node root,int key){




            if(root == null){
                return false;
            }

            if(root.data == key){
                return true;
            }

            else{

                if(key < root.data){
                    return SearchInBst(root.left,key);
                }
                else{
                    return SearchInBst(root.right,key);
                }

            }

        }

        public static Node  delete(Node root,int data){

            if(root == null){
                return null;
            }
            if(data < root.data){
                root.left=delete(root.left,data);
            }
            else if(data > root.data){
                root.right=delete(root.right,data);
            }

            else{
                //case 1:
                if(root.left == null && root.right== null){
                    return null;
                }

                //case 2:
                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }

                //case 3:
                Node Is= InOrderSucessor(root.right);
                root.data=Is.data;
                delete(root.right, data);

            }

            return root;

        }

        public static Node InOrderSucessor(Node root){

            Node currentNode=root;
            while(currentNode.left != null){
                currentNode=currentNode.left;

            }
            return currentNode;

        }


        public static boolean isBstSorted(Node root){
            return isBstSortedUntil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }

        public static boolean isBstSortedUntil(Node root,int min,int max){


            //if tree is null or has only one node
            if(root == null){

                return true;
            }
            //if tree is 

            if(root.data < min || root.data > max){
                return false;
            }

            return (isBstSortedUntil(root.left,min,root.data-1) && isBstSortedUntil(root.right,root.data + 1,max));



        }


        public static void inorderTraversal(Node root){

            if(root == null){
                return;
            }

            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);

        }


        
        public static int  getFloorValue(Node root,int data){


            int ceil=Integer.MIN_VALUE;

           
            while(root != null){
                if(root.data == data){
                    return root.data;
                }
                else if(data < root.data){
                    root=root.left;

                }
                else{
                    ceil=root.data;
                    root=root.right;

                }

            }

            return ceil;


        }
       

    }
    public static void main(String[] args) {

        int arr[]={40,30,50,25,35,45,60};
        Node root=null;
        BST tree=new BST();
        for(int i=0;i<arr.length;i++){
            root =tree.CreateInBst(arr[i],root);
        }

        tree.inorderTraversal(root);
        System.out.println();

        System.out.println("key present in bst:"+tree.SearchInBst(root,0));
        root=tree.delete(root,7);

        System.out.println("After deletetion of element from bst");

        tree.inorderTraversal(root);

        System.out.println();

        System.out.println("check is bst : "+ tree.isBstSorted(root));

    
        System.out.println(tree.getCeilValue(root,47));

        



        
    }
}
