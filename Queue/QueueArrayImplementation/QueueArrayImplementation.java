class Queue{
    int rear;
    int front;
    int capacity;
    int arr[];

    Queue(int capacity){
        this.capacity=capacity;
        rear=-1;
        front=-1;
        arr=new int[capacity];

    }

    void enqueue(int data){
        
        if( rear == capacity-1){
            System.out.println("queue is overflow");
            return;
        }
        else if(rear == -1 && front ==-1){
            rear=front=0;
            arr[rear]=data;
            
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }

    int dequeue(){
        if(front == -1 && rear ==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        else if( rear == front){
            int temp =arr[rear];
            rear=front=-1;
            return temp;
        }
        else{
            int temp=arr[rear];
            front++;
            return temp;
        }

    }

    void display(){
        for(int i=front;i<=rear;i++){
        System.out.print(arr[i]+" ");
        }
    }




}

public class QueueArrayImplementation {

    public static void main(String[] args) {
        Queue q=new Queue(5);

        q.enqueue(13);
        q.enqueue(23);
        q.enqueue(33);
        q.enqueue(43);
        q.enqueue(53);
        q.dequeue();
        q.display();
        

        
        
    }
    
}
