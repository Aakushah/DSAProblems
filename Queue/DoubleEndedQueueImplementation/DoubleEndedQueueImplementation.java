class CircularQueue{

    int front;
    int rear;
    int capacity;
    int arr[];

    CircularQueue(int capacity){
        front=rear=-1;
        this.capacity=capacity;
        arr=new int[capacity];
    }

    //enqueue function
    void enqueue(int data){

        if(iSfull()){
            System.out.println("queue is overflow");
            return;
        }
        if(front == -1){
            front=0;
        }
        rear=(rear + 1)% capacity;
        arr[rear]=data;


    }

    //dequeue function

    int  dequeue(){

        if(isEmpty()){
            System.out.println("queue is under flow");
            return -1;

            
        }
        int temp=arr[front];
        if(front == rear){
            front=rear=-1;
            return temp;
            
        }
        front=(front + 1)%capacity;


        return temp;

    }


    //display function

    void display(){
        int i=front;

        if(front == -1 && rear == -1){
            System.out.println("Queue is empty");
            return ;
        }
  
        while(i != rear){
            System.out.println(arr[i]+" ");
            i=(i+1)%capacity;

        }

        System.out.println(arr[rear]);




    }



    //isempty function

    boolean isEmpty(){
        if(front == -1 && rear== -1){
            return true;
        }

        return false;
    }


    //iffull function

    boolean iSfull(){

        if((rear+1)%capacity == front){
            return true;
        }

        return false;
    }

}

public class DoubleEndedQueueImplementation {
    public static void main(String[] args) {

        CircularQueue cq= new CircularQueue(5);
    
        cq.enqueue(1);
        cq.enqueue(1);
        cq.enqueue(1);
        cq.enqueue(1);
        cq.display();

        
        


    }
    
}
